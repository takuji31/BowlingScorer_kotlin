package jp.takuji31.bowlingscorer

/**
 * Created by takuji on 2015/11/24.
 */
sealed class Score(val point: Int) {
    open val label: String
        get() = point.toString()

    class NormalScore(point: Int) : Score(point = point)

    class Miss : Score(0) {
        override val label: String
            get() = "-"
    }

    class Foul : Score(0) {
        override val label: String
            get() = "F"
    }

    class Gutter : Score(0) {
        override val label: String
            get() = "G"
    }

    class Strike : Score(10) {
        override val label: String
            get() = "X"
    }

    class Spare(point: Int) : Score(point) {
        override val label: String
            get() = "/"
    }

    class Split(point: Int) : Score(point) {
        override val label: String
            get() = when(point) {
                5 -> "⑤"
                6 -> "⑥"
                7 -> "⑦"
                8 -> "⑧"
                else -> throw IllegalArgumentException("$point is wrong split score")
            }
    }
}