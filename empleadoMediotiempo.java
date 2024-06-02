public class empleadoMediotiempo extends empleado{

    private double salarioporHora;
    private int horasTrabajadaPorSemana;


    public empleadoMediotiempo(String nombre, String numeroIdentificacion, double salarioporHora, int horasTrabajadaPorSemana) {
        super(nombre, numeroIdentificacion) {
            this.salarioporHora = salarioporHora;
            this.horasTrabajadaPorSemana = horasTrabajadaPorSemana;
        }
    }
    
    @Override
    public double CalcularSalario() {
        return salarioporHora * horasTrabajadaPorSemana * 4; // Salario mensual
    }


    
}


  

