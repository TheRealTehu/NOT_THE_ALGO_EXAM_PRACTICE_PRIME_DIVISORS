package hu.nive.ujratervezes.findprimedivisor;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DivisorFinderTest {
    @Test
    void valid_input_test_1(){
        assertTrue(arraysContainsSameElements(new int[]{2,3,5,11}, DivisorFinder.findPrimeDivisors(new int[]{10,11,12})));
    }

    @Test
    void valid_input_test_2(){
        assertTrue(arraysContainsSameElements(new int[]{5}, DivisorFinder.findPrimeDivisors(new int[]{5})));
    }

    @Test
    void valid_input_test_3(){
        assertTrue(arraysContainsSameElements(new int[]{2,3,5,11}, DivisorFinder.findPrimeDivisors(new int[]{6,22,15})));
    }

    @Test
    void valid_input_test_4(){
        assertTrue(arraysContainsSameElements(new int[]{1009,337,2,3,5,101}, DivisorFinder.findPrimeDivisors(new int[]{1009,1010,1011})));
    }

    @Test
    void empty_array_test(){
        assertArrayEquals(new int[]{}, DivisorFinder.findPrimeDivisors(new int[]{}));
    }

    @Test
    void no_prime_divisors_test(){
        assertArrayEquals(new int[]{}, DivisorFinder.findPrimeDivisors(new int[]{0,1}));
    }

    @Test
    void invalid_input_throws_exception(){
        assertThrows(IllegalArgumentException.class, () -> DivisorFinder.findPrimeDivisors(null));
    }

    private boolean arraysContainsSameElements(int[] expected, int[] actual){
        if(expected.length == actual.length){
            Arrays.sort(expected);
            Arrays.sort(actual);
            return Arrays.equals(expected, actual);
        }
        return false;
    }
}