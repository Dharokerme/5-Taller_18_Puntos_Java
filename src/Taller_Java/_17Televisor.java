package Taller_Java;

public class _17Televisor extends _17Electrodomestico{
    int resolucion;
    boolean TDT;
    private static final int resolucionDefault = 20;
    private static final boolean tdtDefault = false;

    public _17Televisor(int precio, int peso, char consumoEnergetico, String color, int resolucion, boolean TDT) {
        super(precio, peso, consumoEnergetico, color);
        this.resolucion = resolucion;
        this.TDT = TDT;
        precioFinal();
    }

    public _17Televisor(int precio, int peso) {
        super(precio, peso);
        this.consumoEnergetico = consumoDefault;
        this.color = colorDefault;
        this.resolucion = resolucionDefault;
        this.TDT = tdtDefault;
        precioFinal();
    }

    public _17Televisor(){
        this.peso = pesoDefault;
        this.precio = precioDefault;
        this.consumoEnergetico = consumoDefault;
        this.color = colorDefault;
        this.resolucion = resolucionDefault;
        this.TDT = tdtDefault;
        precioFinal();
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    @Override
    public int precioFinal(){
        super.precioFinal();
        if (getResolucion() > 40){
            this.precio += getPrecio() * 0.3;
        }
        if (isTDT()){
            this.precio += 50;
        }
        return getPrecio();
    }

}

