import Interface.EducationLevel;

public class Employee {
    private final String name;
    private final double baseSalary;
    private final EducationLevel educationLevel;

    public Employee(String name, double baseSalary, EducationLevel educationLevel) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.educationLevel = educationLevel;
    }

    public double getSalary() {
        return educationLevel.calculateSalary(baseSalary);
    }

    public String getName() {
        return name;
    }
}
