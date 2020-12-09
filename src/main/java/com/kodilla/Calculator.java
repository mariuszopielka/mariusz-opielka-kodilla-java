package com.kodilla;
import java.util.Scanner;

public class Calculator {
    public Calculator() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe A: ");
        int A = scanner.nextInt();
        System.out.println("Poodaj liczbe B: ");
        int B = scanner.nextInt();
        int suma = A + B;
        int roznica = A - B;
        System.out.println("Suma A i B to: " + suma);
        System.out.println("Roznica A i B to: " + roznica);
    }5
}
