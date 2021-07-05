package tennis1

class AdvantageScoreText(
        private val player1: TennisPlayer,
        private val player2: TennisPlayer
) : ScoreText {

    override fun getText(): String {
        val minusResult = player1.score - player2.score
        return when {
            minusResult == 1 -> "Advantage ${player1.name}"
            minusResult == -1 -> "Advantage ${player2.name}"
            minusResult >= 2 -> "Win for ${player1.name}"
            else -> "Win for ${player2.name}"
        }
    }
}