import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class CentroEducativo {

    private ArrayList<Trabajador> misTrabajadores;

    public CentroEducativo() {

        this.misTrabajadores = new ArrayList<>();

    }

    public CentroEducativo(ArrayList<Trabajador> misTrabajadores) {
        this.misTrabajadores = misTrabajadores;
    }

    public void aniadirTrabajadores(Trabajador trabajador) {

        misTrabajadores.add(trabajador);

    }

    public void mostrarTrabajadores() {

        for (Trabajador t: misTrabajadores) {

            System.out.println(t.toString());

        }

    }

    public Double salarioMedio() {

        int total = 0;

        for (Trabajador t: misTrabajadores) {

            total += t.calcularSalario();

        }

        return (double) total / misTrabajadores.size();

    }

    public Trabajador masAntiguo() {

        Trabajador masAntiguo = new Trabajador("Cosa", LocalDate.now());

        for (Trabajador t: misTrabajadores) {

            if (t.antiguedad() > masAntiguo.antiguedad()) {

                masAntiguo = t;

            }

        }

        return masAntiguo;

    }

    public void buscarTrabajador(String target) {

        for (Trabajador t: misTrabajadores) {

            if (target.equalsIgnoreCase(t.getNombre())) {

                t.toString();

            }

        }

        if (target.equalsIgnoreCase("Profesor")) {

            for (Trabajador t: misTrabajadores) {

                if (t instanceof Profesor) {

                    t.toString();

                }

            }

        } else if (target.equalsIgnoreCase("PersonalAdministrativo")) {

            for (Trabajador t: misTrabajadores) {

                if (t instanceof PersonalAdministrativo) {

                    t.toString();

                }

            }

        }

    }

}
