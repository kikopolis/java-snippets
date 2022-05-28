package main.fizzbuzz;

public class FizzBuzz {
    public void print() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(of(i));
        }
    }
    
    public String of(int number) {
        String result = "";
        if (number == 0) {
            result += "0";
        }
        if (number > 0 && number % 3 == 0) {
            result += "Fizz";
        }
        if (number > 0 && number % 5 == 0) {
            result += "Buzz";
        }
        return !result.isEmpty() ? result : String.valueOf(number);
    }
}
