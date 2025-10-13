package com.pecapro;

import java.util.Scanner;

public class Sabiranje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Izaberi operaciju:");
        System.out.println("1 - Sabiranje");
        System.out.println("2 - Množenje");
        System.out.print("Unesi broj: ");
        int izbor = scanner.nextInt();
        
        System.out.print("Unesi prvi broj: ");
        double a = scanner.nextDouble();
        
        System.out.print("Unesi drugi broj: ");
        double b = scanner.nextDouble();
        
        if (izbor == 1) {
            double zbir = a + b;
            System.out.println("Zbir je: " + zbir);
        } else if (izbor == 2) {
            double proizvod = a * b;
            System.out.println("Proizvod je: " + proizvod);
        } else {
            System.out.println("Nepoznat izbor!");
        }
        
        scanner.close();
    }
}
