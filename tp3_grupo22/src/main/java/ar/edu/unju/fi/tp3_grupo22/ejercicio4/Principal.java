package ar.edu.unju.fi.tp3_grupo22.ejercicio4;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int[] numeros = new int[8];
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n ----- Números ----- \n");
        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.print("Número [" + (i + 1) + "]: ");
                numeros[i] = entrada.nextInt();
            } catch (Exception e) {
                System.out.println("Valor ingresado no es valido");
                i--;
                entrada.next();
            }
        }
        entrada.close();
        System.out.println("\n -----------------------------");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("El valor [" + (i + 1) + "]=" + numeros[i] + " es Par");
            } else {
                System.out.println("El valor [" + (i + 1) + "]=" + numeros[i] + " es Impar");
            }
        }
    }
}
