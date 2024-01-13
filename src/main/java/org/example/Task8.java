package org.example;

public class Task8 {
    public static void main(String[] args) {
        int savings = 0;
        int contribution = 29000;
        for (int i = 1; i <= 12; i++) {
            savings = savings+ savings/100;
            savings = savings + contribution;
            System.out.println("Месяц "+ i +" накоплено - "+ savings);
        }
    }
}
