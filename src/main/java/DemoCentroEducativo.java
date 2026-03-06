import java.time.LocalDate;
import java.util.ArrayList;

public class DemoCentroEducativo {

    public static void main(String[] args) {

        ArrayList<Trabajador> trabajadores = new ArrayList<>();

        trabajadores.add(new Profesor("Juanma", "Moreno", "12345678A", LocalDate.parse("2020-06-01"), 1200.00, "Redes", 5));
        trabajadores.add(new Profesor("Pascual", "Pérez", "98765432B", LocalDate.parse("2021-09-09"), 9999.00, "El Taller", 10));
        trabajadores.add(new PersonalAdministrativo("Hecprooll", "GPT", "54332567Z", LocalDate.parse("2023-09-08"), 10.00, "Minecraft", 99));
        trabajadores.add(new PersonalAdministrativo("Pablo", "Gorra", "676767676W", LocalDate.parse("2023-06-07"), 1.00, "ERPvP", 1));

        CentroEducativo centro = new CentroEducativo();

        for (Trabajador t: trabajadores) {

            centro.aniadirTrabajadores(t);

        }

        centro.mostrarTrabajadores();

        System.out.println("El salario medio es de: " + centro.salarioMedio());

        System.out.println("El más antiguo es: " + centro.masAntiguo().toString());

        for (Trabajador t: trabajadores) {

            if (t instanceof Profesor) {

                System.out.println(t.trabajar());

            } else if (t instanceof PersonalAdministrativo) {

                System.out.println(t.trabajar());

            }

        }

    }

}
