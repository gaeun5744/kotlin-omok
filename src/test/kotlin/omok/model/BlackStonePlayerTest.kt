package omok.model

import fixture.H_1
import fixture.H_2
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BlackStonePlayerTest {
    @Test
    fun `BlackStonePlayer 는 Stone 을 추가할 수 있다`() {
        // when
        val blackStonePlayer = BlackStonePlayer()
        assertThat(blackStonePlayer.getStones().size).isEqualTo(0)

        // given
        blackStonePlayer.add(H_2)

        // Then
        assertThat(blackStonePlayer.getStones().size).isEqualTo(1)
    }

    @Test
    fun `마지막 스톤을 알 수 있다`() {
        val blackStonePlayer = BlackStonePlayer()
        blackStonePlayer.add(H_1)
        blackStonePlayer.add(H_2)

        assertThat(blackStonePlayer.lastStone()).isEqualTo(H_2)
    }
}