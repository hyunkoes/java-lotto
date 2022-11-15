package lotto;

import lotto.domain.Controller;
import lotto.domain.LottoManager;
import lotto.domain.User;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        User user = new User();
        LottoManager lottoManager = new LottoManager();
        Controller controller = new Controller();
        controller.run(user, lottoManager);
    }
}
