package hu.nive.ujratervezes.findprimedivisor;

import java.util.*;

public class DivisorFinder {
    public static int[] findPrimeDivisors(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException();
        }

        if (numbers.length == 0) {
            return new int[]{};
        }

        Set<Integer> primeDividers = new HashSet<>();

        for (int number : numbers) {
            primeDividers.addAll(getPrimeDividers(number));
            if(number != 1 && isPrime(number)){
                primeDividers.add(number);
            }
        }

        Integer[] solution = primeDividers.toArray(new Integer[0]);

        return Arrays.stream(solution).mapToInt(Integer::intValue).toArray();
    }

    private static List<Integer> getPrimeDividers(int number) {
        List<Integer> primeDividers = new ArrayList<>();

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0 && isPrime(i)) {
                primeDividers.add(i);
            }
        }
        return primeDividers;
    }

    private static boolean isPrime(int n) {
        if (n == 2 || n == 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
