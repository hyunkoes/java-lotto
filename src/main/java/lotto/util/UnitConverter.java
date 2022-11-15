package lotto.util;

import java.math.BigInteger;

public class UnitConverter {
    public static String convertWonNotation(String won) {
        return won.replaceAll("\\B(?=(\\d{3})+(?!\\d))", ",")+"원";
    }
}
