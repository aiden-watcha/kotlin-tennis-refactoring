class TennisGame1(private val player1Name: String, private val player2Name: String) : TennisGame {

    private var player1Score: Int = 0
    private var player2Score: Int = 0

    override fun wonPoint(playerName: String) {
        when (playerName) {
            player1Name -> player1Score += 1
            player2Name -> player2Score += 1
        }
    }

    override fun getScore(): String {
        var score = ""
        var tempScore = 0
        if (player1Score == player2Score) {
            return getScoreWhenSameScore()
        } else if (player1Score >= 4 || player2Score >= 4) {
            return getScoreForAdvantage()
        } else {
            for (i in 1..2) {
                if (i == 1)
                    tempScore = player1Score
                else {
                    score += "-"
                    tempScore = player2Score
                }
                when (tempScore) {
                    0 -> score += "Love"
                    1 -> score += "Fifteen"
                    2 -> score += "Thirty"
                    3 -> score += "Forty"
                }
            }
        }
        return score
    }

    private fun getScoreForAdvantage(): String {
        val minusResult = player1Score - player2Score
        return when {
            minusResult == 1 -> "Advantage player1"
            minusResult == -1 -> "Advantage player2"
            minusResult >= 2 -> "Win for player1"
            else -> "Win for player2"
        }
    }

    private fun getScoreWhenSameScore(): String {
        return when (player1Score) {
            0 -> "Love-All"
            1 -> "Fifteen-All"
            2 -> "Thirty-All"
            else -> "Deuce"
        }
    }
}
