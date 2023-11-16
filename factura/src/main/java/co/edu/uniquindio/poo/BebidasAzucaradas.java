package co.edu.uniquindio.poo;

public class BebidasAzucaradas extends Bebidas {

    private int porcentajeAzucar;

    public BebidasAzucaradas(String nombre, int valor, int porcentajeAzucar) {
        super(nombre, valor);
        assert porcentajeAzucar >= 0;
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public int getPorcentajeAzucar() {
        return this.porcentajeAzucar;
    }

    @Override
    public double calcularImpuesto() {
        double impuesto = 0.05;
        if (this.porcentajeAzucar >= 35) {
            impuesto = 0.25;
        }

        return impuesto;
    }

    @Override
    public double calcularPrecio() {
        double precio = valor * (1 + calcularImpuesto());
        return precio;
    }
}
