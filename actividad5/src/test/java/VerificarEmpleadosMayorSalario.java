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

public class VerificarEmpleadosMayorSalario {
    private static final Logger LOG = Logger.getLogger(VerificacionEmpleadosTest.class.getName());

    /*
       (8).Verificar que el método empleadosConSalarioMayorA(valor) de la clase Empresa retorne exactamente la lista de
       empleados cuyo salario neto es mayor al valor indicado, manteniendo el orden de registro.
    * */

    @Test
    public void obtenerEmpleadosMayorSalario(){
        LOG.info("Inicio del test");

        double salarioMinimo = 15000;
        Empleado emplePlanta = new EmpleadoPlanta(null,null,15000);
        Empleado empleTemporal = new EmpleadoTemporal(null,null,10000);
        Empleado empleVentas = new EmpleadoVentas(null,null,20000);

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(emplePlanta);
        listaEmpleados.add(empleTemporal);
        listaEmpleados.add(empleVentas);

        Empresa empresa = new Empresa(null,listaEmpleados);
        ArrayList<Empleado> empleadosRicos = empresa.conocerEmpleadosMayorSalario(salarioMinimo,listaEmpleados);

        ArrayList<Empleado> listaVerdadera = new ArrayList<>();
        listaVerdadera.add(emplePlanta);
        listaVerdadera.add(empleVentas);

        assertIterableEquals(listaVerdadera,empleadosRicos);
        LOG.info("Fin de la prueba ");

    }
}
