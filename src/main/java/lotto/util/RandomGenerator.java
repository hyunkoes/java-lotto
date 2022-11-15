package lotto.util;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.contant.LottoConst;

import java.util.List;
import java.util.ArrayList;

public class RandomGenerator {
    public static List<Integer> generateRandomNums() {
        List<Integer> randoms = new ArrayList<>();
        while (randoms.size() < LottoConst.LOTTO_NUM_SIZE) {
            int randomNumber = Randoms.pickNumberInRange(LottoConst.LOTTO_NUM_START, LottoConst.LOTTO_NUM_END);
            if (!randoms.contains(randomNumber)) {
                randoms.add(randomNumber);
            }
        }
        return randoms;
    }
}
