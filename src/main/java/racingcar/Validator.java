package racingcar;

import org.assertj.core.api.ThrowableAssert;

import java.util.List;

public class Validator {

    static final String ERROR_EMPTY_INPUT = "잘못된 자동차 이름이 입력되었습니다.";
    static final String ERROR_LONG_NAME = "자동차 이름이 5자를 초과하였습니다.";

    public static void validateInput(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException(ERROR_EMPTY_INPUT);
        }
    }

    public static void validateCarNames(List<String> carNames) {
        for (String name : carNames) {
            if (name.length() > 5) {
                throw new IllegalArgumentException(ERROR_LONG_NAME);
            }
        }
    }
}
