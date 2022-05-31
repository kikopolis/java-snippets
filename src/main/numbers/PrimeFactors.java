package main.numbers;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> of(int number) {
        List<Integer> factors = new ArrayList<>();
        for (int divisor = 2; number > 1; divisor++) {
            for (; number % divisor == 0; number /= divisor) {
                factors.add(divisor);
            }
        }
        return factors;
    }
}
