package Roles;

import Education.EducationLevel;

public class Designer extends Cargo {
    public Designer(double salarioBase, EducationLevel educationLevel) {
        super(salarioBase, educationLevel);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * (1 + educationLevel.percentualAumento()) + 500;
    }
}
