package tennis1

class SameScoreText(
        private val player1: TennisPlayer,
        private val player2: TennisPlayer
) : ScoreText {

    override fun getText(): String {
        return when (player1.score) {
            0 -> "Love-All"
            1 -> "Fifteen-All"
            2 -> "Thirty-All"
            else -> "Deuce"
        }
    }
}