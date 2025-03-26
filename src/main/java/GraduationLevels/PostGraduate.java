package GraduationLevels;

import Interface.EducationLevel;

public class PostGraduate implements EducationLevel {
    private static final PostGraduate instance = new PostGraduate();

    private PostGraduate() {}

    public static PostGraduate getInstance() {
        return instance;
    }

    @Override
    public double calculateSalary(double baseSalary) {
        return baseSalary * 1.5; // 50% de aumento
    }
}
