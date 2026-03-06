import java.time.LocalDate;

public class PersonalAdministrativo extends Trabajador {

    private final String departamento;
    private final int nivel;

    public PersonalAdministrativo(String nombre, String apellidos, String dni, LocalDate fechaIncorporacion, Double salarioBase, String departamento, int nivel) {
        super(nombre, apellidos, dni, fechaIncorporacion, salarioBase);
        this.departamento = departamento;
        this.nivel = nivel;
    }

    @Override
    public Double calcularSalario() {

        return super.calcularSalario() + ((getSalarioBase()*0.10) * nivel);

    }

    @Override
    public String trabajar() {

        return super.trabajar() + ". Realizo tareas administrativas en mi departamento, específicamente: " + departamento;

    }



}
