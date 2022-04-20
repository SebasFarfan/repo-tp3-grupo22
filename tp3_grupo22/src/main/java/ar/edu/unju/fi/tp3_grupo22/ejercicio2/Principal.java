package ar.edu.unju.fi.tp3_grupo22.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int numeros[] = new int[11];
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        String resp = "s";
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }
        System.out.println("\n -------- Tabla de multiplicación -------- \n");
        while (!resp.equalsIgnoreCase("n")) {
            try {
                System.out.print("Ingrese un nro: ");
                numero = entrada.nextInt();
                if (numero >= 1 && numero <= 9) {
                    System.out.println("--------------------------------------");
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.println(numero + "X" + numeros[i] + "=" + numero * numeros[i]);
                    }
                    System.out.println("--------------------------------------");
                    System.out.print("Desea Ingresar otro número? S/N ");
                    resp = entrada.next();
                } else {
                    System.out.println("Valor tiene que ser entre 1 y 9 \n");                    
                }
            } catch (InputMismatchException e) {
                System.out.println("Valor Ingresado no es número!!");
                System.out.println("Ingrese de nuevo!! \n");
                entrada.next();
            }

        }
        entrada.close();
    }
}
