package tennis1

import TennisGame

class TennisGame1(player1Name: String, player2Name: String) : TennisGame {

    private val player1 = TennisPlayer(player1Name)
    private val player2 = TennisPlayer(player2Name)

    private val players = mapOf(
            player1Name to player1,
            player2Name to player2
    )

    private val scoreTextFactory = ScoreTextFactory()

    override fun wonPoint(playerName: String) {
        players[playerName]?.plusScore()
    }

    override fun getScore(): String = scoreTextFactory.getScoreText(player1, player2).getText()

}
