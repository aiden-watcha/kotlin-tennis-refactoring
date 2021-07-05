package tennis1

class DefaultScoreText(
        private val player1: TennisPlayer,
        private val player2: TennisPlayer
) : ScoreText {

    override fun getText(): String {
        return "${getTextByScore(player1.score)}-${getTextByScore(player2.score)}"
    }

    private fun getTextByScore(score: Int) = when (score) {
        0 -> "Love"
        1 -> "Fifteen"
        2 -> "Thirty"
        3 -> "Forty"
        else -> ""
    }
}