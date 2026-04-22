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
 */public class VerificarEmpleadoMayorSalario {
     private static final Logger LOG = Logger.getLogger(VerificarEmpleadosMayorSalario.class.getName());
     /*(11).
     * */
   @Test
   public void verificarEmpleadoMayorSalario(){

       LOG.info("Inicio del test");
       ArrayList<Empleado> listaEmpleados = new ArrayList<>();
       Empresa empresa = new Empresa(null,listaEmpleados);
       Empleado empleado = new EmpleadoPlanta(null,null,20,
               10000,CategoriaEmpleado.JUNIOR,2000,2000,
               null,2,1000,5000);
       Empleado empleado2 = new EmpleadoPlanta(null,null,20,
               20000,CategoriaEmpleado.JUNIOR,2000,2000,
               null,2,1000,5000);
        listaEmpleados.add(empleado);
       listaEmpleados.add(empleado2);



       Empleado empleadoMayorSalario = empresa.conocerEmpleadoMaximoSalario(listaEmpleados);

       assertEquals(empleadoMayorSalario,empleado2);
       LOG.info("Fin del test");
   }
}
