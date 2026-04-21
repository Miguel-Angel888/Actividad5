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
public class VerificarSalarioNoNegativoTest {
    private static final Logger LOG =Logger.getLogger(VerificarSalarioNoNegativoTest.class.getName());

    /*
    * Verificar que el salario neto nunca sea negativo.
    * */
    @Test
    public void verificarSalarioNoNegativo(){
        LOG.info("Inicio del test");

        Empleado emp = new EmpleadoPlanta(null,null,20,
                10000,CategoriaEmpleado.JUNIOR,2000,
                2000,null,2,1000,5000);

        float salarioEmpleado = emp.calcularSalarioNeto();
        assertTrue(salarioEmpleado >= 0,"El salario no puede ser negativo");
        LOG.info("Fin dle tes");
    }
}
