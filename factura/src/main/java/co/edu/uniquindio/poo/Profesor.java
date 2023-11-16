package co.edu.uniquindio.poo;

public class Profesor extends Cliente {
    
    private TitulacionProfesor titulo;

    public Profesor (String nroCedula, String nombre, String apellido, String email, TitulacionProfesor titulo){
        super(nroCedula, nombre, apellido, email);

        assert titulo != null;
        this.titulo = titulo;
    }

    public TitulacionProfesor getTitulacionProfesor (){
        return this.titulo;
    }

    @Override

    public double descuentoCliente(){

        double descuento = 0;
        if (this.titulo == TitulacionProfesor.Auxiliar){
            descuento = 0.03;
        }
        
        if (this.titulo == TitulacionProfesor.Asistente){
            descuento = 0.05;
        }

        if (this.titulo == TitulacionProfesor.Asociado){
            descuento = 0.1;
        }

        if (this.titulo == TitulacionProfesor.Titular ){
            descuento =0.16;
        }
        else {
            descuento = 0;
        }
        return descuento;
    }


}