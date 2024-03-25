package omok.model

import omok.fixture.FIRST_ROW_FIRST_COL
import omok.fixture.FIRST_ROW_SECOND_COL
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StonesTest {
    @Test
    fun `stone 을 하나 추가할 경우, Stones 의 사이즈는 1 증가한다`() {
        // when
        val stones = Stones()
        assertThat(stones.stones.size).isEqualTo(0)

        // given
        stones.add(Stone(FIRST_ROW_FIRST_COL, Color.BLACK))

        // then
        assertThat(stones.stones.size).isEqualTo(1)
    }

    @Test
    fun `Stones 의 마지막 스톤을 확인할 수 있다`() {
        val stones = Stones()
        stones.add(Stone(FIRST_ROW_FIRST_COL, Color.BLACK))
        stones.add(Stone(FIRST_ROW_SECOND_COL, Color.BLACK))

        assertThat(stones.lastStone()).isEqualTo(Stone(FIRST_ROW_SECOND_COL, Color.BLACK))
    }
}
