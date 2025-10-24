package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Input {
    public static List<String> getInput() {
        String input = Console.readLine();
        return parseCar(input);
    }

    private static List<String> parseCar(String input) {
        return List.of(input.split(","));
    }
}
