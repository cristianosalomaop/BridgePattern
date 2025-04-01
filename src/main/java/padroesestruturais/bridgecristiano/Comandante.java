package padroesestruturais.bridgecristiano;

public class Comandante extends Militar {

    public Comandante(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * 1.5f * (1 + this.patente.percentualAumento());
    }
}
