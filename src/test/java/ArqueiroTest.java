package test.java;

import main.java.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArqueiroTest {

    @Test
    void deveRetornarDanoArqueiroBronze() {
        Rank rank = new Bronze();
        Arqueiro arqueiro = new Arqueiro();
        arqueiro.setRank(rank);
        // 120.0 * (1 + 0.0)
        assertEquals(120.0f, arqueiro.calcularDanoFinal(), 0.01f);
    }

    @Test
    void deveRetornarDanoArqueiroPrata() {
        Rank rank = new Prata();
        Arqueiro arqueiro = new Arqueiro();
        arqueiro.setRank(rank);
        // 120.0 * (1 + 0.1)
        assertEquals(132.0f, arqueiro.calcularDanoFinal(), 0.01f);
    }

    @Test
    void deveRetornarDanoArqueiroOuro() {
        Rank rank = new Ouro();
        Arqueiro arqueiro = new Arqueiro();
        arqueiro.setRank(rank);
        // 120.0 * (1 + 0.25)
        assertEquals(150.0f, arqueiro.calcularDanoFinal(), 0.01f);
    }

    @Test
    void deveRetornarDanoArqueiroDiamante() {
        Rank rank = new Diamante();
        Arqueiro arqueiro = new Arqueiro();
        arqueiro.setRank(rank);
        // 120.0 * (1 + 0.5)
        assertEquals(180.0f, arqueiro.calcularDanoFinal(), 0.01f);
    }
}