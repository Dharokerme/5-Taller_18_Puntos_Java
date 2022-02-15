package Taller_Java;

import java.util.Scanner;

/**
 * Programa que pide una frase cuenta su longitud y cuantas vocales tiene.
 */
public class _11LongitudFraseYContaraeiou {
    public void comprobar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine().toLowerCase();
        int cont = frase.length();
        int cont2 = 0;
        //contar las vocales en la frase
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i)=='a'||frase.charAt(i)=='e'||frase.charAt(i)=='i'||frase.charAt(i)=='o'||frase.charAt(i)=='u'){
                cont2++;
            }
        }

        System.out.println("La longitud de la frase es: " + cont);
        System.out.println("La cantidad de vocales es: " + cont2);
    }
}
