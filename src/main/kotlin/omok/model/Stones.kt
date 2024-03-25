package omok.model

class Stones {
    private val _stones = mutableListOf<Stone>()
    val stones: List<Stone>
        get() = _stones.toList()

    fun add(stone: Stone) {
        _stones.add(stone)
    }

    fun lastStone(): Stone? = stones.lastOrNull()
}
