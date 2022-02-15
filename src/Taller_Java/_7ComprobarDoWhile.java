package Taller_Java;

import java.util.Scanner;

/**
 * Programa que lee un número y comprueba si es mayor que cero usando Do While
 */
public class _7ComprobarDoWhile {

    public void comprobarNumero() {
        int numero;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce un numero");
            numero = Integer.parseInt(sc.nextLine());
        } while (numero < 0);
        System.out.println("El numero es"+numero);
    }
}
