package lotto.contant;

import lotto.util.UnitConverter;

public class LottoConst {
    public static final int LOTTO_NUM_START = 1;
    public static final int LOTTO_NUM_END = 45;
    public static final int LOTTO_NUM_SIZE = 6;
    public static final int BONUS_NUM_SIZE = 1;
    public static final int LOTTO_FEE = 1000;
    public static final int FIRST_CONDITION = 6;
    public static final int SECOND_THIRD_CONDITION = 5;
    public static final int FOURTH_CONDITION = 4;
    public static final int FIFTH_CONDITION = 3;
    public static final String FIRST_PRIZE = "2000000000";
    public static final String SECOND_PRIZE = "30000000";
    public static final String THIRD_PRIZE = "1500000";
    public static final String FOURTH_PRIZE = "50000";
    public static final String FIFTH_PRIZE = "5000";
    public static final String LOTTO_PRIZE[] = new String[]{
            FIRST_PRIZE, SECOND_PRIZE, THIRD_PRIZE, FOURTH_PRIZE, FIFTH_PRIZE
    };
    public static final String START_MESSAGE = "구입금액을 입력해 주세요.\n";
    public static final String BUYING_MESSAGE = "개를 구매했습니다.\n";
    public static final String WINNING_NUM_SET_MESSAGE = "당첨 번호를 입력해주세요.\n";
    public static final String BONUS_NUM_SET_MESSAGE = "보너스 번호를 입력해주세요.\n";
    public static final String RESULT_HEADER_MESSAGE = "당첨 통계\n---\n";
    public static final String[] WINNING_MESSAGE = {
            FIFTH_CONDITION + "개 일치 (5,000원)",
            FOURTH_CONDITION + "개 일치 (50,000원)",
            SECOND_THIRD_CONDITION + "개 일치 (1,500,000원)",
            SECOND_THIRD_CONDITION + "개 일치, 보너스 볼 일치 (30,000,000원)",
            FIRST_CONDITION + "개 일치 (2,000,000,000원)"};
}
