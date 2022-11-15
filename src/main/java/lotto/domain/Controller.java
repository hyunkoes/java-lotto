package lotto.domain;

import camp.nextstep.edu.missionutils.Console;
import lotto.contant.LottoConst;
import lotto.util.ListUtil;
import lotto.util.RandomGenerator;
import lotto.validator.InputValidator;
import lotto.view.View;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    /**
     * Lottery 게임의 전체적인 흐름을 제어한다.
     * 1. User에게 구매 금액을 물어본다.
     * 2. 입력한 금액만큼 Lotto를 발행한다.
     * 3. 발행한 Lotto의 정보를 출력한다.
     * 4. User에게 당첨번호와 보너스번호를 입력받는다.
     * 5. 당첨 결과를 계산하여 출력한다.
     * 6. 수익률을 계산하여 출력하고 종료한다.
     */

    public void run(User user, LottoManager lottoManager) {
        try {
            user.setLottoFee(getLottoFee());
            user.setLottos(publishLottos(user.getLottoFee()));
            View.printLottoInfo(user.getLottosPublished());
            lottoManager.setWinningNums(getLottoWinningNums());
            lottoManager.setBonusNum(getLottoBonusNums(lottoManager.getWinningNums()));
            LottoManager.judgeLottosPrize(user.getLottosPublished());
            View.printLottoResult(lottoManager.getWinningResults());
            BigDecimal revenue = calculateRevenue(LottoManager.getWinningPrize(), user.getLottoFee());
            View.printRevenue(revenue.toString());
        } catch (Exception e) {
            View.printMessage(String.valueOf(e));
        }
    }

    private BigDecimal calculateRevenue(BigInteger prize, BigInteger userPaid) {
        BigDecimal _prize = new BigDecimal(prize).multiply(BigDecimal.valueOf(100));
        BigDecimal _userPaid = new BigDecimal(userPaid);

        BigDecimal revenue = _prize.divide(_userPaid, 1, RoundingMode.HALF_EVEN);
        return revenue;
    }

    private int getLottoBonusNums(List<Integer> winningNums) {
        View.printMessage(LottoConst.BONUS_NUM_SET_MESSAGE);
        String input = Console.readLine().trim();
        InputValidator.validateBonusNums(input, winningNums);
        return Integer.parseInt(input);
    }

    private List<Integer> getLottoWinningNums() {
        View.printMessage(LottoConst.WINNING_NUM_SET_MESSAGE);
        String input = Console.readLine().trim();
        InputValidator.validateWinningNums(input);
        return ListUtil.stringToIntegerList(input);
    }

    private BigInteger getLottoFee() {
        View.printMessage(LottoConst.START_MESSAGE);
        String input = Console.readLine().trim();
        InputValidator.validateLottoFee(input);

        return new BigInteger(input);
    }

    private List<Lotto> publishLottos(BigInteger lottoFee) {
        List<Lotto> newLottos = new ArrayList<>();
        BigInteger lottoCount = lottoFee.divide(BigInteger.valueOf(LottoConst.LOTTO_FEE));
        for (BigInteger lottoCreation = BigInteger.valueOf(0); lottoCreation.compareTo(lottoCount) < 0; lottoCreation = lottoCreation.add(BigInteger.ONE)) {
            newLottos.add(new Lotto(RandomGenerator.generateRandomNums()));
        }
        return newLottos;
    }
}
