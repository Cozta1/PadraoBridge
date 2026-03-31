package test.java;

import main.java.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagoTest {

    @Test
    void deveRetornarDanoMagoBronze() {
        Rank rank = new Bronze();
        Mago mago = new Mago();
        mago.setRank(rank);
        // 120.0 * (1 + 0.0)
        assertEquals(120.0f, mago.calcularDanoFinal(), 0.01f);
    }

    @Test
    void deveRetornarDanoMagoPrata() {
        Rank rank = new Prata();
        Mago mago = new Mago();
        mago.setRank(rank);
        // 120.0 * (1 + 0.1)
        assertEquals(132.0f, mago.calcularDanoFinal(), 0.01f);
    }

    @Test
    void deveRetornarDanoMagoOuro() {
        Rank rank = new Ouro();
        Mago mago = new Mago();
        mago.setRank(rank);
        // 120.0 * (1 + 0.25)
        assertEquals(150.0f, mago.calcularDanoFinal(), 0.01f);
    }

    @Test
    void deveRetornarDanoMagoDiamante() {
        Rank rank = new Diamante();
        Mago mago = new Mago();
        mago.setRank(rank);
        // 120.0 * (1 + 0.5)
        assertEquals(180.0f, mago.calcularDanoFinal(), 0.01f);
    }
}