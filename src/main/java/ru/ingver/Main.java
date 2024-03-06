package ru.ingver;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cумма равна: " + sum());
    }

    public static int sum() {
        Scanner console = new Scanner(System.in);
        int numberOne = console.nextInt();
        int numberTwo = console.nextInt();
        return numberOne + numberTwo;
    }
}