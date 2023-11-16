package co.edu.uniquindio.poo;

public class Dulces extends Producto {

    private float porcentajeAzucar;

    public Dulces(String nombre, int valor, float porcentajeAzucar) {
        super(nombre, valor);
        assert porcentajeAzucar >= 0;
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public float getPorcentajeAzucar() {
        return this.porcentajeAzucar;
    }

    @Override
    public double calcularImpuesto() {
        double impuesto = 0.1;
        if (this.porcentajeAzucar > 50) {
            impuesto = 0.2;
        }

        return impuesto;
    }

    @Override
    public double calcularPrecio() {
        double precio = valor * (1 + calcularImpuesto());
        return precio;
    }
}
