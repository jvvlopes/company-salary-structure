import Roles.Desenvolvedor;
import Education.Graduacao;
import Education.Mestrado;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesenvolvedorTest {
    @Test
    void testSalarioDesenvolvedorGraduado() {
        Desenvolvedor dev = new Desenvolvedor(5000, new Graduacao());
        assertEquals(5500, dev.calcularSalario(), 0.01);
    }

    @Test
    void testSalarioDesenvolvedorMestrado() {
        Desenvolvedor dev = new Desenvolvedor(5000, new Mestrado());
        assertEquals(6000, dev.calcularSalario(), 0.01);
    }
}