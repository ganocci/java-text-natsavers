package br.unip.natsavers;

public abstract class Personagem {
    public String nome;
    public int HPmax, hp, xp;

    public abstract int atk();
    public abstract int def();

    public Personagem(String nome, int HPmax, int xp) {
        this.nome = nome;
        this.HPmax = HPmax;
        this.xp = xp;
        this.hp = HPmax;
    }
}
