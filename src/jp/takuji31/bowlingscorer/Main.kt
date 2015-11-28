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

            println("1st : ${Frame.calculate(Frame.from(arrayListOf(
                    Frame.NormalFrame(Score.NormalScore(2), Score.NormalScore(6)),
                    Frame.NormalFrame(Score.NormalScore(8), Score.NormalScore(1)),
                    Frame.NormalFrame(Score.NormalScore(4), Score.Miss),
                    Frame.NormalFrame(Score.NormalScore(6), Score.NormalScore(3)),
                    Frame.NormalFrame(Score.Split(8), Score.Miss),
                    Frame.NormalFrame(Score.NormalScore(2), Score.NormalScore(3)),
                    Frame.NormalFrame(Score.NormalScore(3), Score.NormalScore(4)),
                    Frame.NormalFrame(Score.NormalScore(6), Score.NormalScore(3)),
                    Frame.NormalFrame(Score.Split(8), Score.Miss),
                    Frame.TenFrame(Score.NormalScore(7), Score.NormalScore(1))
            )))}")
            println("2nd : ${Frame.calculate(Frame.from(arrayListOf(
                    Frame.Strike(),
                    Frame.Spare(Score.NormalScore(9)),
                    Frame.NormalFrame(Score.NormalScore(5), Score.Miss),
                    Frame.NormalFrame(Score.NormalScore(6), Score.NormalScore(3)),
                    Frame.NormalFrame(Score.NormalScore(9), Score.Miss),
                    Frame.Spare(Score.NormalScore(8)),
                    Frame.Spare(Score.Split(6)),
                    Frame.NormalFrame(Score.NormalScore(9), Score.Miss),
                    Frame.NormalFrame(Score.NormalScore(6), Score.NormalScore(3)),
                    Frame.TenFrame(Score.NormalScore(7), Score.NormalScore(2))
            )))}")
            println("3rd : ${Frame.calculate(Frame.from(arrayListOf(
                    Frame.NormalFrame(Score.NormalScore(1), Score.NormalScore(8)),
                    Frame.Spare(Score.NormalScore(7)),
                    Frame.Strike(),
                    Frame.Strike(),
                    Frame.Spare(Score.NormalScore(8)),
                    Frame.Spare(Score.NormalScore(8)),
                    Frame.NormalFrame(Score.NormalScore(5), Score.NormalScore(3)),
                    Frame.Spare(Score.NormalScore(8)),
                    Frame.Spare(Score.NormalScore(5)),
                    Frame.TenFrame(Score.NormalScore(7), Score.NormalScore(2))
            )))}")
            println("4th : ${Frame.calculate(Frame.from(arrayListOf(
                    Frame.NormalFrame(Score.NormalScore(9), Score.Miss),
                    Frame.NormalFrame(Score.NormalScore(5), Score.Miss),
                    Frame.NormalFrame(Score.NormalScore(7), Score.Miss),
                    Frame.Spare(Score.NormalScore(5)),
                    Frame.NormalFrame(Score.NormalScore(8), Score.NormalScore(1)),
                    Frame.NormalFrame(Score.NormalScore(6), Score.NormalScore(2)),
                    Frame.Spare(Score.NormalScore(6)),
                    Frame.NormalFrame(Score.NormalScore(6), Score.NormalScore(2)),
                    Frame.Strike(),
                    Frame.TenFrame(Score.NormalScore(9), Score.Spare(1), Score.NormalScore(8))
            )))}")
        }
    }
}