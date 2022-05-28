package main.numbers;

import java.util.Objects;

public class LinearSearchFromArray {
    public Integer linearSearchFromArray(Integer needle, Integer[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if (Objects.equals(needle, haystack[i])) {
                return i;
            }
        }
        return -1;
    }
}
