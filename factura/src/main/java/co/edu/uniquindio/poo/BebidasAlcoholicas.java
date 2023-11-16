package co.edu.uniquindio.poo;

public abstract class BebidasAlcoholicas extends Bebidas {

    public int contenidoAlcohol;

    public BebidasAlcoholicas(String nombre, int valor, int contenidoAlcohol) {
        super(nombre, valor);
        assert contenidoAlcohol >= 0;
        this.contenidoAlcohol = contenidoAlcohol;
    }

    public int getContenidoAlcohol() {
        return this.contenidoAlcohol;
    }
}
