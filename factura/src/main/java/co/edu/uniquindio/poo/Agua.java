package co.edu.uniquindio.poo;

public class Agua extends Bebidas {

    public Agua(String nombre, int valor) {
        super(nombre, valor);
    }
@Override
    public double calcularImpuesto() {
        return 0;
    }

@Override
    public double calcularPrecio() {
        return this.valor;
    }
}

