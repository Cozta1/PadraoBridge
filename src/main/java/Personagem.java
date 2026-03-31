package main.java;

public abstract class Personagem {

    private Rank rank;
    private float danoBase;
    private float velAtaqueBase;

    public Personagem(float danoBase, float velAtaqueBase) {
        this.danoBase = danoBase;
        this.velAtaqueBase = velAtaqueBase;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Rank getRank() {
        return this.rank;
    }

    public void setDanoBase(float danoBase) {
        this.danoBase = danoBase;
    }

    public float getDanoBase() {
        return this.danoBase;
    }

    public void setVelAtaqueBase(float velAtaqueBase) {
        this.velAtaqueBase = velAtaqueBase;
    }

    public float getVelAtaqueBase() {
        return this.velAtaqueBase;
    }

    public abstract float calcularDanoFinal();
}