package co.edu.uniquindio.poo.model;

public class EmpleadoTemporal extends Empleado{
    private int diasTrabajados;
    private float valorDia;

    public EmpleadoTemporal(String nombre, String documento, int edad, float salarioBase, CategoriaEmpleado categoriaEmpleado,
                            float descuentoSalud, float descuentoPension, int diasTrabajados, float valorDia) {
        super(nombre, documento, edad, salarioBase, categoriaEmpleado, descuentoSalud, descuentoPension);
        this.diasTrabajados = diasTrabajados;
        this.valorDia = valorDia;
    }
    public EmpleadoTemporal(String nombre,String documento,float salarioBase){
        super(nombre,documento,salarioBase);
        this.nombre = nombre;
        this.documento = documento;
        this.salarioBase = salarioBase;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public float getValorDia() {
        return valorDia;
    }

    public void setValorDia(float valorDia) {
        this.valorDia = valorDia;
    }
    @Override
    public float calcularSalarioBruto(){
        int bonificacion = saberCategoriaEmpleado();

        float pagoDiasTrabajados = diasTrabajados*valorDia;
        float salarioFinal = (salarioBase*bonificacion)/100;
        return salarioFinal+pagoDiasTrabajados;
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
