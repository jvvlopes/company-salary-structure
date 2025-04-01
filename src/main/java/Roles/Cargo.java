package Roles;

import Education.EducationLevel;

public abstract class Cargo {
    protected double salarioBase;
    protected EducationLevel educationLevel;

    public Cargo(double salarioBase, EducationLevel educationLevel) {
        this.salarioBase = salarioBase;
        this.educationLevel = educationLevel;
    }

    public void setEducationLevel(EducationLevel educationLevel) {
        this.educationLevel = educationLevel;
    }

    public abstract double calcularSalario();
}
