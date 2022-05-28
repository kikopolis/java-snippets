package main.numbers;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindMaximum {
    public Integer maximum(Integer[] haystack) {
        int maximum = 0;
        for (int integer : haystack) {
            if (integer > maximum) {
                maximum = integer;
            }
        }
        return maximum;
    }
    
    public Integer maximumTwo(int[] haystack) {
        OptionalInt maximum = Arrays.stream(haystack).max();
        return maximum.isPresent() ? maximum.getAsInt() : 0;
    }
}
