/**
 * Clase para probar el funcionamiento del código
 * @author Miguel ANgel Medina COrrea
 * @since 2026-04
 *
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.logging.Logger;

import co.edu.uniquindio.poo.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la aplicación
 */public class VerificarDiasTrabajadosEmpleadoTemporalTest {
     private static final Logger LOG = Logger.getLogger(VerificarDiasTrabajadosEmpleadoTemporalTest.class.getName());

   @Test
    public void verificarDiasTrabajadosMayor100(){
       LOG.info("Inicio del test");
       int horasRequeridas = 100;

       ArrayList<Empleado> listaEmpleadosTemporales = new ArrayList<>();
       Empleado empleadoTemporal = new EmpleadoTemporal(null,100);
       Empleado empleadoTemporal2 = new EmpleadoTemporal(null,10);
       Empleado empleadoTemporal3 = new EmpleadoTemporal(null,200);
        listaEmpleadosTemporales.add(empleadoTemporal);
       listaEmpleadosTemporales.add(empleadoTemporal2);
       listaEmpleadosTemporales.add(empleadoTemporal3);

       Empresa empresa = new Empresa(null,listaEmpleadosTemporales);
       ArrayList<Empleado> listaFinal = empresa.obtenerEmpleadosMaxHorasExtras(horasRequeridas,listaEmpleadosTemporales);

       ArrayList<Empleado> listaVerdadera = new ArrayList<>();
       listaVerdadera.add(empleadoTemporal);
       listaVerdadera.add(empleadoTemporal3);

       assertIterableEquals(listaVerdadera,listaFinal);
       LOG.info("Fin del test");
   }
}
