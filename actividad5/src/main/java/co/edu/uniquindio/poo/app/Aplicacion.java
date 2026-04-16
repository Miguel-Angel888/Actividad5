package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.CategoriaEmpleado;
import co.edu.uniquindio.poo.model.EmpleadoPlanta;
import co.edu.uniquindio.poo.model.Empresa;

import javax.swing.*;

public class Aplicacion {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Uniquindipo");

        boolean salida = false;
        while(!salida){
            int numeroEscogido = Integer.valueOf(JOptionPane.showInputDialog(null,"Introduzca la funcionalidad que desea usar:\n" +
                    "(1).Agregar un nuevo empleado de planta\n" +
                    "(2).Agregar un nuevo empleado de ventas\n" +
                    "(3).Agregar un nuevo empleado temporal\n" +
                    "(4).Mostrar todos los empleados\n" +
                    "(5).Buscar empleado por documento\n" +
                    "(6).Mostrar empleado con mayor salario neto\n" +
                    "(7).Mostrar nomina total\n" +
                    "(8).Mostrar resumen de pagos\n" +
                    "(9).Salir"));
           switch (numeroEscogido){
               case 1: String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del empleado que desea agregar:");
                        String docuemnto = JOptionPane.showInputDialog(null,"Ingrese el documento de la persona: ");
                        float salarioBase = Float.valueOf(JOptionPane.showInputDialog(null,"Ingrese el salario base del empleado: "));

           }
        }
    }
}
