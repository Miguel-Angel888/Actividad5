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
 */public class VerificarMetodoBuscarPorDocumento {
     private static final Logger LOG = Logger.getLogger(VerificarMetodoBuscarPorDocumento.class.getName());

     /*(9).Comprobar que el método buscarPorDocumento()
                            retorne null cuando se busque un documento inexistente.*/

     @Test
    public void verificarBuscarPorDocumento(){

         LOG.info("Inicio del test");
         String id = "123";

         ArrayList<Empleado> listaEmpleados = new ArrayList<>();
         Empleado empPrueba = new EmpleadoPlanta(null,"321",0);
         listaEmpleados.add(empPrueba);

         Empresa empresa = new Empresa(null,listaEmpleados);
         Optional<Empleado> empleadoEncontrado = empresa.buscarEmpleado(id);

         assertTrue(empleadoEncontrado.isEmpty(),"El empleado esta registrado");
         LOG.info("Fin del test");
     }
}
