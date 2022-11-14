package lotto.domain;

import camp.nextstep.edu.missionutils.Console;
import lotto.contant.LottoConst;
import lotto.util.ListUtil;
import lotto.util.RandomGenerator;
import lotto.view.View;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    List<Lotto> lottos = new ArrayList<>();
    /**
     * Lottery 게임의 전체적인 흐름을 제어한다.
     * 1. User에게 구매 금액을 물어본다.
     * 2. 입력한 금액만큼 Lotto를 발행한다.
     * 3. 발행한 Lotto의 정보를 출력한다.
     * 4. User에게 당첨번호와 보너스번호를 입력받는다.
     * 5. 당첨 결과를 계산하여 출력한다.
     * 6. 수익률을 계산하여 출력하고 종료한다.
     * */

    public void run(){
        int lottoNums = getLottoFee();
        this.lottos = publishLottos(lottoNums);
        View.printLottoInfo(this.lottos);
        List<Integer> winningNums = getLottoWinningNums();
        List<Integer> bonusNums = getLottoBonusNums();
    }

    private List<Integer> getLottoBonusNums() {
        View.printMessage(LottoConst.BONNUS_NUM_SET_MESSAGE);
    }

    private List<Integer> getLottoWinningNums() {
        View.printMessage(LottoConst.WINNIG_NUM_SET_MESSAGE);
        String input = Console.readLine().trim();
        // validator.validateLottoFee(input);
        return ListUtil.stringToIntegerList(input);
    }

    private int getLottoFee(){
        View.printMessage(LottoConst.START_MESSAGE);
        String input = Console.readLine().trim();
        // validator.validateLottoFee(input);
        return Integer.parseInt(input);
    }
    private List<Lotto> publishLottos(int num){
        List<Lotto> newLottos = new ArrayList<>();
        for ( int i = 0 ; i < num ; i ++ ){
            newLottos.add(new Lotto(RandomGenerator.generateRandomNums()));
        }
        return newLottos;
    }
}
