package lotto.util;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomGenerator {
    public static List<Integer> generateRandomNums(int size){
        List<Integer> randoms = new ArrayList<>();
        while (randoms.size() < size) {
            int randomNumber = Randoms.pickNumberInRange(1, 45);
            if (!randoms.contains(randomNumber)) {
                randoms.add(randomNumber);
            }
        }
        return randoms;
    }
}
