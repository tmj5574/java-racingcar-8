package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class InputTest extends NsTest {

    private final InputStream originalIn = System.in;

    @AfterEach
    void restoreSystemIn() {
        System.setIn(originalIn);
    }

    private void setSystemIn(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    @DisplayName("pobi,woni,jun 이라고 입력하면, [pobi, woni, jun] 리스트를 반환한다")
    void 정상적인_입력() {
        //given
        setSystemIn("pobi,woni,jun\n");

        //when
        List<String> actualNames = Input.getInput();

        //then
        List<String> expectedNames = List.of("pobi", "woni", "jun");

        assertThat(actualNames).isEqualTo(expectedNames);
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}

