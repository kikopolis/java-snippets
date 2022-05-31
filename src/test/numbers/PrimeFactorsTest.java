package test.numbers;

import main.numbers.PrimeFactors;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeFactorsTest {
    private PrimeFactors primeFactors;
    
    @BeforeEach
    void setUp() {
        primeFactors = new PrimeFactors();
    }
    
    @Test
    void of_one_is_none() {
        assertTrue(primeFactors.of(1).isEmpty());
    }
    
    @Test
    void of_two_is_two() {
        assertEquals(result(2), primeFactors.of(2));
    }
    
    @Test
    void of_three_is_three() {
        assertEquals(result(3), primeFactors.of(3));
    }
    
    @Test
    void of_four_are_two_and_two() {
        assertEquals(result(2, 2), primeFactors.of(4));
    }
    
    @Test
    void of_six_are_two_and_three() {
        assertEquals(result(2, 3), primeFactors.of(6));
    }
    
    @Test
    void of_eight_are_two_two_and_two() {
        assertEquals(result(2, 2, 2), primeFactors.of(8));
    }
    
    @Test
    void of_nine_are_three_and_three() {
        assertEquals(result(3, 3), primeFactors.of(9));
    }
    
    @Test
    void ofAcceptanceTest() {
        assertEquals(result(2, 2, 3, 5, 5, 7, 11), primeFactors.of(2 * 2 * 3 * 5 * 5 * 7 * 11));
    }
    
    private List<Integer> result(int... factors) {
        List<Integer> result = new ArrayList<>(factors.length);
        for (int factor : factors) {
            result.add(factor);
        }
        return result;
    }
}