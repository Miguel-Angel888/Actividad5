/**
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
 */


public class VerificacionEmpleadosTest {
    private static final Logger LOG = Logger.getLogger(VerificacionEmpleadosTest.class.getName());

    /*
      (3).Verificar que los empleados almacenados en la empresa sean los correctos.
     */
    @Test
    public void verificarListaEmpleadosTest(){
        LOG.info("Inicio del test");

        ArrayList<Empleado> listaEmpleadosTest = new ArrayList<>();

        Empleado empleadoAux = new EmpleadoVentas("123");
        Empleado empleadoAux2 = new EmpleadoVentas("456");

        listaEmpleadosTest.add(empleadoAux);
        listaEmpleadosTest.add(empleadoAux2);

        Empresa empresa = new Empresa("x", listaEmpleadosTest);

        ArrayList<Empleado> listaPrueba = empresa.listarTodosLosEmpleadosSimple(listaEmpleadosTest);

        assertIterableEquals(listaEmpleadosTest, listaPrueba);

        LOG.info("Fin del test");
    }
}
