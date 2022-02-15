package Taller_Java;

import java.util.Scanner;

/**
 * Programa que indica si un día de la semana es laboral o no usando Switch
 */
public class _8DiaSemanaLaboral {
    public void comprobar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un día de la semana: ");
        String dia = sc.nextLine().toLowerCase();
        switch (dia){
            case "lunes":
                System.out.println("Es laboral");
                break;
            case "martes":
                System.out.println("Es laboral");
                break;
            case "miercoles":
                System.out.println("Es laboral");
                break;
            case "jueves":
                System.out.println("Es laboral");
            case "viernes":
                System.out.println("Es laboral");
                break;
            case "sabado":
                System.out.println("No laboral");
                break;
            case "domingo":
                System.out.println("No es laboral");

        }
    }
}
