package racingcar;

import java.util.List;

public class Validator {

    static final String ERROR_EMPTY_CAR_NAME = "잘못된 자동차 이름이 입력되었습니다.";
    static final String ERROR_LONG_NAME = "자동차 이름이 5자를 초과하였습니다.";
    static final String ERROR_INVALID_TRY_INPUT = "횟수를 잘못 입력하였습니다. 숫자를 입력하세요.";


    public static void validateCarNamesList(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException(ERROR_EMPTY_CAR_NAME);
        }
    }

    public static void validateCarNameCount(List<String> carNames) {
        for (String name : carNames) {
            if (name.length() > 5) {
                throw new IllegalArgumentException(ERROR_LONG_NAME);
            }
        }
    }

    public static void validateTryCount(String input) {
        if (input == null || !input.matches("\\d+")) {
            throw new IllegalArgumentException(ERROR_INVALID_TRY_INPUT);
        }
    }
}
