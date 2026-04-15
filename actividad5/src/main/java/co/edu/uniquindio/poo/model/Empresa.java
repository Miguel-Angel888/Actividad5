package co.edu.uniquindio.poo.model;
//


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

/*Tareeaaaaa lombooook */
public class Empresa {

    private String nombre;
    private ArrayList<Empleado> listaEmpleados;

    public Empresa(String nombre, ArrayList<Empleado> listaEmpleados) {
        this.nombre = nombre;
        this.listaEmpleados = listaEmpleados;
    }

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public String registrarEmpleado(Empleado empleado){
        String respuesta = "";

        Optional<Empleado> empleadoEncontrado = buscarEmpleado(empleado.documento);
        if(empleadoEncontrado.isPresent()){
            respuesta = "El empleado ya existe";
        }
        else {
            listaEmpleados.add(empleado);
            respuesta = "El empleado fue creado exitosamente";
        }
        return respuesta;

    }


    private Optional<Empleado> buscarEmpleado(String documento) {
        return listaEmpleados.stream().
                filter(empleado -> empleado.getDocumento().equalsIgnoreCase(documento)).findAny();
    }
    public String listarEmpleadosTipoPlanta(){
        String resultado = "";
        int numerador = 0;
        for(Empleado empleadoAux: listaEmpleados){
            numerador++;
            if(empleadoAux instanceof EmpleadoPlanta){
                resultado += "("+numerador+"). "+empleadoAux.getNombre();
            }
        }
        if(resultado.equals("")){
            resultado = "No hay empleados de planta registrados";
        }
        return resultado;
    }
    public String listarEmpleadosTipoVentas(){
        String resultado = "";
        int numerador = 0;
        for(Empleado empleadoAux: listaEmpleados){
            numerador++;
            if(empleadoAux instanceof EmpleadoVentas){
                resultado += "("+numerador+"). "+empleadoAux.getNombre();
            }
        }
        if(resultado.equals("")){
            resultado = "No hay empleados de ventas registrados";
        }
        return resultado;
    }
    public String listarEmpleadosTipoTemporales(){
        String resultado = "";
        int numerador = 0;
        for(Empleado empleadoAux: listaEmpleados){
            numerador++;
            if(empleadoAux instanceof EmpleadoTemporal){
                resultado += "("+numerador+"). "+empleadoAux.getNombre();
            }
        }
        if(resultado.equals("")){
            resultado = "No hay empleados temporales registrados";
        }
        return resultado;
    }
    public Optional<Empleado> conocerEmpleadoMayorSalario(){
        return listaEmpleados.stream().max(Comparator.comparingDouble(Empleado::getSalarioBase));

        }
    public double calcularNominaTotal(){
        return listaEmpleados.stream().mapToDouble(Empleado::calcularSalarioBruto).sum();
    }
    public String mostrarResumenPagoIndividual(){
        String resultado = "";
        int numerador = 0;
        for(Empleado empleadoAux: listaEmpleados){
            numerador++;
            resultado += "("+numerador+"). "+empleadoAux.getNombre()+"\n"+empleadoAux.generarResumenPago();
        }
        return resultado;
    }

}
