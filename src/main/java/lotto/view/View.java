package lotto.view;

import lotto.domain.Lotto;

import java.util.List;

public class View {
    public static void printLottoInfo(List<Lotto> lottos) {
        for (int i = 0; i < lottos.size(); i++) {
            System.out.println(lottos.get(i).toString());
        }
    }
}
