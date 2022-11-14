package lotto.contant;

public class ErrorConst {
    public static final String NOT_A_NUM = "숫자를 입력해야 합니다.";
    public static final String INVALID_FEE = LottoConst.LOTTO_FEE+"단위로 구입해야 합니다.";
    public static final String NOT_IN_NUM_RANGE = LottoConst.LOTTO_NUM_START+ " ~ "+LottoConst.LOTTO_NUM_END+" 사이의 로또 번호를 입력해야 합니다.";
    public static final String NOT_UNIQUE_NUMS = "중복이 없는 번호를 입력해주세요.";
    public static final String NOT_ENOUGH_NUMS = LottoConst.WINNING_NUM_SET_MESSAGE+ LottoConst.BONUS_NUM_SIZE+"개의 번호를 입력해야 합니다.";
}
