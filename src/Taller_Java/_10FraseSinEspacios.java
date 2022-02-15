package Taller_Java;

import java.util.Scanner;

public class _10FraseSinEspacios {
    public void comprobar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();
        String fraseSinEspacios = frase.replace(" ", "");
        System.out.println("Frase con espacios: " + frase);
        System.out.println("Frase sin espacios: " + fraseSinEspacios);
    }
}
