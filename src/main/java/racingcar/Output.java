package racingcar;

import java.util.List;

public class Output {
     public static void printOneRoundResult(Car car) {
         System.out.println(car.getResult());
     }

    public static void printWinners(List<String> winnerNames) {
        System.out.print("최종 우승자 : " + String.join(", ", winnerNames));
    }
}
