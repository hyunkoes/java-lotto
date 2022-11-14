package lotto.domain;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class LottoJudge {
    //with dummy
    public static List<Integer> judgeLottosPrize(List<Lotto> lottos, List<Integer> winningNums, List<Integer> bonusNums) {
        List<Integer> lst = Arrays.asList(1,0,1,0,0);
        return lst;
    }

    private static int getPrizeOfLotto(Lotto lotto, List<Integer> winningNums, List<Integer> bonusNums) {

        return 1;
    }
    //with dummy
    public static BigInteger getWinningPrize(List<Integer> winningResults) {
        return new BigInteger("5000");
    }
}

/**
 * 구매금액 3000
 * 당첨금 30000원
 * 33000 / 3000 ->
 *
 * */
