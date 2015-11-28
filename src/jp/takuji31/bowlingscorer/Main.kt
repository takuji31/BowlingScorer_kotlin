package jp.takuji31.bowlingscorer

/**
 * Created by takuji on 2015/11/24.
 */
class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("perfect : ${Frame.calculate(Frame.from(arrayListOf(
                    Frame.Strike(),
                    Frame.Strike(),
                    Frame.Strike(),
                    Frame.Strike(),
                    Frame.Strike(),
                    Frame.Strike(),
                    Frame.Strike(),
                    Frame.Strike(),
                    Frame.Strike(),
                    Frame.TenFrame(Score.Strike, Score.Strike, Score.Strike)
            )))}")
            println("nine spare : ${Frame.calculate(Frame.from(arrayListOf(
                    Frame.Spare(Score.NormalScore(9)),
                    Frame.Spare(Score.NormalScore(9)),
                    Frame.Spare(Score.NormalScore(9)),
                    Frame.Spare(Score.NormalScore(9)),
                    Frame.Spare(Score.NormalScore(9)),
                    Frame.Spare(Score.NormalScore(9)),
                    Frame.Spare(Score.NormalScore(9)),
                    Frame.Spare(Score.NormalScore(9)),
                    Frame.Spare(Score.NormalScore(9)),
                    Frame.TenFrame(Score.NormalScore(9), Score.Spare(1), Score.NormalScore(9))
            )))}")
        }
    }
}