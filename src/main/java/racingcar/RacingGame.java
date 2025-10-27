package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private final List<Car> cars = new ArrayList<>();

    private int totalCount = 0;
    public RacingGame(List<String> carNames, int tryCount) {
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
        this.totalCount = tryCount;
    }

    public void totalRound() {
        System.out.println("실행결과");
        int gameCount = 0;
        while (totalCount - gameCount > 0) {
            gameCount++;
            oneRound();
        }
        Output.printWinners(getWinnerNames());
    }

    private void oneRound() {
        cars.forEach(this::shouldMove);
        System.out.println();
    }

    private void shouldMove(Car car) {
        if (getRandomNumber() >= 4) {
            car.move();
        }
        Output.printOneRoundResult(car);
    }

    private int getRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }

    private List<String> getWinnerNames() {
        int maxPosition = findMaxPosition();
        List<String> winners = new ArrayList<>();

        cars.forEach(car -> car.addNameIfWinner(maxPosition, winners));

        return winners;
    }

    private int findMaxPosition() {
        return cars.stream()
            .reduce(0,
                (currentMax, car) -> car.getUpdatedMaxPosition(currentMax),
                    Integer::max);
    }

}
