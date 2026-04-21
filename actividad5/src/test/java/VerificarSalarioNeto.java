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
 */public class VerificarSalarioNeto {
     private static final Logger LOG = Logger.getLogger(VerificarSalarioNeto.class.getName());

     /*
     * Verificar que el salario neto de un empleado temporal sea mayor a cero cuando los días trabajados y el valor día son válidos.
      */
     @Test
     public void verificarSalarioNetoEmpleadoTemporalMayorACero() {

         LOG.info("Inicio del test");

         // Datos válidos
         int diasTrabajados = 10;
         double valorDia = 50000;

         EmpleadoTemporal empleado = new EmpleadoTemporal(null,null,20,
                 10000,CategoriaEmpleado.JUNIOR,2000,2000,
                 null,2,1000,5000);;

         double salarioNeto = empleado.calcularSalarioNeto();

         assertTrue(salarioNeto > 0);

         LOG.info("Fin del test");
     }
}
