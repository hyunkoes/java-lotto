package lotto.validator;

import lotto.contant.ErrorConst;
import lotto.contant.LottoConst;
import lotto.util.ListUtil;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public static void validateWinningNums(String input) {
        validateIsFitSize(input);
        List<Integer> lottoNums = ListUtil.stringToIntegerList(input);
        validateIsInRange(lottoNums);
        validateIsDuplicate(lottoNums);
    }

    private static void validateIsInRange(List<Integer> lottoNums) {
        for (int i = 0; i < lottoNums.size(); i++) {
            if (lottoNums.get(i) < LottoConst.LOTTO_NUM_START || lottoNums.get(i) > LottoConst.LOTTO_NUM_END)
                throw new IllegalArgumentException(ErrorConst.NOT_IN_LOTTO_NUM_RANGE);
        }
    }

    private static void validateIsDuplicate(List<Integer> lottoNums) {
        Set<Integer> deduplicatedNums = new HashSet<>(lottoNums);
        if (lottoNums.size() != deduplicatedNums.size())
            throw new IllegalArgumentException(ErrorConst.NOT_UNIQUE_NUMS);

    }

    private static void validateIsFitSize(String input) {
        if (input.split(",").length != LottoConst.LOTTO_NUM_SIZE)
            throw new IllegalArgumentException(ErrorConst.NOT_SAME_NUMS);
    }

}
