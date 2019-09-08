package com.tddpractice.android;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Test
    public void should_return_fizz_when_given_number() {
        test(3, "Fizz");
    }

    private void test(int i, String fizz) {
        int number = i;
        String result = MainActivity.checkFizzBuzz(number);
        assertEquals(fizz, result);
    }

    public void should_return_Buzz_when_given_number() {
        test(5, "Buzz");
    }

    public void should_return_fizz_buzz_when_given_number() {
        test(5, "FizzBuzz");
    }


}