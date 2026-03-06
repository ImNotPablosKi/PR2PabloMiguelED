import java.time.LocalDate;

public class Profesor extends Trabajador {

    private String especialidad;
    private int horasLectivas;

    public Profesor(String nombre, String apellidos, String dni, LocalDate fechaIncorporacion, Double salarioBase, String especialidad, int horasLectivas) {
        super(nombre, apellidos, dni, fechaIncorporacion, salarioBase);
        this.especialidad = especialidad;
        this.horasLectivas = horasLectivas;
    }

    @Override
    public Double calcularSalario() {

        return super.calcularSalario() + ((getSalarioBase()*0.15) * horasLectivas);

    }

    @Override
    public String trabajar() {

        return super.trabajar() + ". Imparto clase en mi especialidad: " + especialidad;

    }
}
