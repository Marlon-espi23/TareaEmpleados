public class App {
    public static void main(String[] args) throws Exception {
    

     empleado[] empleados = new empleado[2];

     empleados[0] = new empleadoTiempocompleto("Alex mejia", "0012201006", "6000, 0");
     empleados[1] = new empleadoMediotiempo( "Maria Cardeñal",  "0012024109", "200", 2);

     for (Empleado empleado :empleados) {
        System.out.println("empleado: " + empleado.getnombre() + "salario mensual: $" + empleado.CalcularSalario());

    }}

    
}
