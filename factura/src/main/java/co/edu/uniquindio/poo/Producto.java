package co.edu.uniquindio.poo;

public abstract class Producto implements PrecioFinal{
    
    private String nombre;
    public int valor;

    public Producto (String nombre, int valor ){

        assert nombre != null;
        assert valor >0;

        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre (){
        return this.nombre;
    }

    public int getValor (){
        return this.valor;
    }

}