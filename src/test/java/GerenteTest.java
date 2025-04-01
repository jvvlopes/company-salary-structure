import Roles.Gerente;
import Education.Mestrado;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {
    @Test
    void testSalarioGerenteMestrado() {
        Gerente gerente = new Gerente(8000, new Mestrado());
        assertEquals(11600, gerente.calcularSalario(), 0.01);
    }
}
