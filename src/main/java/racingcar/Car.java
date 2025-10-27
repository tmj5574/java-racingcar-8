package racingcar;

import java.util.List;

public class Car {
    String name;
    int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        position++;
        printResult();
    }

    public void stop() {
        printResult();
    }

    private void printResult() {
        System.out.println(name + " : " + "-".repeat(position));
    }

    public int getUpdatedMaxPosition(int currentMax) {
        return Math.max(this.position, currentMax);
    }

    public void addNameIfWinner(int finalMaxPosition, List<String> winnersList) {
        if (this.position == finalMaxPosition) {
            winnersList.add(this.name);
        }
    }
}
