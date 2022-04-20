package ar.edu.unju.fi.tp3_grupo22.ejercicio5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palabra = "";

        System.out.print("\n ingrese palabra:");
        palabra = entrada.next();
        entrada.close();
        System.out.println("-------------------------------");
        char[] letras = new char[palabra.length()];
        int j = 0;
        for (int i = palabra.length() - 1; i >= 0; i--) {
            letras[j] = palabra.charAt(i);
            j++;
        }
        System.out.println("Palabra invertida");
        for (char c : letras) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
