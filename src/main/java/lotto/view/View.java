package lotto.view;

import lotto.contant.LottoConst;
import lotto.domain.Lotto;

import java.math.BigDecimal;
import java.util.List;

public class View {
    public static void printMessage(String message){
        System.out.print("\n"+message);
    }
    public static void printLottoInfo(List<Lotto> lottos) {
        for (int i = 0; i < lottos.size(); i++) {
            System.out.println(lottos.get(i).toString());
        }
    }
    public static void printLottoResult(List<Integer> winningResults){
        System.out.print("\n"+LottoConst.RESULT_HEADER_MESSAGE);
        for ( int i = 0 ; i < winningResults.size() ; i ++ ){
            System.out.println(LottoConst.WINNING_MESSAGE[i] + " - " + winningResults.get(i)+ "개");
        }
    }
    public static void printRevenue(String revenue){
        System.out.print("총 수익률은 "+revenue+"% 입니다.");
    }
}
