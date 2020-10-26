package org.fundacionjala;

import java.util.stream.IntStream;

public class MainV2 {
    public static void main(String[] args) {
        System.out.println(getDivisibleByUnder(10));
        System.out.println(getDivisibleByUnder(100));
        System.out.println(getDivisibleByUnder(200));
        System.out.println(getDivisibleByUnder(300));
        System.out.println(getDivisibleByUnder(400));
        System.out.println(getDivisibleByUnder(500));
        System.out.println(getDivisibleByUnder(600));
        System.out.println(getDivisibleByUnder(700));
        System.out.println(getDivisibleByUnder(800));
        System.out.println(getDivisibleByUnder(900));
        System.out.println(getDivisibleByUnder(1000));
    }

    public static int getDivisibleByUnder(int number) {
        return IntStream.rangeClosed(1, number - 1).boxed().parallel().filter(num -> (num % 3) == 0 || (num % 5) == 0).mapToInt(Integer::intValue).sum();
    }
}
