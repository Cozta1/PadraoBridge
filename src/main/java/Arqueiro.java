package main.java;

public class Arqueiro extends Personagem {

    public Arqueiro() {
        super(80.0f, 1.5f);
    }

    public float calcularDanoFinal() {
        return (this.getDanoBase() * this.getVelAtaqueBase()) * (1 + this.getRank().bonusDano());
    }
}