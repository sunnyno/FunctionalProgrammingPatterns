package com.jland.funcpatterns.imperative;

import java.util.stream.LongStream;

public class Factorial {

    public static long factorialLoop(int number) {
        if (number < 0) {
            throw new IllegalArgumentException(
                    "Factorial can be counted for positives. Provided: " + number);
        }
        int i, fact = 1;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static long factorialRec(int number) {
        if (number == 0 || number == 1)
            return 1;

        return factorialRec(number - 1) * number;
    }

    public static long factorial(int number) {
        return LongStream.rangeClosed(1, number)
                .reduce(1, (x, y) -> x * y);
    }
}
