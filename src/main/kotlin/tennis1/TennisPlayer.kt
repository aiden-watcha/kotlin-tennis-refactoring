package tennis1

data class TennisPlayer(
        val name: String,
        var score: Int = 0
) {
    fun plusScore() {
        score += 1
    }

    fun isSameScore(otherPlayer: TennisPlayer) = score == otherPlayer.score

    fun isScoreUpperFour() = score >= 4
}