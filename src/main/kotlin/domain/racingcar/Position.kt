package domain.racingcar

class Position(position: Int = START_POSITION) {
    var position = position
        private set

    fun forward() {
        position++
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Position

        if (position != other.position) return false

        return true
    }

    override fun hashCode(): Int {
        return position
    }

    companion object {
        private const val START_POSITION = 0
    }
}