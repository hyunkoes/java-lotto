package lotto.validator;

import lotto.contant.ErrorConst;
import lotto.contant.LottoConst;

public class InputValidator {
    public static void validateLottoFee(String input) {
        validateIsDigit(input);
        validateIsFitToFee(input);
    }

    private static void validateIsFitToFee(String input) {
        if (Integer.parseInt(input) % LottoConst.LOTTO_FEE != 0)
            throw new IllegalArgumentException(ErrorConst.INVALID_FEE);
    }

    private static void validateIsDigit(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorConst.NOT_A_NUM);
        }
    }
}
