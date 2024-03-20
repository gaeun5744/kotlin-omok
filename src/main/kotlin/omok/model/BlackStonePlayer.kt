package omok.model

class BlackStonePlayer() : Player() {
    override fun checkContinuity(stone: Stone): Boolean {
        val directions =
            arrayOf(
                Point(0, 1),
                Point(1, 0),
                Point(1, 1),
                Point(-1, 1),
            )

        directions.forEach { direction ->
            var count = 1
            count += countStones(stone.point, direction)
            count += countStones(stone.point, Point(-direction.row, -direction.col))

            if (count == 5) return true
        }

        return false
    }
}
