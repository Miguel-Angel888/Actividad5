package co.edu.uniquindio.poo.model;

public class EmpleadoPlanta extends Empleado{

    private String cargo;
    private int horasExtra;
    private float valorHoraExtra;
    private float auxTransporte;

    public EmpleadoPlanta(String nombre, String documento, int edad, float salarioBase, CategoriaEmpleado categoriaEmpleado, float descuentoSalud,
                          float descuentoPension, String cargo, int horasExtra, float valorHoraExtra, float auxTransporte) {
        super(nombre, documento, edad, salarioBase, categoriaEmpleado, descuentoSalud, descuentoPension);
        this.cargo = cargo;
        this.horasExtra = horasExtra;
        this.valorHoraExtra = valorHoraExtra;
        this.auxTransporte = auxTransporte;
    }
    public EmpleadoPlanta(String nombre,String documento,float salarioBase){
        super(nombre,documento,salarioBase);
        this.nombre = nombre;
        this.documento = documento;
        this.salarioBase = salarioBase;

    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public float getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(float valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    public float getAuxTransporte() {
        return auxTransporte;
    }

    public void setAuxTransporte(float auxTransporte) {
        this.auxTransporte = auxTransporte;
    }

    @Override
    public float calcularSalarioNeto(){
        int bonificacion = saberCategoriaEmpleado();
        float salarioBaseFinal = (salarioBase*bonificacion)/100;
        float valorHorasExtras = horasExtra*valorHoraExtra;
        return salarioBaseFinal+valorHorasExtras+auxTransporte;
    }
    public int saberCategoriaEmpleado(){
        String categoria = categoriaEmpleado.name();
        int bonificacion = 0;
        if(categoria.equals("JUNIOR")){
            bonificacion = 5;
        }
        else if(categoria.equals("SEMI_SENIOR")){
            bonificacion = 10;
        }
        else{
            bonificacion = 15;
        }
        return bonificacion;
    }
}
