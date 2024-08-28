package br.unip.natsavers;

public class Inimigos extends Personagem{

    int xpJogador;

    public Inimigos(String nome, int xpJogador) {
        super(nome, (int) (Math.random()*xpJogador + xpJogador/3 + 5), (int) (Math.random()*(xpJogador/4 + 5)+1));
        this.xpJogador = xpJogador;
    }

    @Override
    public int atk() {
        return (int) (Math.random()*(xpJogador/4 + 4) + xp/4 + 3);
    }

    @Override
    public int def() {
        return (int) (Math.random()*(xpJogador/4 + 1) + xp/4 + 3);
    }
}
