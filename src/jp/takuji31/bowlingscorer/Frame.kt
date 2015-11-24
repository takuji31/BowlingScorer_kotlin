package jp.takuji31.bowlingscorer

/**
 * Created by takuji on 2015/11/24.
 */
sealed class Frame(val first: Score, val second: Score? = null) {
    open fun take(count: Int): Int {
        return when (count) {
            0 -> 0
            1 -> first.point
            else -> first.point + (second?.point ?: 0)
        }
    }

    open class NormalFrame(first: Score, second: Score? = null, val nextFrame: Frame? = null) : Frame(first = first, second = second) {
        override fun take(count: Int): Int {
            return when (count) {
                2 -> super.take(count) + (nextFrame?.take(count - 1) ?: 0)
                else -> super.take(count)
            }
        }
    }

    class TenFrame(first: Score, second: Score? = null, val third: Score? = null) : Frame(first = first, second = second) {
        override val point: Int
            get() = super.point + if (third != null) third.point else 0

        override fun take(count: Int): Int {
            return when (count) {
                3 -> super.take(count) + (third?.point ?: 0)
                else -> super.take(count)
            }
        }
    }

    class Strike(nextFrame: Frame? = null) : NormalFrame(first = Score.Strike(), second = null, nextFrame = nextFrame) {
        override val point: Int
            get() = super.point + if (nextFrame != null) nextFrame.take(2) else 0
    }

    class Spare(first: Score, nextFrame: Frame? = null) : NormalFrame(first = first, second = Score.Spare(10 - first.point), nextFrame = nextFrame) {
        override val point: Int
            get() = super.point + if (nextFrame != null) nextFrame.take(1) else 0
    }

    open val point: Int
        get() = if (second != null) first.point + second.point else first.point

    companion object {
        fun calculate(frame: Frame): Int {
            return when (frame) {
                is TenFrame -> frame.point
                is NormalFrame -> frame.point + if (frame.nextFrame != null) calculate(frame.nextFrame) else 0
            }
        }

        fun from(frames: List<Frame>): Frame {
            return when (frames.size) {
                0 -> throw IllegalArgumentException("frames cannot empty")
                1 -> frames.first()
                else -> {
                    val first = frames.first()
                    val f = frames.takeLast(frames.size - 1)
                    val nextFrame = from(f)
                    when (first) {
                        is TenFrame -> throw IllegalArgumentException("Ten frame must be last")
                        is Strike -> Strike(nextFrame)
                        is Spare -> Spare(first.first, nextFrame)
                        else -> NormalFrame(first.first, first.second, nextFrame)
                    }
                }
            }
        }
    }
}