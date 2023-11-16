package co;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.Agua;
import co.edu.uniquindio.poo.Estudiante;
import co.edu.uniquindio.poo.Factura;
import co.edu.uniquindio.poo.Frutas;
import co.edu.uniquindio.poo.Panaderia;

public class FacturaTest {

    private static final Logger LOG = Logger.getLogger(Factura.class.getName());
    
    @Test
    public void datosValidos() {
        LOG.info("Inicio de prueba datos validos");
        Estudiante cliente = new Estudiante ("123", "juan", "perez", "bryanb.cardenass@uqvirtual.edu.co", 2);
        Panaderia pan = new Panaderia("pan de la abuela", 1000, true);
        Frutas papaya = new Frutas("papaya", 1000, 4);
        Agua agua = new Agua("agua con gas", 2000);
        Factura factura = new Factura(cliente);
        factura.adicionarProducto(pan);
        factura.adicionarProducto(papaya);
        factura.adicionarProducto(agua);


       
        assertEquals("123",cliente.getNrocedula());
        assertEquals("juan",cliente.getNombre());
        assertEquals("perez",cliente.getApellido());
        assertEquals("bryanb.cardenass@uqvirtual.edu.co",cliente.getEmail());
        assertEquals(2, cliente.getSemestre());

     
        assertEquals("pan de la abuela", pan.getNombre());
        assertEquals(1000, pan.getValor());
        assertEquals(true, pan.tieneConservantes());


    
        assertEquals("papaya", papaya.getNombre());
        assertEquals(1000, papaya.getValor());
        assertEquals(4, papaya.getPesoKilos());

     
        assertEquals("agua con gas", agua.getNombre());
        assertEquals(2000, agua.getValor());

        
        
        assertEquals(3, factura.getProductos().size());
        assertEquals(11660.0, factura.calcularPrecioProductos());

        
        assertEquals(11380.16, factura.calcularTotal());
        LOG.info("Fin de prueba datos validos");
    }
    }