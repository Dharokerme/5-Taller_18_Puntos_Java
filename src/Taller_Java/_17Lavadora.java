package Taller_Java;

public class _17Lavadora extends _17Electrodomestico {

    int carga;
    private static final int cargaDefault = 5;

    public _17Lavadora(int precio, int peso, char consumoEnergetico, String color, int carga) {
        super(precio, peso, consumoEnergetico, color);
        this.carga = carga;
        precioFinal();
    }

    public _17Lavadora(int precio, int peso) {
        super(precio, peso);
        this.consumoEnergetico = consumoDefault;
        this.color = colorDefault;
        this.carga = cargaDefault;
        precioFinal();
    }

    public _17Lavadora() {
        this.peso = pesoDefault;
        this.precio = precioDefault;
        this.consumoEnergetico = consumoDefault;
        this.color = colorDefault;
        this.carga = cargaDefault;
        precioFinal();
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public int precioFinal() {
        super.precioFinal();
        if (carga >= 30) {
            this.precio += 50;
        }
        return getPrecio();
    }
}
