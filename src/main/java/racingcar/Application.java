package racingcar;

import racingcar.car.CarInfo;
import racingcar.car.UserInputCarName;
import racingcar.game.ProcessGame;
import racingcar.game.UserInputGameRound;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<CarInfo> carList = UserInputCarName.getCarList();
        int gameRound = UserInputGameRound.getGameRound();
        ProcessGame.playGame(carList, gameRound);
    }
}