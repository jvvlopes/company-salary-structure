package GraduationLevels;

import Interface.EducationLevel;

public class College implements EducationLevel {
    private static final College instance = new College();

    private College() {}

    public static College getInstance() {
        return instance;
    }

    @Override
    public double calculateSalary(double baseSalary) {
        return baseSalary * 1.2; // 20% de aumento
    }
}
