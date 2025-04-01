package padroesestruturais.bridgecristiano;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SoldadoRasoTest {

    @Test
    void deveRetornarSalarioSoldadoRasoComSoldado() {
        Patente patente = new Soldado();
        SoldadoRaso soldadoRaso = new SoldadoRaso(1000.0f);
        soldadoRaso.setPatente(patente);
        soldadoRaso.setAnosServico(2);
        assertEquals(2100.0f, soldadoRaso.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioSoldadoRasoComSargento() {
        Patente patente = new Sargento();
        SoldadoRaso soldadoRaso = new SoldadoRaso(1000.0f);
        soldadoRaso.setPatente(patente);
        soldadoRaso.setAnosServico(2);
        assertEquals(2200.0f, soldadoRaso.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioSoldadoRasoComCapitao() {
        Patente patente = new Capitao();
        SoldadoRaso soldadoRaso = new SoldadoRaso(1000.0f);
        soldadoRaso.setPatente(patente);
        soldadoRaso.setAnosServico(2);
        assertEquals(2400.0f, soldadoRaso.calcularSalario(), 0.01f);
    }
}
