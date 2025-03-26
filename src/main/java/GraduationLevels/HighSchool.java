package GraduationLevels;

import Interface.EducationLevel;

public class HighSchool implements EducationLevel {
    private static final HighSchool instance = new HighSchool();

    private HighSchool() {}

    public static HighSchool getInstance() {
        return instance;
    }

    @Override
    public double calculateSalary(double baseSalary) {
        return baseSalary; // Sem aumento
    }
}
