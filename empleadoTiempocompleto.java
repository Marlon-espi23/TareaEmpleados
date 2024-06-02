public class empleadoTiempocompleto extends empleado {

    private double salarioAnual;

    public empleadoTiempocompleto(String nombre, String numeroIdentificacion, double salarioAnual) {
        super(nombre, numeroIdentificacion);
        this.salarioAnual = salarioAnual;
    
    }
    @Override
    public double CalcularSalario() {
        return salarioAnual / 12; // Salario mensual

}
