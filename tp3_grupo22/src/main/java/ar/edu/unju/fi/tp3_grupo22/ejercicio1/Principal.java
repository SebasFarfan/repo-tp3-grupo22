package ar.edu.unju.fi.tp3_grupo22.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int dividendo[] = new int[5];
        int divisor[] = new int[5];
        Scanner entrada = new Scanner(System.in);

        System.out.println("------ 5 Valores del dividendo -------");
        for (int i = 0; i < dividendo.length; i++) {
            try {
                System.out.print("Ingrese valor dividendo: ");
                dividendo[i] = entrada.nextInt();
            } catch (InputMismatchException e) {
                // ingreso de valores que no son números
                System.out.println("Valor ingresado NO valido!!");
                System.out.println("Ingrese otro valor.");
                i--;
                entrada.next();
            }
        }
        System.out.println();
        System.out.println("------ 5 Valores del divisor -------");
        for (int j = 0; j < divisor.length; j++) {
            try {
                System.out.print("Ingrese valor divisor: ");
                divisor[j] = entrada.nextInt();
            } catch (InputMismatchException e) {
                // ingreso de valores que no son números
                System.out.println("Valor ingresado No valido !!");
                System.out.println("Ingrese otro valor.");
                j--;
                entrada.next();
            }
        }
        entrada.close();
        System.out.println("\n ------------ Resultados de la división ------------");
        for (int i = 0; i < divisor.length; i++) {
            try {
                System.out.println(
                        dividendo[i] + "/" + divisor[i] + "=" + String.valueOf((double) dividendo[i] / divisor[i]));
            } catch (ArithmeticException e) {
                // división por cero
                System.out.println(dividendo[i] + "/" + divisor[i] + "--> " + e.getMessage());
            }
        }

    }
}
