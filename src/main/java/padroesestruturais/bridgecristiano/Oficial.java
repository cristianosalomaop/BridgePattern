package padroesestruturais.bridgecristiano;

public class Oficial extends Militar {

    public Oficial(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.patente.percentualAumento());
    }
}
