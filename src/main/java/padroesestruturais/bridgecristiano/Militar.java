package padroesestruturais.bridgecristiano;

public abstract class Militar {

    protected Patente patente;
    protected float salarioBase;

    public Militar(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setPatente(Patente patente) {
        this.patente = patente;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();
}
