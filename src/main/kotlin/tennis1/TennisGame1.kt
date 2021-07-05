package tennis1

import TennisGame

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
        return when {
            player1Score == player2Score -> getScoreTextWhenSameScore()
            player1Score >= 4 || player2Score >= 4 -> getScoreTextForAdvantage()
            else -> getDefaultScoreText()
        }
    }

    private fun getScoreTextWhenSameScore(): String {
        return when (player1Score) {
            0 -> "Love-All"
            1 -> "Fifteen-All"
            2 -> "Thirty-All"
            else -> "Deuce"
        }
    }

    private fun getScoreTextForAdvantage(): String {
        val minusResult = player1Score - player2Score
        return when {
            minusResult == 1 -> "Advantage player1"
            minusResult == -1 -> "Advantage player2"
            minusResult >= 2 -> "Win for player1"
            else -> "Win for player2"
        }
    }

    private fun getDefaultScoreText() = "${getScoreTextByPlayerScore(player1Score)}-${getScoreTextByPlayerScore(player2Score)}"

    private fun getScoreTextByPlayerScore(score: Int) = when (score) {
        0 -> "Love"
        1 -> "Fifteen"
        2 -> "Thirty"
        3 -> "Forty"
        else -> ""
    }
}
