package padroesestruturais.bridgecristiano;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OficialTest {

    @Test
    void deveRetornarSalarioOficialComSoldado() {
        Patente patente = new Soldado();
        Oficial oficial = new Oficial(2000.0f);
        oficial.setPatente(patente);
        assertEquals(2100.0f, oficial.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioOficialComSargento() {
        Patente patente = new Sargento();
        Oficial oficial = new Oficial(2000.0f);
        oficial.setPatente(patente);
        assertEquals(2200.0f, oficial.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioOficialComCapitao() {
        Patente patente = new Capitao();
        Oficial oficial = new Oficial(2000.0f);
        oficial.setPatente(patente);
        assertEquals(2400.0f, oficial.calcularSalario(), 0.01f);
    }
}
