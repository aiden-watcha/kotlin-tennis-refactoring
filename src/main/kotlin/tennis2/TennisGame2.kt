package tennis2

import TennisGame

class TennisGame2(private val player1Name: String, private val player2Name: String) : TennisGame {
    private var player1Point: Int = 0
    private var player2Point: Int = 0

    private var player1Resource: String = ""
    private var player2Resource: String = ""

    override fun getScore(): String {
        var score = ""
        if (player1Point == player2Point && player1Point < 4) {
            if (player1Point == 0)
                score = "Love"
            if (player1Point == 1)
                score = "Fifteen"
            if (player1Point == 2)
                score = "Thirty"
            score += "-All"
        }
        if (player1Point == player2Point && player1Point >= 3)
            score = "Deuce"

        if (player1Point > 0 && player2Point == 0) {
            if (player1Point == 1)
                player1Resource = "Fifteen"
            if (player1Point == 2)
                player1Resource = "Thirty"
            if (player1Point == 3)
                player1Resource = "Forty"

            player2Resource = "Love"
            score = "$player1Resource-$player2Resource"
        }
        if (player2Point > 0 && player1Point == 0) {
            if (player2Point == 1)
                player2Resource = "Fifteen"
            if (player2Point == 2)
                player2Resource = "Thirty"
            if (player2Point == 3)
                player2Resource = "Forty"

            player1Resource = "Love"
            score = "$player1Resource-$player2Resource"
        }

        if (player1Point > player2Point && player1Point < 4) {
            if (player1Point == 2)
                player1Resource = "Thirty"
            if (player1Point == 3)
                player1Resource = "Forty"
            if (player2Point == 1)
                player2Resource = "Fifteen"
            if (player2Point == 2)
                player2Resource = "Thirty"
            score = "$player1Resource-$player2Resource"
        }
        if (player2Point > player1Point && player2Point < 4) {
            if (player2Point == 2)
                player2Resource = "Thirty"
            if (player2Point == 3)
                player2Resource = "Forty"
            if (player1Point == 1)
                player1Resource = "Fifteen"
            if (player1Point == 2)
                player1Resource = "Thirty"
            score = "$player1Resource-$player2Resource"
        }

        if (player1Point > player2Point && player2Point >= 3) {
            score = "Advantage player1"
        }

        if (player2Point > player1Point && player1Point >= 3) {
            score = "Advantage player2"
        }

        if (player1Point >= 4 && player2Point >= 0 && player1Point - player2Point >= 2) {
            score = "Win for player1"
        }
        if (player2Point >= 4 && player1Point >= 0 && player2Point - player1Point >= 2) {
            score = "Win for player2"
        }
        return score
    }

    override fun wonPoint(player: String) {
        when {
            player === "player1" -> player1Point++
            else -> player2Point++
        }
    }
}