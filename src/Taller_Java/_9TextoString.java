package Taller_Java;

import java.util.Scanner;
/**
 * Programa que pide una frase y la concatena con una frase anterior ya guardada.
 */
public class _9TextoString {
    public void comprobar() {
        Scanner scn = new java.util.Scanner(System.in);
        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        String texto2 = texto.replace('a', 'e');
        System.out.println("Introduce una frase a concatenar:");
        String textoAconatenar = scn.nextLine();
        String texto3 = texto +" "+ textoAconatenar;
        System.out.println(texto3);
    }
}
