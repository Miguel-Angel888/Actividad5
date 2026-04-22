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
 */public class VerificarSalarioNetoMayorSalarioBaseTest {
     private static final Logger LOG = Logger.getLogger(VerificarSalarioNetoMayorSalarioBaseTest.class.getName());

     /*(13).Verificar que el método calcularSalarioNeto() de un empleado de planta sea mayor que su salario base.
     *                     */
   @Test
   public void VerificarSalarioNetoMayorSalarioBase (){
       LOG.info("Inicio del test ");

       Empleado empleado = new EmpleadoPlanta(null,null,20,
               10000,CategoriaEmpleado.JUNIOR,2000,2000,
               null,2,1000,5000);
       float salarioNeto =  empleado.calcularSalarioNeto();

       assertTrue(salarioNeto > empleado.getSalarioBase());
       LOG.info("Fin del test");
   }
}
