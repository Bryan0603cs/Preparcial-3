package co.edu.uniquindio.poo;

public class Nacionales extends BebidasAlcoholicas {

    private static final double Impuesto = 0.02;

    public Nacionales(String nombre, int valor, int contenidoAlcohol) {
        super(nombre, valor, contenidoAlcohol);
    }

    @Override
    public double calcularImpuesto() {
        return (contenidoAlcohol <= 50) ? Impuesto * contenidoAlcohol : 0;
    }

    @Override
    public double calcularPrecio() {
        return valor + calcularImpuesto();
    }
}
