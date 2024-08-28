package br.unip.natsavers;
import com.sun.source.doctree.HiddenTree;

import java.util.Scanner;

public class LogicaFunc {
    static Scanner sc = new Scanner(System.in);

    public static Jogador jogador;

    public static boolean rodando;

    //Lista para uso do random, vai ditar o que vai acontecer no jogo
    public static String[] encontrosArray = {"Batalha","Batalha","Batalha","Descanso","Descanso"};
    public static String[] inimigosArray = {"Guarda armado","Guarda armado","Guarda ciborgue","Guarda ciborgue","Cientista maluco"};

    //Os códigos abaixo ditam o local onde o jogador está, também em qual fase o jogador está passando
    public static int local = 0, ato = 1;
    public static String[] locais = {"Laboratório", "Escritório Secreto", "Hangar 18", "Térreo"};

    //Método responsável por identificar qual comando foi dado pelo jogador
    public static int lerCmm(String prompt, int escolhaJogador){
        int cmm;

        do{
            System.out.print(prompt);
            try{
                cmm = Integer.parseInt(sc.next());
            }catch(Exception e) {
                cmm = -1;
                System.out.println("Selecione uma opção válida!");
            }

        }while(cmm < 1 || cmm > escolhaJogador);
        return cmm;
    }

    //Método responsável por limpar o console, facilitando a leitura do jogo
    public static void limparConsole(){
        for(int i = 0 ; i < 100 ; i++)
            System.out.println();
    }

    //Metódo responsável para imprimir ------ na tela, puramente estético
    public static void printSeparador(int n){
        for(int i = 0 ; i < n ; i++)
            System.out.print("-");
        System.out.println();
    }

    //Método responsável pelo "next" do jogo, entre uma ação e outra
     public static void qqContinuar(){
        System.out.println("\n Escreva qualquer coisa para continuar!");
         System.out.print("> ");
        sc.next();
     }

     //Método abaixo é responsável pelo do jogo e pelo menu de opções
     public static void comecaJogo(){
        boolean setNome = false;
        String nome;
        limparConsole();
        printSeparador(116);
        System.out.println("░▒▓███████▓▒░ ░▒▓██████▓▒░▒▓████████▓▒░▒▓███████▓▒░░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░▒▓███████▓▒░ ░▒▓███████▓▒░ \n" +
                 "░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▒░  ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░        \n" +
                 "░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▒░  ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░        \n" +
                 "░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░ ░▒▓█▓▒░   ░▒▓██████▓▒░░▒▓████████▓▒░░▒▓█▓▒▒▓█▓▒░░▒▓██████▓▒░ ░▒▓███████▓▒░ ░▒▓██████▓▒░  \n" +
                 "░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▒░         ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▓█▓▒░ ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░ \n" +
                 "░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▒░         ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▓█▓▒░ ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░ \n" +
                 "░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▒░  ░▒▓███████▓▒░░▒▓█▓▒░░▒▓█▓▒░  ░▒▓██▓▒░  ░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓███████▓▒░");
        printSeparador(116);
        qqContinuar();

        do{
            limparConsole();
            System.out.println("Qual é o seu nome? ");
            System.out.print("> ");
            nome = sc.next();
            limparConsole();
            System.out.println("Seu nome é " + nome + ", correto?");
            System.out.println("1 - Sim, isso mesmo");
            System.out.println("2 - Não, quero mudar meu nome");
            int input = lerCmm("> ",2);
            if(input == 1)
                setNome = true;
        }while (!setNome);

        jogador = new Jogador(nome);

        Historia.Letreiro();
        Historia.Introducao();
        Historia.introAto1();
        Historia.introAto1pt2();
        jogador.escolhaUP();


        rodando = true;

        loopJogo();
     }

     //Mantém o jogo rodando
     public static void loopJogo(){
        while(rodando){
            printMenu();
            int input = lerCmm("> ",3);
            if (input == 1) {
                continuar();
            }else if (input == 2) {
                infoJogador();
            }else {
                rodando = false;
            }
        }
     }

     //Imprime as informações do jogador
     public static void infoJogador(){
        limparConsole();
        printSeparador(30);
        System.out.println("Informações do jogador");
        printSeparador(30);
        System.out.println("Nome: " + jogador.nome);
        System.out.println("HP: " + jogador.hp+"/"+jogador.HPmax);
        System.out.println("XP: " + jogador.xp);
        System.out.println("Dinheiro: " +jogador.dinheiro);
        printSeparador(20);
        System.out.println("Quantidade de Antídotos: "+jogador.antidotos);
        printSeparador(20);


        if(jogador.numItensATK > 0){
            System.out.println("Arma Atual: " + jogador.itensATK[jogador.numItensATK - 1]);
            printSeparador(20);
        }
        if(jogador.numItensDEF > 0){
            System.out.println("Armadura Atual: " + jogador.itensDEF[jogador.numItensDEF - 1]);
        }
        qqContinuar();
     }

     //Método que programa as funções das "Máquinas de vendas" de antídoto
     //Identifica se o jogador pode ou não comprar, baseado nas informações na classe Jogador
     public static void maquinaVenda(){
        limparConsole();
        System.out.println("Você encontrou uma máquina estranha no caminho");
        System.out.println("Ela possui diversos frascos com um líquido azul, ao topo está escrito ANTÍDOTOS");
        int preco = (int) (Math.random()* (10 + jogador.antidotos*3)+10 + jogador.antidotos);
        System.out.println("Eles podem te ajudar a recuperar suas energias, compre um por " + preco + " dinheiros!");
        printSeparador(20);
        System.out.println("Comprar um?\n1 - Sim\n2 - Agora não");
        int input = lerCmm("> ",2);
        if(input == 1){
            limparConsole();
            if(jogador.dinheiro >= preco){
                System.out.println("Você comprou um antídoto");
                jogador.antidotos ++;
                jogador.dinheiro -= preco;
                qqContinuar();
            }else{
                System.out.println("Você não tem dinheiro o suficiente");
                qqContinuar();
            }
        }
     }

     //Método responsável pelo descanso, recupera a vida do jogador quando possível
     //O jogador só pode descansar quando tiver um descanso disponível, o método checa isso também
     public static void descansar(){
        limparConsole();
        if(jogador.descansosRestantes > 0){
            System.out.println("Você lutou muito...\nPare um pouco para descansar");
            System.out.println("Você ainda pode descansar " + jogador.descansosRestantes + " vezes.");
            System.out.println("1 - Descansar um pouco\n2 - Não, preciso seguir em frente!");
            int input = lerCmm("> ",2);
            if(input == 1){
                limparConsole();
                if(jogador.hp < jogador.HPmax){
                    int hpRecuperado = (int)(Math.random()*(jogador.xp/4 + 1) + 10);
                    jogador.hp += hpRecuperado;
                    if(jogador.hp > jogador.HPmax){
                        jogador.hp = jogador.HPmax;
                    }
                    System.out.println("Você descansou por um momento e recuperou "+ hpRecuperado + " de vida");
                    System.out.println("Você agora tem " + jogador.hp + "/" + jogador.HPmax);
                    jogador.descansosRestantes --;
                    qqContinuar();
                }else{
                    System.out.println("Você está com energia o suficiente, não precisa descansar");
                    qqContinuar();
                }
            }else {
                limparConsole();
                System.out.println("Vamos à luta!");
                qqContinuar();
            }
        }
     }

     //O método abaixo gerencia o que aparece e acontece em cada Ato do jogo
     //Responsável pela função de "passar de fase" se baseando no XP do jogador
     public static void checarAto(){
        if(jogador.xp >= 10 && ato == 1){
            ato =2;
            local = 1;
            jogador.escolhaUP();
            Historia.introAto2();
            inimigosArray[0] = "Guarda armado";
            inimigosArray[1] = "Guarda armado";
            inimigosArray[2] = "Guarda ciborgue";
            inimigosArray[3] = "Guarda ciborgue";
            inimigosArray[4] = "Cientista maluco";

            encontrosArray[0] = "Batalha";
            encontrosArray[1] = "Batalha";
            encontrosArray[2] = "Batalha";
            encontrosArray[3] = "Descanso";
            encontrosArray[4] = "Loja";

        }else if(jogador.xp >= 50 && ato == 2){
            ato =3;
            local = 2;
            Historia.finalAto2();
            jogador.escolhaUP();
            Historia.introAto3();
            inimigosArray[0] = "Guarda armado";
            inimigosArray[1] = "Guarda armado";
            inimigosArray[2] = "Guarda ciborgue";
            inimigosArray[3] = "Guarda ciborgue";
            inimigosArray[4] = "Cientista maluco";

            encontrosArray[0] = "Batalha";
            encontrosArray[1] = "Batalha";
            encontrosArray[2] = "Batalha";
            encontrosArray[3] = "Batalha";
            encontrosArray[4] = "Loja";
            jogador.hp = jogador.HPmax;
        }else if(jogador.xp >= 100 && ato == 3) {
            ato = 4;
            local = 3;
            Historia.finalAto3();
            jogador.escolhaUP();
            Historia.introAto4();
            batalhaRobo();
            jogador.hp = jogador.HPmax;
            limparConsole();
            System.out.println("Você conseguiu passar pelo estranho robô!");
            System.out.println("Após isso tudo, você tem duas opções");
            System.out.println("1 - Ir embora para sua liberdade, mas deixar o mundo para lá");
            System.out.println("2 - Batalhar contra o grande CEO da StellarTech e salvar o planeta Terra");
            int input = lerCmm("> ",2);
            if(input == 1){
                limparConsole();
                Historia.finalJogoRuim();
                qqContinuar();
                rodando = false;
            }else{
                batalhaFinal();
            }

        }
     }

     //Gera uma batalha aleatóriamente, escolhe qual será o adversário, sua vida e o quanto de XP o jogador receberá
     //após derrotar o inimigo
     public static void batalhaAleatoria(){
        limparConsole();
        System.out.println("Você encontrou um adversário impedindo a passagem. Batalhe com ele e salve o planeta!");
        qqContinuar();
        batalha(new Inimigos(inimigosArray[(int)(Math.random()* inimigosArray.length)],jogador.xp));
     }


     //Função de combate do jogo, calcula o dano recebido e dano inferido,
     //Printa e identifica a ação que o jogador deseja realizar e as executa conforme a necessidade
     //Calcula a quantidade de XP que o jogador recebe
     public static void batalha(Inimigos inimigos){
        while(true){
            limparConsole();
            System.out.println(inimigos.nome + "\nHP: " + inimigos.hp + "/" + inimigos.HPmax);
            System.out.println(jogador.nome + "\nHP: " + jogador.hp + "/" + jogador.HPmax);
            System.out.println("Escolha uma ação: ");
            printSeparador(20);
            System.out.println("1 - Lutar\n2 - Usar Antídoto\n3 - Fugir");
            int input = lerCmm("> ",3);

            if (input == 1) {
                int dano = jogador.atk() - inimigos.def();
                int danoRecebido = inimigos.atk() - jogador.def();
                if(danoRecebido < 0){
                    dano -= danoRecebido/2;
                    danoRecebido = 0;
                }
                if(dano < 0){
                    dano = 0;
                }
                jogador.hp -= danoRecebido;
                inimigos.hp -= dano;

                limparConsole();
                System.out.println("LUTA");
                System.out.println("Você deu " + dano + " de dano no " +inimigos.nome);
                printSeparador(15);
                System.out.println("O " + inimigos.nome + " deu " + danoRecebido + " de dano em você");
                qqContinuar();

                if(jogador.hp <= 0){
                    jogadorMorreu();
                    break;
                }else if(inimigos.hp <= 0){
                    limparConsole();
                    System.out.println("Você derrotou o "+inimigos.nome + " com sucesso!");
                    jogador.xp += inimigos.xp;
                    System.out.println("Recebeu "+inimigos.xp+" de experiência.");

                    boolean addDescanso = (Math.random()*5 + 1 <= 2.25);
                    int dropDinheiro = (int) (Math.random()*inimigos.xp);
                    if(addDescanso){
                        jogador.descansosRestantes++;
                        System.out.println("Você lutou bem, ganhou a chance de descansar antes da próxima batalha");
                    }
                    if(dropDinheiro > 0){
                        jogador.dinheiro += dropDinheiro;
                        System.out.println("Você pilhou " + dropDinheiro + " de dinheiro do adversário após vencer.");
                    }
                    qqContinuar();
                    break;
                }
            }else if (input == 2) {
                limparConsole();
                if(jogador.antidotos > 0 && jogador.hp < jogador.HPmax){
                    System.out.println("Você deseja utilizar o antídoto para recuperar sua saúde?");
                    System.out.println("1 - Sim, por favor");
                    System.out.println("2 - Não, agora não");
                    input = lerCmm(">", 2);
                    if (input == 1) {
                        jogador.hp = jogador.HPmax;
                        limparConsole();
                        System.out.println("Você injetou o antídoto, suas feridas foram fechadas e está novamente pronto para a luta!!");
                        qqContinuar();
                    }
                }else{
                    System.out.println("Você não tem antídotos ou já está com a vida cheia!");
                    qqContinuar();
                }

            }else {
                limparConsole();
                if(ato != 4){
                    if(Math.random()*10 + 1 <= 3.5){
                        System.out.println("Você escapou da batalha!");
                        qqContinuar();
                        break;
                    }else{
                        System.out.println("Você não conseguiu escapar da batalha!");
                        int danoRecebido = inimigos.atk();
                        jogador.hp -= danoRecebido;
                        System.out.println("Você recebeu " + danoRecebido + " de dano ao tentar fugir");
                        qqContinuar();
                        if(jogador.hp <= 0){
                            jogadorMorreu();
                            break;
                        }
                    }
                }else if (inimigos.nome.equals("Robô Estranho")){
                    System.out.println("Corra para a saída!!");
                    qqContinuar();
                    break;
                }else{
                    System.out.println("Não escape de seus deveres! Salve o mundo");
                    qqContinuar();
                }

            }
        }
     }

     //Método que gera aleatóriamente o que ira acontecer
     //Opções possiveis sendo batalhas, descansos ou encontrar uma máquina de venda
     public static void encontrosAleatorios(){
        int encontro = (int) (Math.random()* encontrosArray.length);

        if(encontrosArray[encontro].equals("Batalha")) {
            batalhaAleatoria();
        }else if(encontrosArray[encontro].equals("Descanso")) {
            descansar();
        }else {
            maquinaVenda();
        }
     }

     //Método executado ao selecionar "Continuar o jogo"
     public static void continuar(){
        checarAto();
        if(ato != 4){
             encontrosAleatorios();
         }

     }

     //Imprime o menu principal
     public static void printMenu(){
        limparConsole();
        System.out.println(locais[local]);
        System.out.println("Escolha uma opção: ");
        printSeparador(30);
        System.out.println("1 - Continuar o jogo");
        System.out.println("2 - Informações do usuário");
        System.out.println("3 - Sair do jogo");

     }

     //Gera a batalha final do jogo
     public static void batalhaFinal(){
        batalha(new Inimigos("CEO DA STELLARTECH", 200));
        if(jogador.hp > 0 ) {
            Historia.finaljogoBom();
            rodando = false;
        }else{
            jogadorMorreu();
        }
     }

     public static void batalhaRobo(){
        limparConsole();
        System.out.println("Você está no corredor de saída, quando ouve um barulho estranho");
        System.out.println("Um Robô enorme te interrompe no corredor, você não consegue o vencer!");
        qqContinuar();
        System.out.println("CORRA, NÃO TENTE VENCER");
        qqContinuar();
        batalha(new Inimigos("Robô Estranho", 30000));
     }

     //Método executado para finalizar o jogo quando o HP do jogador chegar a 0
     public static void jogadorMorreu(){
        limparConsole();
        System.out.println("Você morreu, o mundo foi destruido pela poluição da sua empresa...");
        System.out.println("Você recolheu o total de " + jogador.xp + " de experiência." +
                "\nNão desista, tente salvar o mundo mais uma vez!");
        qqContinuar();
        LogicaFunc.printSeparador(46);
        System.out.println("  _  _   _ _____ ___   ___   _____ ___  ___ \n" +
                " | \\| | /_\\_   _/ __| /_\\ \\ / / __| _ \\/ __|\n" +
                " | .` |/ _ \\| | \\__ \\/ _ \\ V /| _||   /\\__ \\\n" +
                " |_|\\_/_/ \\_\\_| |___/_/ \\_\\_/ |___|_|_\\|___/");
        LogicaFunc.printSeparador(46);
        System.out.println("Obrigada por jogar, espero que tenha gostado!");
        LogicaFunc.qqContinuar();
        rodando = false;
     }
}
