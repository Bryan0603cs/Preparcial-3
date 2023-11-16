package co.edu.uniquindio.poo;

public class Panaderia extends Producto {

    private static final double IMPUESTO_CONSERVANTES = 0.18;

    private boolean conservantes;

    public Panaderia(String nombre, int valor, boolean conservantes) {
        super(nombre, valor);
        this.conservantes = conservantes;
    }

    public boolean tieneConservantes() {
        return this.conservantes;
    }

    @Override
    public double calcularImpuesto() {
        return conservantes ? IMPUESTO_CONSERVANTES : 0;
    }

    @Override
    public double calcularPrecio() {
        return valor + calcularImpuesto() * valor;
    }
}
