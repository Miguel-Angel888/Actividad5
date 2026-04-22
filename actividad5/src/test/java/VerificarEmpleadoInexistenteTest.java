/*
        * Clase para probar el funcionamiento del código
 * @author Miguel ANgel Medina COrrea
 * @since 2026-04
        *
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
*/


        import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import co.edu.uniquindio.poo.model.*;
        import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la aplicación
 */public class VerificarEmpleadoInexistenteTest {

     private static final Logger LOG = Logger.getLogger(VerificarEmpleadoInexistenteTest.class.getName());

     /*
     * (6).Verificar que la búsqueda de un empleado inexistente retorne null.
     * */
    @Test
    public void verificarEmpleadoInexistente(){

        LOG.info("Inicio del test");
        String id = "123";

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        Empleado empPrueba = new EmpleadoPlanta(null,"321",0);
        listaEmpleados.add(empPrueba);

        Empresa empresa = new Empresa(null,listaEmpleados);
        Empleado empleadoEncontrado = empresa.buscarEmpleadoDocumento(id);

        assertTrue(empleadoEncontrado == null,"El empleado no esta registrado");
        LOG.info("Fin del test");
    }

 }

