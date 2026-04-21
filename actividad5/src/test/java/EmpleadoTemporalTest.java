/**
 * Clase para probar el funcionamiento del código
 * @author Miguel ANgel Medina COrrea
 * @since 2026-04
 *
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */


import java.util.logging.Logger;

import co.edu.uniquindio.poo.model.CategoriaEmpleado;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.EmpleadoTemporal;
import co.edu.uniquindio.poo.model.Empresa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la aplicación
 */

    public class EmpleadoTemporalTest {
        private static final Logger LOG = Logger.getLogger(EmpleadoTemporalTest.class.getName());

        /*
        *Verificar que el salario neto de un empleado temporal no sea igual a 0.
         * */
        @Test
    public void calcularSalarioNetoTest(){
           LOG.info("Inicio del test de el alario neto de emplado temporal");
            Empresa empresa = new Empresa("x");
            Empleado empleado = new EmpleadoTemporal("x","x",0,10000,
                    CategoriaEmpleado.JUNIOR,1000,2000, null, 5,2000, 5000);
            float salarioNeto = empleado.calcularSalarioNeto();
            assertNotEquals(0,salarioNeto);
            LOG.info("Fin del test ");
    }
}
