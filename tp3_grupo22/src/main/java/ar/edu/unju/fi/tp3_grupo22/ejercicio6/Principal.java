package ar.edu.unju.fi.tp3_grupo22.ejercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("\n --------- ----------");
        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.print("Ingrese nro: ");
                numeros[i] = entrada.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor ingresado no valido");
                i--;
                entrada.next();
            }
        }
        entrada.close();
        System.out.println("---------- lista invertida----------");
        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println();
    }
}
