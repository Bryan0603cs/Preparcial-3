package co.edu.uniquindio.poo;

public class Frutas extends Producto {

    private float pesoKilos;

    public Frutas(String nombre, int valor, float pesoKilos) {
        super(nombre, valor);
        assert pesoKilos > 0;
        this.pesoKilos = pesoKilos;
    }

    public float getPesoKilos() {
        return this.pesoKilos;
    }

    @Override
    public double calcularImpuesto() {
        double impuestoInicial = 0.07;
        double impuestoKilo = 0.01;
        int limiteInicial = 3;
        double impuestoTotal = 0;

        if (this.pesoKilos <= limiteInicial) {
            impuestoTotal = impuestoInicial;
        } else {
            int kilosExtra = Math.round(this.pesoKilos) - limiteInicial;
            double reduccionImpuesto = kilosExtra * impuestoKilo;
            impuestoTotal = impuestoInicial - reduccionImpuesto;
        }

        return impuestoTotal;
    }

    @Override
    public double calcularPrecio() {
        double precio = (2 * valor * pesoKilos) * (1 + calcularImpuesto());
        return precio;
    }
}
