package Roles;

import Education.EducationLevel;

public class Desenvolvedor extends Cargo {
    public Desenvolvedor(double salarioBase, EducationLevel educationLevel) {
        super(salarioBase, educationLevel);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * (1 + educationLevel.percentualAumento());
    }
}
