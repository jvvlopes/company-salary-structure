import Roles.Designer;
import Education.EnsinoMedio;
import Education.Doutorado;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignerTest {
    @Test
    void testSalarioDesignerEnsinoMedio() {
        Designer designer = new Designer(4000, new EnsinoMedio());
        assertEquals(4500, designer.calcularSalario(), 0.01);
    }

    @Test
    void testSalarioDesignerDoutorado() {
        Designer designer = new Designer(4000, new Doutorado());
        assertEquals(5700, designer.calcularSalario(), 0.01);
    }
}