/**
 * Clase para probar el funcionamiento del código
 * @author Miguel ANgel Medina COrrea
 * @since 2026-04
 *
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */


import java.util.List;
import java.util.logging.Logger;

import co.edu.uniquindio.poo.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la aplicación
 */


public class EmpleadoVentasTest {

    private static final Logger LOG = Logger.getLogger(EmpleadoVentas.class.getName());

    /*
    *Verificar que el salario bruto de un empleado de ventas se calcule correctamente.
    * */
    @Test
    public void calcularSalarioBrutoTest(){
        LOG.info("Inicio del test de el empleado ventas para el salaro bruto");
        float salarioBase = 10000;
        float totalVentas = 5;
        float porcentajeComision = 10;
        float comisionVentas =5*1000/100;

        float salarioBrutoFinal = salarioBase+comisionVentas;
        Empleado empleado = new EmpleadoVentas("x","x",0,salarioBase,
                CategoriaEmpleado.JUNIOR,1000,2000,5,10);
        float calculoSalarioBruto = empleado.calcularSalarioBruto();
        assertEquals(salarioBrutoFinal,calculoSalarioBruto,50);
        LOG.info("Fin del test");
    }
}
