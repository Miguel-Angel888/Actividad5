package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.CategoriaEmpleado;
import co.edu.uniquindio.poo.model.EmpleadoPlanta;
import co.edu.uniquindio.poo.model.Empresa;

public class Aplicacion {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Uniquindipo");

        EmpleadoPlanta empleadoPlanta = new EmpleadoPlanta("Miguel","1091",18,
                10000f,CategoriaEmpleado.SENIOR,12000f,15000f,
                "Jefe",3,20000f,10000f);
    }
}
