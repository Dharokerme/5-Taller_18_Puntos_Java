package Taller_Java;

import java.util.Scanner;

/**
 * Programa que imprime un número en pantalla ingresado por el usuario hasta el 1000 con aumentos de 2 en 2.
 */
public class _14ImpresionNumero {
    public void comprobar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para comenzar:");
        int numero = sc.nextInt();
        for(int i = numero ; i <= 1000 ; i = i+2) {
            System.out.println(i);
        }
    }
}
