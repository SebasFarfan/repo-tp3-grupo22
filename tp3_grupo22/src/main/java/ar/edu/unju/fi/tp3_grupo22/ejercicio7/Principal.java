package ar.edu.unju.fi.tp3_grupo22.ejercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<String>();
        Scanner entrada = new Scanner(System.in);
        String resp = "s";
        String fruta = "";
        int indice = 0;

        while (!resp.equalsIgnoreCase("n")) {
            System.out.print("Ingrese una Fruta: ");
            fruta = entrada.next();
            frutas.add(fruta);
            System.out.print("\n ¿Desea Ingresar más datos? S/N : ");
            resp = entrada.next();
        }
        
        for (String f : frutas) {            
            if (indice % 2 == 0) {
                System.out.println("Indice " + indice + ": " + f);
            }
            indice += 1;
        }

        while (true) {
            try {
                System.out.print("\n -------- Ingrese un nro:");
                indice = entrada.nextInt();
                if (indice<frutas.size()) {
                    frutas.remove(indice);
                    for (String f : frutas) {
                        System.out.println(f);
                    }
                    System.out.println("cantidad de elementos:"+frutas.size());
                    break;
                } else {
                    System.out.println("valor fuera de rango!!");
                    System.out.println("ingrese valor menor a "+frutas.size());
                }
            } catch (Exception e) {
                System.out.println("Valor ingresaso NO valido!!");
                entrada.next();
            }
        }


        entrada.close();


    }
}
