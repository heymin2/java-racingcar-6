package racingcar.game;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.Constant;

public class ForwardCar {
    private static int randomNumber(){
        return Randoms.pickNumberInRange(Constant.MIN_VALUE,Constant.MAX_VALUE);
    }

    private static boolean isForward(int number){
        return number >= Constant.FORWARD_CONDITION;
    }
}
