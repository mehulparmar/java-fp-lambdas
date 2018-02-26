package com.demo.lambdas;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Closure {
    public static void main(String[] args) {
        int factor = 3;

       Arrays.stream(new int[] {1, 2, 3})
                .map(n -> factor * n + 1)
                .average()
                .ifPresent(System.out::println);
       }
}
