package main.numbers;

public class Sum {
    /**
     * Sum together all numbers that are multiples of 3 or 5 up to the value (inclusive)
     */
    public Integer sum(Integer value) {
        int sum = 0;
        for (int i = 1; i <= value; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
            if (i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
