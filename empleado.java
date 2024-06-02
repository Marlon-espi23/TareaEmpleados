 abstract class empleado {

    private String nombre;
    private String numeroIdentificacion;

    public Empleado(String nombre, String numeroIdentificacion) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getnombre() {
        return nombre;
    }

    public String getnumeroIdentificacion() {
        return numeroIdentificacion;
    }

    //metodo abstracto
    public abstract double CalcularSalario();
}
