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
public class VerificarSalarioNoNegativoExcepcionTest {
    private static final Logger LOG =Logger.getLogger(VerificarSalarioNoNegativoTest.class.getName());

    /*
     * (7).Verificar que se lance excepción si el salario base es negativo.
     * */
    @Test
    public void verificarSalarioNoNegativo(){
        LOG.info("Inicio del test");

        Empleado emp = new EmpleadoPlanta(null,null,20,
                0,CategoriaEmpleado.JUNIOR,0,200,null,0,0,0);


        assertThrows(IllegalArgumentException.class, () -> emp.calcularSalarioNeto());
        LOG.info("Fin dle tes");
    }
}