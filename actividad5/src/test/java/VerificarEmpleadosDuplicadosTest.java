/**
 * Clase para probar el funcionamiento del código
 * @author Miguel ANgel Medina COrrea
 * @since 2026-04
 *
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import co.edu.uniquindio.poo.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la aplicación
 */
public class VerificarEmpleadosDuplicadosTest {
    private static final Logger LOG = Logger.getLogger(VerificarEmpleadosDuplicadosTest.class.getName());

    @Test
    public void verificarEmpleadosDuplicados(){
        LOG.info("Inicio del test");
        String id1 = "123";
        String id2 = "123";

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        Empresa empresa = new Empresa(null,listaEmpleados);

        Empleado emplePlanta = new EmpleadoPlanta(null,id1,0);
        Empleado emplePlanta2 = new EmpleadoPlanta(null,id2,0);

        listaEmpleados.add(emplePlanta);
        listaEmpleados.add(emplePlanta2);

        Optional<Empleado> empleadoEncontrado1 = empresa.buscarEmpleado(id1);
        Optional<Empleado> empleadoEncontrado2 = empresa.buscarEmpleado(id2);

        assertTrue(empleadoEncontrado1.equals(empleadoEncontrado2));

        LOG.info("Fin del tets");

    }



}
