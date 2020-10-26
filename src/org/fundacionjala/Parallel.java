package org.fundacionjala;

import java.util.stream.IntStream;

public class Parallel {
    public static void main(String[] args) {
        // Without concurrence
        IntStream.iterate(0, x -> x + 1)
                .limit(1000)
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);

        // Wit concurrence
        IntStream.iterate(0, x -> x + 1)
                .limit(1000)
                .parallel()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
    }
}
