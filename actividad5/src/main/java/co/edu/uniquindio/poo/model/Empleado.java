package co.edu.uniquindio.poo.model;



public abstract class Empleado {
    protected String nombre;
    protected String documento;
    protected int edad;
    protected float salarioBase;
    protected CategoriaEmpleado categoriaEmpleado;
    protected float descuentoSalud;
    protected float descuentoPension;

    public Empleado(String nombre, String documento, int edad,
                    float salarioBase, CategoriaEmpleado categoriaEmpleado, float descuentoSalud, float descuentoPension) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.salarioBase = salarioBase;
        this.categoriaEmpleado = categoriaEmpleado;
        this.descuentoSalud = descuentoSalud;
        this.descuentoPension = descuentoPension;
    }
    public Empleado(String nombre,String documento,float salarioBase){
        this.nombre = nombre;
        this.documento = documento;
        this.salarioBase = salarioBase;

    }
    public Empleado (String documento){
        this.documento = documento;
    }

    public Empleado(String nombre, String documento, float salarioBase, CategoriaEmpleado categoriaEmpleado) {
        this.nombre = nombre;
        this.documento = documento;
        this.salarioBase = salarioBase;
        this.categoriaEmpleado = categoriaEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getDescuentoSalud() {
        return descuentoSalud;
    }

    public void setDescuentoSalud(float descuentoSalud) {
        this.descuentoSalud = descuentoSalud;
    }

    public CategoriaEmpleado getCategoriaEmpleado() {
        return categoriaEmpleado;
    }

    public void setCategoriaEmpleado(CategoriaEmpleado categoriaEmpleado) {
        this.categoriaEmpleado = categoriaEmpleado;
    }

    public float getDescuentoPension() {
        return descuentoPension;
    }

    public void setDescuentoPension(float descuentoPension) {
        this.descuentoPension = descuentoPension;
    }

    public abstract float calcularSalarioNeto();
    public int calcularBonificacionCategoria(){
            int bonificacion =0;
        if(categoriaEmpleado == CategoriaEmpleado.JUNIOR ){
        bonificacion = 5;
        }
        else if(categoriaEmpleado == CategoriaEmpleado.SEMI_SENIOR){
            bonificacion = 10;
        }
        else if(categoriaEmpleado == CategoriaEmpleado.SENIOR){
            bonificacion = 15;
        }
        else{
            bonificacion = 0;
        }
        return bonificacion;
    }
    public float calcularDescuentos(){
        return 0;
    }
    public float calcularSalarioBruto(){
        return 0;
    }
    public String mostrarInformacion(){
        return "";
    }
    public ResumenPago generarResumenPago(){
        return new ResumenPago(
                documento,
                nombre,
                calcularSalarioBruto(),
                (descuentoSalud+descuentoPension),
                salarioBase);
    }
    public boolean buscarEmpleado(String docuemento){
        if(this.documento.equalsIgnoreCase(docuemento)){
            return true;
        }
        else{
            return false;
        }
    }


}
