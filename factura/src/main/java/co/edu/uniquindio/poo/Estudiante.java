package co.edu.uniquindio.poo;

public class Estudiante extends Cliente {

    private int semestre;

    public Estudiante(String nroCedula, String nombre, String apellido, String email, int semestre) {
        super(nroCedula, nombre, apellido, email);
        assert semestre >= 0 && semestre <= 10;
        this.semestre = semestre;
    }

    public int getSemestre() {
        return this.semestre;
    }

    @Override
    public double descuentoCliente() {
        return 0.012 * semestre;
    }
}

