package racingcar;

import java.util.List;

public class Application {

    static final String START_CAR_NAME_INPUT_MSG = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    static final String START_GAME_COUNT_INPUT_MSG = "시도할 횟수는 몇 회인가요?";
    public static void main(String[] args) {
        System.out.println(START_CAR_NAME_INPUT_MSG);
        List<String> carNames = Input.getCarNames();
        System.out.println(START_GAME_COUNT_INPUT_MSG);
        int tryCount = Input.getTryCount();
        RacingGame game = new RacingGame(carNames, tryCount);
        game.totalRound();
    }
}
