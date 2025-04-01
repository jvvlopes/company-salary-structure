package Roles;

import Education.EducationLevel;

public class Gerente extends Cargo {
    public Gerente(double salarioBase, EducationLevel educationLevel) {
        super(salarioBase, educationLevel);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * (1 + educationLevel.percentualAumento()) + 2000;
    }
}
