package Taller_Java;

import java.util.Scanner;

/**
 * Programa que muestra un menú con opciones para el usuario con Switch
 */
public class _15Menu {
    public void comprobar() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.println("****** GESTIÓN CINEMATOGRÁFICA ******");
            System.out.println("1- NUEVO ACTOR");
            System.out.println("2- BUSCAR ACTOR");
            System.out.println("3- ELIMINAR ACTOR");
            System.out.println("4- MODIFICAR ACTOR");
            System.out.println("5- VER TODOS LOS ACTORES");
            System.out.println("6- VER PELICULAS DE LOS ACTORES");
            System.out.println("7- VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8- SALIR");
            System.out.println("Ingrese una opcion:");
            opcion = sc.nextInt();
            if (opcion <1 || opcion >8){
                System.out.println("OPCION INCORRECTA");
            }
        } while(opcion != 8);


    }
}
