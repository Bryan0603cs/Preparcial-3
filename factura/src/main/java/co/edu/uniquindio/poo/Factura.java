package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Factura {

    private Cliente cliente;
    private List<Producto> productos;

    public Factura(Cliente cliente) {
        assert cliente != null;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void adicionarProducto(Producto producto) {
        assert producto != null;
        productos.add(producto);
    }

    public List<Producto> getProductos() {
        return Collections.unmodifiableList(productos);
    }

    public double calcularPrecioProductos() {
        return productos.stream().mapToDouble(Producto::calcularPrecio).sum();
    }

    public double calcularTotal() {
        double descuento = cliente.descuentoCliente();
        double totalFactura = calcularPrecioProductos() * (1 - descuento);
        return totalFactura;
    }
}
