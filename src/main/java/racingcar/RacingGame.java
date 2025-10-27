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
        while (totalCount - gameCount >= 0) {
            gameCount++;
            oneRound();
        }
        printWinners(getWinnerNames());
    }

    private void oneRound() {
        for(Car car : cars) {
            shouldMove(car);
        }
        System.out.println();
    }

    private void shouldMove(Car car) {
        if (getRandomNumber() >= 4) {
            car.move();
        }
        else {
            car.stop();
        }
    }

    private int getRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }

    private void printWinners(List<String> winnerNames) {
        System.out.print("최종 우승자 : " + String.join(", ", winnerNames));
    }

    private List<String> getWinnerNames() {
        int maxPosition = findMaxPosition();
        List<String> winners = new ArrayList<>();

        for (Car car : cars) {
            car.addNameIfWinner(maxPosition, winners);
        }

        return winners; // 4. 명단 반환
    }

    private int findMaxPosition() {
        int maxPosition = 0;
        for (Car car : cars) {
            maxPosition = car.getUpdatedMaxPosition(maxPosition);
        }
        return maxPosition;
    }

}
