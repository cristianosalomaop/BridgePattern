package padroesestruturais.bridgecristiano;

public class SoldadoRaso extends Militar {

    private int anosServico;

    public SoldadoRaso(float salarioBase) {
        super(salarioBase);
    }

    public void setAnosServico(int anosServico) {
        this.anosServico = anosServico;
    }

    public float calcularSalario() {
        return this.salarioBase * this.anosServico * (1 + this.patente.percentualAumento());
    }
}
