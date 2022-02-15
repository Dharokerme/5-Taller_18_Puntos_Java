package Taller_Java;

import java.util.Scanner;

public class _3AreaCirculo {

    public void calcularArea() {
        Scanner sc = new Scanner(System.in);
        //pide el radio
        System.out.println("Ingrese el radio del circulo");
        double radio = Double.parseDouble(sc.nextLine());
        //calcula el area
        double area = Math.PI * Math.pow(radio, 2);
        //muestra el resultado
        System.out.println("El area del circulo es: " + area);


    }
}
