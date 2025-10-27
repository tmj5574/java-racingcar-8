package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Input {
    public static List<String> getCarNames() {
        String input = Validator.validateCarNamesList(Console.readLine());
        List<String> carList = parseCar(input);
        return Validator.validateCarNameCount(carList);
    }

    private static List<String> parseCar(String input) {
        return Arrays.stream(input.split(","))
                .map(String::trim)
                .collect(Collectors.toList());
    }

    public static int getTryCount() {
        String input = Console.readLine();
        return Integer.parseInt(Validator.validateTryCount(input));
    }
}
