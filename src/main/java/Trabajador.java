import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Trabajador {

    private String nombre;
    private String apellidos;
    private String dni;
    private LocalDate fechaIncorporacion;
    private Double salarioBase;

    public Trabajador() {
    }

    public Trabajador(String nombre) {
        this.nombre = nombre;
    }

    public Trabajador(String nombre, LocalDate fechaIncorporacion) {
        this.nombre = nombre;
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public Trabajador(String nombre, String apellidos, String dni, LocalDate fechaIncorporacion, Double salarioBase) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaIncorporacion = fechaIncorporacion;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double calcularSalario() {

        return salarioBase;

    }

    public String trabajar() {

        return "Estoy Trabajando en el centro educativo";

    }

    public double antiguedad() {

        return ChronoUnit.YEARS.between(fechaIncorporacion, LocalDate.now());

    }

    public String toString() {

        return "Trabajador: " + nombre + ", " + apellidos + " con dni " + dni + " y salario de: " + salarioBase + "€. " +
                "Su fecha de incorporación fué: " + fechaIncorporacion;

    }

}
