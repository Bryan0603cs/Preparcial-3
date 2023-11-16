package co.edu.uniquindio.poo;

public abstract class Cliente implements Descuento {
    
    private String nroCedula;
    private String nombre;
    private String apellido;
    private String email;

    public Cliente (String nroCedula, String nombre, String apellido, String email){

        assert nroCedula != null;
        assert nombre != null;
        assert apellido != null;
        assert email != null;

        this.nroCedula = nroCedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        
    }
public String getNrocedula (){
    return this.nroCedula;
}
public String getNombre (){
    return this.nombre;
} 
public String getApellido (){
    return this.apellido;
}
public String getEmail (){
    return this.email;
}

}