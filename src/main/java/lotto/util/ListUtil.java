package lotto.util;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {
    public static List<Integer> stringToIntegerList(String input) {
        List<Integer> convertedResult = new ArrayList<>();
        String[] elementsBySplit = input.split(",");
        for (int i = 0; i < elementsBySplit.length; i++) {
            int num = Integer.parseInt(elementsBySplit[i].trim());
            convertedResult.add(num);
        }
        return convertedResult;
    }
}

