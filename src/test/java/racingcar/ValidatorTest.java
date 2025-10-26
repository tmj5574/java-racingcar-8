package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ValidatorTest extends NsTest {

    @Test
    @DisplayName("공백을 입력했을 때 예외(IllegalArgumentException)가 발생합니다.")
    void 비정삭적인_입력1() {
        //given
        String invalidInput = "\n";

        //when & then
        assertThatThrownBy(() -> Validator.validateCarNamesList(invalidInput))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("차의 이름이 5자를 초과하는 경우 예외(IllegalArgumentException)가 발생합니다.")
    void 비정상적인_입력2() {
        //given
        List<String> carNameList = List.of("abcdef");

        //when & then
        assertThatThrownBy(() -> Validator.validateCarNameCount(carNameList))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }
}
