package Taller_Java;

public class _1VariablesNumericas {
    int a;
    int b;

    public void evaluar(int a, int b) {
        if (a > b) {
            System.out.println("a es mayor que b.");
        } else if (a < b) {
            System.out.println("a es menor que b.");
        } else {
            System.out.println("a y b son iguales.");
        }
    }
}
