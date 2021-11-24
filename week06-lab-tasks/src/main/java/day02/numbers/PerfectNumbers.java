package day02.numbers;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumbers {

    private List<Integer> getDivisors(int number) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= number/2; i++) {
            if ((number % i) == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    public boolean isPerfectNumber(int number) {
        List<Integer> divisors = getDivisors(number);
        int sum = 0;
        for (Integer i : divisors) {
            sum += i;
        }
        return sum == number;
    }
}
