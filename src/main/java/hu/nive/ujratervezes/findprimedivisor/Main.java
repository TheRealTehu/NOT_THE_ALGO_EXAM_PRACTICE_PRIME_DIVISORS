package hu.nive.ujratervezes.findprimedivisor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] f = DivisorFinder.findPrimeDivisors(new int[]{1009,1010,1011});

        Arrays.stream(f).forEach(System.out::println);
    }
}
