package Taller_Java;

/**
 * Programa que muestra los numeros impares y pares del 1 al 100 con un ciclo for
 */
public class _6ParImparFor {
    public void mostrarParImpar() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Par: " + i);
            } else {
                System.out.println("Impar: " + i);
            }
        }
    }
}

