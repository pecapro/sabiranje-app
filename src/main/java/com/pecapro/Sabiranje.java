package com.pecapro;

import java.util.Scanner;

public class Sabiranje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Unesi prvi broj: ");
        double a = scanner.nextDouble();
        
        System.out.print("Unesi drugi broj: ");
        double b = scanner.nextDouble();
        
        double zbir = a + b;
        System.out.println("Zbir je: " + zbir);
        
        scanner.close();
    }
}
