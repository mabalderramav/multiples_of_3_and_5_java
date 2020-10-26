package org.fundacionjala;

public class Main {

    public static void main(String[] args) {
        System.out.println(getMultiplesOf3Or5Bellow(10));
        System.out.println(getMultiplesOf3Or5Bellow(100));
        System.out.println(getMultiplesOf3Or5Bellow(200));
        System.out.println(getMultiplesOf3Or5Bellow(300));
        System.out.println(getMultiplesOf3Or5Bellow(400));
        System.out.println(getMultiplesOf3Or5Bellow(500));
        System.out.println(getMultiplesOf3Or5Bellow(600));
        System.out.println(getMultiplesOf3Or5Bellow(700));
        System.out.println(getMultiplesOf3Or5Bellow(800));
        System.out.println(getMultiplesOf3Or5Bellow(900));
        System.out.println(getMultiplesOf3Or5Bellow(1000));
    }

    public static int getMultiplesOf3Or5Bellow(int number){
        int totalSum = 0;
        for (int i = 1; i < number; i++){
            if ((i%3) == 0 || (i%5) == 0){
                totalSum = totalSum + i;
            }
        }
        return totalSum;
    }
}
