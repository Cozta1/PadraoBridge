package test.java;

import main.java.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuerreiroTest {

    @Test
    void deveRetornarDanoGuerreiroBronze() {
        Rank rank = new Bronze();
        Guerreiro guerreiro = new Guerreiro();
        guerreiro.setRank(rank);
        // 110.0 * (1 + 0.0)
        assertEquals(110.0f, guerreiro.calcularDanoFinal(), 0.01f);
    }

    @Test
    void deveRetornarDanoGuerreiroPrata() {
        Rank rank = new Prata();
        Guerreiro guerreiro = new Guerreiro();
        guerreiro.setRank(rank);
        // 110.0 * (1 + 0.1)
        assertEquals(121.0f, guerreiro.calcularDanoFinal(), 0.01f);
    }

    @Test
    void deveRetornarDanoGuerreiroOuro() {
        Rank rank = new Ouro();
        Guerreiro guerreiro = new Guerreiro();
        guerreiro.setRank(rank);
        // 110.0 * (1 + 0.25)
        assertEquals(137.5f, guerreiro.calcularDanoFinal(), 0.01f);
    }

    @Test
    void deveRetornarDanoGuerreiroDiamante() {
        Rank rank = new Diamante();
        Guerreiro guerreiro = new Guerreiro();
        guerreiro.setRank(rank);
        // 110.0 * (1 + 0.5)
        assertEquals(165.0f, guerreiro.calcularDanoFinal(), 0.01f);
    }
}