package padroesestruturais.bridgecristiano;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComandanteTest {

    @Test
    void deveRetornarSalarioComandanteComSoldado() {
        Patente patente = new Soldado();
        Comandante comandante = new Comandante(3000.0f);
        comandante.setPatente(patente);
        assertEquals(4725.0f, comandante.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioComandanteComSargento() {
        Patente patente = new Sargento();
        Comandante comandante = new Comandante(3000.0f);
        comandante.setPatente(patente);
        assertEquals(4950.0f, comandante.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioComandanteComCapitao() {
        Patente patente = new Capitao();
        Comandante comandante = new Comandante(3000.0f);
        comandante.setPatente(patente);
        assertEquals(5400.0f, comandante.calcularSalario(), 0.01f);
    }
}
