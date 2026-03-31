package main.java;

public class Guerreiro extends Personagem {

    public Guerreiro() {
        super(110.0f, 1.0f);
    }

    public float calcularDanoFinal() {
        return (this.getDanoBase() * this.getVelAtaqueBase()) * (1 + this.getRank().bonusDano());
    }
}