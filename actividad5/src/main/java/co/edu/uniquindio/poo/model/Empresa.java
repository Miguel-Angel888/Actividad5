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
        this.listaEmpleados = new ArrayList<>();
    }

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.listaEmpleados = new ArrayList<>();
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

    //Registro de empleados
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
    public String registrarEmpleadoPlanta(String nombre,String documento,float salarioBase){
        if(listaEmpleados != null) {

            for (Empleado empleadoAux : listaEmpleados) {
                if (empleadoAux.buscarEmpleado(documento)) {
                    return "El empleado de planta ya esta registrado ";
                }
            }
        }
        Empleado empleado = new EmpleadoPlanta( nombre, documento, salarioBase);
        listaEmpleados.add(empleado);
       return "El empleado de planta fue creado exitosamente";
    }
    public String registrarEmpleadoVentas(String nombre,String documento,float salarioBase){
        if(listaEmpleados != null) {

            for (Empleado empleadoAux : listaEmpleados) {
                if (empleadoAux.buscarEmpleado(documento)) {
                    return "El empleado de ventas ya esta registrado ";
                }
            }
        }
        Empleado empleado = new EmpleadoVentas( nombre, documento, salarioBase);
        listaEmpleados.add(empleado);
        return "El empleado de ventas fue creado exitosamente";
    }
    public String registrarEmpleadoTemporal(String nombre,String documento,float salarioBase){
        if(listaEmpleados != null) {

            for (Empleado empleadoAux : listaEmpleados) {
                if (empleadoAux.buscarEmpleado(documento)) {
                    return "El empleado temporal ya esta registrado ";
                }
            }
        }
        Empleado empleado = new EmpleadoTemporal( nombre, documento, salarioBase);
        listaEmpleados.add(empleado);
        return "El empleado temporal fue creado exitosamente";
    }


    private Optional<Empleado> buscarEmpleado(String documento) {
        return listaEmpleados.stream().
                filter(empleado -> empleado.getDocumento().equalsIgnoreCase(documento)).findAny();
    }
    public String buscarEmpleadoPorDocumento(String docuemnto){
       String infoEmpelado = "";
        Optional<Empleado> empleado = buscarEmpleado((docuemnto));


        if(empleado.isPresent()){
            Empleado empleadoAux = listaEmpleados.stream().filter(
                    (empleado1 -> empleado1.getDocumento().equals(docuemnto)))
                    .findFirst().orElseThrow(() -> new RuntimeException("Empleado no encontrado"));
            infoEmpelado = "Nombre empleado: "+empleadoAux.getNombre()+"\n" +
                    "Documento: "+empleadoAux.getDocumento()+"\n" +
                    "Salario base: "+empleadoAux.getSalarioBase();
        }
        else {
            return "Empleado no encontrado";
        }
        return infoEmpelado;
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
    public String listarTodosLosEmpleado(){
        String listaEmpleadosPlanta = listarEmpleadosTipoPlanta();
        String listaEmpleadosVentas = listarEmpleadosTipoVentas();
        String listaEmpleadosTemporales = listarEmpleadosTipoTemporales();
        String listaFinal ="Lista empleados tipo planta: \n"+listaEmpleadosPlanta+
                "\nLista empleados tipo ventas: \n"+listaEmpleadosVentas+
                "\nLista emplaeados tipo temporales: \n"+listaEmpleadosTemporales;
       return listaFinal;
    }
    public Optional<Empleado> conocerEmpleadoMayorSalario(){
        return listaEmpleados.stream().max(Comparator.comparingDouble(Empleado::getSalarioBase));

        }
    public String mostrarInfoEmpleadoMayorSalario(){
        String mensaje = "";
        float salarioFinal = 0;
        Optional<Empleado> empleadoMayorSalario = conocerEmpleadoMayorSalario();
        if(empleadoMayorSalario.isEmpty()){
            return "No hay empleados registrados";
        }
        if(empleadoMayorSalario.isPresent()){
           Empleado empleadoAux =  empleadoMayorSalario.get();
           salarioFinal = empleadoAux.calcularSalarioBruto();
           mensaje = "Nombre empleado: "+empleadoAux.getNombre()+"\n" +
                    "Documento: "+empleadoAux.getDocumento()+"\n" +
                    "Salario del empleado: "+salarioFinal;
        }
        return mensaje;
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
