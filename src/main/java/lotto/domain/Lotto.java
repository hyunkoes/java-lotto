package lotto.domain;

import lotto.contant.ErrorConst;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException(ErrorConst.NOT_SAME_NUMS);
        }
        Set<Integer> deduplicate = new HashSet<>(numbers);
        if (deduplicate.size() != numbers.size())
            throw new IllegalArgumentException(ErrorConst.NOT_UNIQUE_NUMS);
    }

    public String toString() {
        String lottoInfo = "[";
        for (int i = 0; i < numbers.size(); i++) {
            lottoInfo += numbers.get(i);
            if (i < numbers.size() - 1) lottoInfo += ", ";
        }
        lottoInfo += "]";
        return lottoInfo;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
