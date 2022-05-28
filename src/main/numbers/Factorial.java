package main.numbers;

public class Factorial {
    /**
     * Calculate the factorial - product of all positive integers smaller or equal to a number
     */
    public Integer calculate(Integer value) {
        int product = value;
        for (int i = --value; i >= 1; i--) {
            product = product * i;
        }
        return product;
    }
}
