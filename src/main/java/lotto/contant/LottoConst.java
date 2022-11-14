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
    public static final String FIRST_PRIZE = UnitConverter.convertWonNotation("2000000000");
    public static final String SECOND_PRIZE = UnitConverter.convertWonNotation("30000000");
    public static final String THIRD_PRIZE = UnitConverter.convertWonNotation("1500000");
    public static final String FOURTH_PRIZE = UnitConverter.convertWonNotation("50000");
    public static final String FIFTH_PRIZE = UnitConverter.convertWonNotation("5000");
    public static final String START_MESSAGE = "구입금액을 입력해 주세요.\n";
    public static final String BUYING_MESSAGE = "개를 구매했습니다.\n";
    public static final String WINNING_NUM_SET_MESSAGE = "당첨 번호를 입력해주세요.\n";
    public static final String BONUS_NUM_SET_MESSAGE = "보너스 번호를 입력해주세요.\n";
    public static final String RESULT_HEADER_MESSAGE = "당첨 통계\n---\n";
    public static final String[] WINNING_MESSAGE = {
            FIFTH_CONDITION + "개 일치 (" + FIFTH_PRIZE + ")",
            FOURTH_CONDITION + "개 일치 (" + FOURTH_PRIZE + ")",
            SECOND_THIRD_CONDITION + "개 일치 (" + THIRD_PRIZE + ")",
            SECOND_THIRD_CONDITION + "개 일치, 보너스 볼 일치 (" + SECOND_PRIZE + ")",
            FIRST_CONDITION + "개 일치 (" + FIRST_PRIZE + ")"};
}
