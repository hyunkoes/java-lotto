package lotto.util;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class RandomGenerator {
    public static List<Integer> generateRandomNums(int size){
        Queue<Integer> randoms = new PriorityQueue<>();
        while (randoms.size() < size) {
            int randomNumber = Randoms.pickNumberInRange(1, 45);
            if (!randoms.contains(randomNumber)) {
                randoms.add(randomNumber);
            }
        }
        return (List) randoms;
    }
}
