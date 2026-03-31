package main.java;

public class Mago extends Personagem {

    public Mago() {
        super(150.0f, 0.8f);
    }

    public float calcularDanoFinal() {
        return (this.getDanoBase() * this.getVelAtaqueBase()) * (1 + this.getRank().bonusDano());
    }
}