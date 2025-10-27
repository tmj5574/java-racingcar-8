package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Input {
    public static List<String> getCarNames() {
        String input = Validator.validateCarNamesList(Console.readLine());
        List<String> carList = parseCar(input);
        return Validator.validateCarNameCount(carList);
    }

    private static List<String> parseCar(String input) {
        return List.of(input.split(","));
    }

    public static int getTryCount() {
        String input = Console.readLine();
        return Integer.parseInt(Validator.validateTryCount(input));
    }
}
