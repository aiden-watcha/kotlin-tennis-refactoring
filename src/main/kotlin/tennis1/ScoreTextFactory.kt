package tennis1

class ScoreTextFactory {

    fun getScoreText(player1: TennisPlayer, player2: TennisPlayer): ScoreText {
        return when {
            isSameScore(player1, player2) -> SameScoreText(player1, player2)
            isAdvantageScore(player1, player2) -> AdvantageScoreText(player1, player2)
            else -> DefaultScoreText(player1, player2)
        }
    }

    private fun isSameScore(player1: TennisPlayer, player2: TennisPlayer) = player1.isSameScore(player2)

    private fun isAdvantageScore(player1: TennisPlayer, player2: TennisPlayer) =
            player1.isScoreUpperFour() || player2.isScoreUpperFour()

}
