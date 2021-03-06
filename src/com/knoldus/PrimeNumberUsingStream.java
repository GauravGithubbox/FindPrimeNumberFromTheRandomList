package com.knoldus;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrimeNumberUsingStream {

            public static boolean isPrime(int i) {

            IntPredicate isDivisible = index -> i % index == 0;
            return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
        }



}
