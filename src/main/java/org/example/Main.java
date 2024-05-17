package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(sum(1, 4));
        System.out.println(sum(1, 10));
        System.out.println(subtract(100, 10));
        System.out.println(div(100, 1000));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int div(int a, int b) {
        return a / b;
    }
}