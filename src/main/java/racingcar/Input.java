package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Input {
    public static List<String> getCarNames() {
        String input = Console.readLine();
        Validator.validateCarNamesList(input);
        List<String> carList = parseCar(input);
        Validator.validateCarNameCount(carList);
        return carList;
    }

    private static List<String> parseCar(String input) {
        return List.of(input.split(","));
    }
}
