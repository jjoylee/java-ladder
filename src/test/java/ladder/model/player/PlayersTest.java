package ladder.model.player;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class PlayersTest {

    @Test
    @DisplayName("참가하는 사람이 2명 미만일 경우 예외 발생")
    void minPlayerCountExceptionTest() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Players("play1").get())
                .withMessage("게임을 하려면 최소 2명이 필요합니다.");
    }

    @ParameterizedTest
    @CsvSource(value = {"1,2,3|3", "1,2,3,4|4", "1,2,3,4,5|5"}, delimiter = '|')
    @DisplayName("입력받은 값에 따라 생성된 Player 개수 확인")
    void playerCreateSizeTest(String players, int size) {
        assertThat(new Players(players).get().size()).isEqualTo(size);
    }
}