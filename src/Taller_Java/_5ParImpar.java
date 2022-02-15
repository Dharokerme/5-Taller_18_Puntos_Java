package Taller_Java;

/**
 * Programa que muestra los numeros impares y pares del 1 al 100 con un ciclo while
 */
public class _5ParImpar {

    public void mostrarParImpar(){
        int numero = 1;
        while (numero <= 100) {
            if (numero % 2 == 0) {
                System.out.println(numero + " es par");
            } else {
                System.out.println(numero + " es impar");
            }
            numero++;
        }
    }
}
