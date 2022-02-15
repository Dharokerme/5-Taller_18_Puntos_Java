package Taller_Java;

import java.util.Locale;
import java.util.Scanner;

/**
 * Programa que pide dos palabras, indica si son iguales y cuantas letras distintas tiene.
 */
public class _12PalabrasDistintas {
    public void comprobar() {
        String palabra1, palabra2;
        int distintas;
        Scanner sc = new Scanner(System.in);

        System.out.println("Las palabras deben ser de la misma longitud");
        System.out.print("Introduzca una palabra: ");
        palabra1 = sc.nextLine().toLowerCase();
        System.out.print("Introduzca otra palabra: ");
        palabra2 = sc.nextLine().toLowerCase();

        distintas = 0;
        for (int i = 0; i < palabra1.length(); i++) {
            if (palabra1.charAt(i) != palabra2.charAt(i)) {
                distintas++;
            }
        }

        if (distintas == 0) {
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println("Las palabras son distintas y hay " + distintas + " letras distintas");
        }
    }
}
