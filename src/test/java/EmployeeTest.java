import GraduationLevels.College;
import GraduationLevels.HighSchool;
import GraduationLevels.PostGraduate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testSalaryHighSchool() {
        Employee employee = new Employee("João", 3000, HighSchool.getInstance());
        assertEquals(3000, employee.getSalary());
        assertEquals("João", employee.getName());
    }

    @Test
    void testSalaryCollege() {
        Employee employee = new Employee("Pedro", 3000, College.getInstance());
        assertEquals(3600, employee.getSalary());
        assertEquals("Pedro", employee.getName());
    }

    @Test
    void testSalaryPostGraduate() {
        Employee employee = new Employee("Davi", 3000, PostGraduate.getInstance());
        assertEquals(4500, employee.getSalary());
        assertEquals("Davi", employee.getName());
    }
}
