package br.unip.natsavers;

public class Jogador extends Personagem {

    //Atributo de quantidade de Upgrades
    public int numItensATK, numItensDEF;

    //Atributo de quantidade itens consumíveis
    int dinheiro, descansosRestantes, antidotos;

    //Lista de Upgrades possíveis
    public String [] itensATK = {"Bastão Eletro Quântico", "Luvas Metálicas de Impulsão", "Faca Cibernética", "Espada High-Tech"};
    public String [] itensDEF = {"Exoesqueleto da Vanguarda", "Exoarmadura Quântica", "Armadura de Nanofios", "Armadura de Energia Ômega"};

    public Jogador(String nome) {
        super(nome, 100, 0);
        this.numItensATK = 0;
        this.numItensDEF = 0;

        this.dinheiro = 5;
        this.descansosRestantes = 1;
        this.antidotos = 0;
    }

    @Override
    public int atk() {
        return (int) (Math.random()*(xp/4 + numItensATK*8 + 3) + xp/10 + numItensATK*2 + numItensDEF+1);
    }

    @Override
    public int def() {
        return (int) (Math.random()*(xp/4 + numItensDEF*3 + 3) + xp/10 + numItensDEF*2 + numItensATK+1);
    }

    //Imprime e identifica a escolha de upgrade do jogador
    public void escolhaUP() {
        LogicaFunc.limparConsole();
        System.out.println("Você encontrou um baú com alguns ítens, escolha o que precisar!");
        System.out.println("1 (Arma) - " + itensATK[numItensATK]);
        System.out.println("2 (Armadura) - " + itensDEF[numItensDEF]);

        int input = LogicaFunc.lerCmm("> ", 2);
        LogicaFunc.limparConsole();
        if (input == 1) {
            System.out.println("Você escolheu " + itensATK[numItensATK]);
            numItensATK++;
        }else {
            System.out.println("Você escolheu " + itensDEF[numItensDEF]);
            numItensDEF++;
        }
        LogicaFunc.qqContinuar();
    }

}
