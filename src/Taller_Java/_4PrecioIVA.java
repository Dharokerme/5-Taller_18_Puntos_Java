package Taller_Java;

/**
 * Programa que devuelve el precio del producto con IVA incluido
 */
public class _4PrecioIVA
{
    double iva = 0.21;

    public void calcularPrecio(double precio)
    {
        double almacenaresultado = precio + (precio * iva);
        System.out.println("El precio con IVA del 21% es: $" + almacenaresultado);
    }
}
