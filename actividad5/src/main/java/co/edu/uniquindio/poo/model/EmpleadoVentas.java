package co.edu.uniquindio.poo.model;

public class EmpleadoVentas extends Empleado{

    private float totalVentas;
    private float porcentajeComision;

    public EmpleadoVentas(String nombre, String docuemnto, int edad, float salarioBase,
                          CategoriaEmpleado categoriaEmpleado,float descuentoSalud,float descuentoPension,
                          float totalVentas,float porcentajeComision){
        super(nombre,docuemnto,edad,salarioBase,categoriaEmpleado,descuentoSalud,descuentoPension);

        this.totalVentas = totalVentas;
        this.porcentajeComision = porcentajeComision;
    }
    public float getTotalVentas(){
        return totalVentas;
    }
    public void setTotalVentas(float totalVentas){
        this.totalVentas = totalVentas;
    }
    public float getPorcentajeComision(){
        return porcentajeComision;
    }
    public void setPorcentajeComision(float porcentajeComision){
        this.porcentajeComision = porcentajeComision;
    }
    @Override
    public float calcularSalarioBruto(){
        int bonificacion = saberCategoriaEmpleado();
        float comisionFinal = porcentajeComision*totalVentas;
        float salarioFinal = (salarioBase*bonificacion)/100;
        return salarioFinal+comisionFinal;
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
