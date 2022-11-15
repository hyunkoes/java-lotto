package lotto.domain;

import lotto.contant.LottoConst;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LottoManager {
    private static List<Integer> winningNums;
    private static int bonusNum;
    private static List<Integer> winningResults;

    public List<Integer> getWinningResults() {
        return winningResults;
    }

    void setWinningNums(List<Integer> winningNums) {
        this.winningNums = winningNums;
    }

    void setBonusNum(int bonusNum) {
        this.bonusNum = bonusNum;
    }

    public List<Integer> getWinningNums() {
        return winningNums;
    }

    public int getBonusNum() {
        return bonusNum;
    }

    //with dummy
    public static void judgeLottosPrize(List<Lotto> lottos) {
        int[] prize = new int[5];
        for (int i = 0; i < lottos.size(); i++) {
            int rank = judgeLottoPrize(lottos.get(i));
            System.out.println("index : " + rank);
            if (rank < 5)
                prize[rank]++;
        }
        winningResults = Arrays.stream(prize).boxed().collect(Collectors.toList());
    }

    private static int judgeLottoPrize(Lotto lotto) {
        List<Integer> lottoNums = lotto.getNumbers();
        int matchingCount = 0;
        for (int i = 0; i < winningNums.size(); i++) {
            int winningNum = winningNums.get(i);
            if (lottoNums.stream().anyMatch(num -> num == winningNum)) matchingCount++;
        }
        boolean bonusMatch = lottoNums.stream().anyMatch(num -> num == bonusNum);
        if (matchingCount < LottoConst.SECOND_THIRD_CONDITION) matchingCount--;
        if (!bonusMatch && matchingCount == LottoConst.SECOND_THIRD_CONDITION)
            matchingCount--;
        return LottoConst.LOTTO_NUM_SIZE - matchingCount;
    }

    //with dummy
    public static BigInteger getWinningPrize() {
        BigInteger prizeSum = new BigInteger("0");
        for (int i = 0; i < winningResults.size(); i++) {
            BigInteger prize = new BigInteger(LottoConst.LOTTO_PRIZE[i]);
            prize = prize.multiply(BigInteger.valueOf(winningResults.get(i)));
            prizeSum = prizeSum.add(prize);
        }
        return prizeSum;
    }
}

/**
 * 구매금액 3000
 * 당첨금 30000원
 * 33000 / 3000 ->
 */
