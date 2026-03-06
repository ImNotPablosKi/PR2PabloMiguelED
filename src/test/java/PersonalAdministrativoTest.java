import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonalAdministrativoTest {

    @Test
    void testCalcularSalario() {

        PersonalAdministrativo p = new PersonalAdministrativo("A", "ni idea", "12345678A", LocalDate.parse("2025-01-01"), 1000.0, "BBDD", 10);

        assertEquals(2000.0, p.calcularSalario());

    }

    @Test
    void testTrabajarPersonal() {
    }

    @Test
    void  testConstructorPersonal() {

       PersonalAdministrativo p = new PersonalAdministrativo("Pascual", "Pérez", "98765432B", LocalDate.parse("2021-09-09"), 9999.00, "El Taller", 10);

        assertEquals("Pascual", p.getNombre());

    }

}