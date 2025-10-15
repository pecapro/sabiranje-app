package com.pecapro;

import java.util.Scanner;

public class Sabiranje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Izaberi operaciju:");
        System.out.println("1 - Sabiranje");
        System.out.println("2 - Oduzimanje");
        System.out.println("3 - Množenje");
        System.out.println("4 - Deljenje");
        System.out.print("Unesi broj: ");
        int izbor = scanner.nextInt();
        
        System.out.print("Unesi prvi broj: ");
        double a = scanner.nextDouble();
        
        System.out.print("Unesi drugi broj: ");
        double b = scanner.nextDouble();
        
        switch (izbor) {
            case 1:
                System.out.println("Zbir je: " + (a + b));
                break;
            case 2:
                System.out.println("Razlika je: " + (a - b));
                break;
            case 3:
                System.out.println("Proizvod je: " + (a * b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Greška: Ne možeš deliti sa nulom!");
                } else {
                    System.out.println("Količnik je: " + (a / b));
                }
                break;
            default:
                System.out.println("Nepoznat izbor! Unesi broj od 1 do 4.");
        }
        
        scanner.close();
    }
}
