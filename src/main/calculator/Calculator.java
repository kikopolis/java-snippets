package main.calculator;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Calculator {
    public int add(int... args) {
        return Arrays.stream(args).sum();
    }
    
    public float add(float... args) {
        float sum = 0.0f;
        for (float arg : args) {
            sum += arg;
        }
        return sum;
    }
    
    public int subtract(int... args) {
        return IntStream.range(0, args.length).map(i -> i == 0 ? args[i] : -args[i]).sum();
    }
    
    public float subtract(float... args) {
        float sum = 0.0f;
        for (int i = 0; i < args.length; i++) {
            if (i == 0) {
                sum = args[i];
            } else {
                sum -= args[i];
            }
        }
        return sum;
    }
}
