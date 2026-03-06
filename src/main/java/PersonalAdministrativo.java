import java.time.LocalDate;

public class PersonalAdministrativo extends Trabajador {

    private  String departamento;
    private  int nivel;

    /*
    * @author Pablo
    * Getters and setters
    * */

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /*
     * @author Pablo
     * Clase PersonalAdministrativo
     * Constructor que inicializa una instancia de la clase
     * */

    public PersonalAdministrativo(String nombre, String apellidos, String dni, LocalDate fechaIncorporacion, Double salarioBase, String departamento, int nivel) {
        super(nombre, apellidos, dni, fechaIncorporacion, salarioBase);
        this.departamento = departamento;
        this.nivel = nivel;
    }

    /*
     * @author Pablo
     * Constructor Vacío
     * */

    public PersonalAdministrativo() {
    }

    /*
    * @author Pablo
    * Métodos propios de la clase
    * */



    @Override
    public Double calcularSalario() {

        return super.calcularSalario() + ((getSalarioBase()*0.10) * nivel);

    }

    @Override
    public String trabajar() {

        return super.trabajar() + ". Realizo tareas administrativas en mi departamento, específicamente: " + departamento;

    }



}
