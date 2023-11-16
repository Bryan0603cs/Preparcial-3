package co.edu.uniquindio.poo;

public class Importadas extends BebidasAlcoholicas {

    private static final double Precio = 1.3;
    private static final double Impuesto = 0.3;

    public Importadas(String nombre, int valor, int contenidoAlcohol) {
        super(nombre, valor, contenidoAlcohol);
    }

    @Override
    public double calcularImpuesto() {
        return 0; // No se aplica impuesto adicional
    }

    @Override
    public double calcularPrecio() {
        return (valor * Precio) * (1 + Impuesto * contenidoAlcohol);
    }
}
