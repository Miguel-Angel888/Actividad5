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

public class VerificarBonificacionEmplJunior {
    private static final Logger LOG =  Logger.getLogger(VerificarBonificacionEmplJunior.class.getName());

@Test
    public void verificarBonificacionEmpJunior(){
    LOG.info("Inicio del test ");

    Empleado empleadoPlanta = new EmpleadoPlanta(null,null,0);
    int bonificacion = empleadoPlanta.calcularBonificacionCategoria();

    assertNotEquals(0,bonificacion);
    LOG.info("Fin del test");
}
}
