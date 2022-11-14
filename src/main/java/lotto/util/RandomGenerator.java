package lotto.util;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.contant.LottoConst;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class RandomGenerator {
    public static List<Integer> generateRandomNums(){
        List<Integer> randoms = new ArrayList<>();
        while (randoms.size() < LottoConst.WINNING_NUM_SIZE) {
            int randomNumber = Randoms.pickNumberInRange(1, 45);
            if (!randoms.contains(randomNumber)) {
                randoms.add(randomNumber);
            }
        }
        Collections.sort(randoms);
        return randoms;
    }
}
