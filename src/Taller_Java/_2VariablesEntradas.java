package Taller_Java;

import java.util.Scanner;

/**
 * @author Juan Esteban Cardona
 *
 */
public class _2VariablesEntradas {
    int numero1;
    int numero2;

    public void comprobar() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2 = entrada.nextInt();

        if (numero1 > numero2) {
            System.out.println("El numero mayor es: " + numero1);

        } else if (numero2 > numero1) {
            System.out.println("El numero mayor es: " + numero2);
        } else {
            System.out.println("Los numeros son iguales.");
        }
    }

}


