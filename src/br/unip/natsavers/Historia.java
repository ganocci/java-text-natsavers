package br.unip.natsavers;

public class Historia {

    //Todos os métodos abaixo servem para imprimir a história do jogo na hora certa
    public static void Letreiro(){
        LogicaFunc.limparConsole();
        LogicaFunc.printSeparador(116);
        System.out.println("░▒▓███████▓▒░ ░▒▓██████▓▒░▒▓████████▓▒░▒▓███████▓▒░░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░▒▓███████▓▒░ ░▒▓███████▓▒░ \n" +
                "░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▒░  ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░        \n" +
                "░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▒░  ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░        \n" +
                "░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░ ░▒▓█▓▒░   ░▒▓██████▓▒░░▒▓████████▓▒░░▒▓█▓▒▒▓█▓▒░░▒▓██████▓▒░ ░▒▓███████▓▒░ ░▒▓██████▓▒░  \n" +
                "░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▒░         ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▓█▓▒░ ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░ \n" +
                "░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▒░         ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▓█▓▒░ ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░ \n" +
                "░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▒░  ░▒▓███████▓▒░░▒▓█▓▒░░▒▓█▓▒░  ░▒▓██▓▒░  ░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓███████▓▒░");
        LogicaFunc.printSeparador(116);
        System.out.println("Seja bem vindo ao jogo, " + LogicaFunc.jogador.nome + ", espero que se divirta!");
        LogicaFunc.qqContinuar();
    }
    public static void Introducao(){
        LogicaFunc.limparConsole();
        LogicaFunc.printSeparador(46);
        System.out.println("  _  _   _ _____ ___   ___   _____ ___  ___ \n" +
                " | \\| | /_\\_   _/ __| /_\\ \\ / / __| _ \\/ __|\n" +
                " | .` |/ _ \\| | \\__ \\/ _ \\ V /| _||   /\\__ \\\n" +
                " |_|\\_/_/ \\_\\_| |___/_/ \\_\\_/ |___|_|_\\|___/");
        LogicaFunc.printSeparador(46);
        System.out.println("O ano é 2070.");
        System.out.println("as megacorporações dominam o mundo, explorando os recursos naturais de " +
                "maneira desenfreada e sem consideração pelo meio ambiente.");
        System.out.println("Você, "+LogicaFunc.jogador.nome+", um jovem engenheiro ambiental, " +
                "trabalha para a StellarTech.\nConhecida como uma das maiores e mais poderosas empresas do mundo, " +
                "especializada em exploração espacial.");
        System.out.println("Você é um jovem que sempre foi apaixonado pelo meio ambiente," +
                " entrou na StellarTech acreditando que poderia fazer a diferença.");
        LogicaFunc.qqContinuar();
    }
    public static void introAto1() {
        LogicaFunc.limparConsole();
        LogicaFunc.printSeparador(46);
        System.out.println("  _  _   _ _____ ___   ___   _____ ___  ___ \n" +
                " | \\| | /_\\_   _/ __| /_\\ \\ / / __| _ \\/ __|\n" +
                " | .` |/ _ \\| | \\__ \\/ _ \\ V /| _||   /\\__ \\\n" +
                " |_|\\_/_/ \\_\\_| |___/_/ \\_\\_/ |___|_|_\\|___/");
        LogicaFunc.printSeparador(46);
        System.out.println("Mais um dia como o outro, você chega no seu computador e passeia pelos arquivos como sempre fez.");
        System.out.println("Está trabalhando em um novo projeto que promete mudar o mundo, " +
                "quando se depara com e-mails, arquivos e outras evidencias perturbadoras!");
        System.out.println("Informações sobre emissões e outras ilegaligades aparecem na sua tela!");
        System.out.println("Esta corporação, em sua busca insaciável por expansão e lucro, " +
                "se envolveu em práticas que ferem gravemente o meio ambiente de nosso mundo.");
        System.out.println("Seus planos audaciosos de colonizar planetas distantes em poucos anos ameaçam infligir danos irreversíveis à Terra, nossa casa.");
        LogicaFunc.qqContinuar();
    }
    public static void introAto1pt2() {
        LogicaFunc.limparConsole();
        LogicaFunc.printSeparador(46);
        System.out.println("  _  _   _ _____ ___   ___   _____ ___  ___ \n" +
                " | \\| | /_\\_   _/ __| /_\\ \\ / / __| _ \\/ __|\n" +
                " | .` |/ _ \\| | \\__ \\/ _ \\ V /| _||   /\\__ \\\n" +
                " |_|\\_/_/ \\_\\_| |___/_/ \\_\\_/ |___|_|_\\|___/");
        LogicaFunc.printSeparador(46);
        System.out.println("Você tenta coletar o máximo de informações que pode, o futuro do mundo depende do fim desta empresa maldita!");
        System.out.println("Mas antes que pudesse fazer algo, é capturado pelos seguranças e silenciado...");
        System.out.println("Eles te levam para um labotarório secreto no subterrâneo do prédio, onde são conduzidos diversos experimentos.");
        System.out.println("O foco é criar indivíduos aumentados, capazes de sobreviver às condições extremas do espaço.");
        System.out.println("Você acorda em uma cela, escura e úmida. Agora está diferente, você tem poderes sobre-humanos");
        System.out.println("Fuja do prédio e salve o mundo acabando com essa empresa!");
        LogicaFunc.qqContinuar();
    }
    public static void introAto2() {
        LogicaFunc.limparConsole();
        LogicaFunc.printSeparador(46);
        System.out.println("  _  _   _ _____ ___   ___   _____ ___  ___ \n" +
                " | \\| | /_\\_   _/ __| /_\\ \\ / / __| _ \\/ __|\n" +
                " | .` |/ _ \\| | \\__ \\/ _ \\ V /| _||   /\\__ \\\n" +
                " |_|\\_/_/ \\_\\_| |___/_/ \\_\\_/ |___|_|_\\|___/");
        LogicaFunc.printSeparador(46);
        System.out.println("Você se libertou da cela, agora conseguiu sair do subsolo do laboratório.");
        System.out.println("Após derrotar diversos adversários, "+LogicaFunc.jogador.nome +" está confiante para lutar pelo planeta.");
        System.out.println("Subiu mais um andar, agora está se sentindo mais forte, você vai conseguir sair!");
        System.out.println("Agora está em um escritório secreto, responsável pelo laboratório abaixo.");
        LogicaFunc.qqContinuar();
    }
    public static void finalAto2() {
        LogicaFunc.limparConsole();
        LogicaFunc.printSeparador(46);
        System.out.println("  _  _   _ _____ ___   ___   _____ ___  ___ \n" +
                " | \\| | /_\\_   _/ __| /_\\ \\ / / __| _ \\/ __|\n" +
                " | .` |/ _ \\| | \\__ \\/ _ \\ V /| _||   /\\__ \\\n" +
                " |_|\\_/_/ \\_\\_| |___/_/ \\_\\_/ |___|_|_\\|___/");
        LogicaFunc.printSeparador(46);
        System.out.println("Após tanta luta, "+LogicaFunc.jogador.nome + " conseguiu encontrar uma saída!");
        System.out.println("O novo andar é escuro, parece um pouco com um estacionamento secreto...");
        System.out.println("É um hangar de naves, são as naves secretas que levarão a humanidade para longe.");
        LogicaFunc.qqContinuar();
    }
    public static void introAto3() {
        LogicaFunc.limparConsole();
        LogicaFunc.printSeparador(46);
        System.out.println("  _  _   _ _____ ___   ___   _____ ___  ___ \n" +
                " | \\| | /_\\_   _/ __| /_\\ \\ / / __| _ \\/ __|\n" +
                " | .` |/ _ \\| | \\__ \\/ _ \\ V /| _||   /\\__ \\\n" +
                " |_|\\_/_/ \\_\\_| |___/_/ \\_\\_/ |___|_|_\\|___/");
        LogicaFunc.printSeparador(46);
        System.out.println("Não há tempo para deduções, a humanidade aguarda!");
        System.out.println("Siga em frente, vamos salvar o mundo!");
        LogicaFunc.qqContinuar();
    }
    public static void finalAto3() {
        LogicaFunc.limparConsole();
        LogicaFunc.printSeparador(46);
        System.out.println("  _  _   _ _____ ___   ___   _____ ___  ___ \n" +
                " | \\| | /_\\_   _/ __| /_\\ \\ / / __| _ \\/ __|\n" +
                " | .` |/ _ \\| | \\__ \\/ _ \\ V /| _||   /\\__ \\\n" +
                " |_|\\_/_/ \\_\\_| |___/_/ \\_\\_/ |___|_|_\\|___/");
        LogicaFunc.printSeparador(46);
        System.out.println("Finalmente, a saída do hangar!!");
        System.out.println("Mais um passo e estará pronto para decidir o futuro");
        LogicaFunc.qqContinuar();
    }
    public static void introAto4() {
        LogicaFunc.limparConsole();
        LogicaFunc.printSeparador(46);
        System.out.println("  _  _   _ _____ ___   ___   _____ ___  ___ \n" +
                " | \\| | /_\\_   _/ __| /_\\ \\ / / __| _ \\/ __|\n" +
                " | .` |/ _ \\| | \\__ \\/ _ \\ V /| _||   /\\__ \\\n" +
                " |_|\\_/_/ \\_\\_| |___/_/ \\_\\_/ |___|_|_\\|___/");
        LogicaFunc.printSeparador(46);
        System.out.println("Você sobe as escadas.");
        System.out.println("Ao abrir a suspeita porta no topo da escada, se depara com um corredor!");
        LogicaFunc.qqContinuar();
        System.out.println("Você tem um mau pressentimento, algo nefasto está vindo para te parar!");
        LogicaFunc.qqContinuar();
    }
    public static void finalJogoRuim() {
        LogicaFunc.limparConsole();
        LogicaFunc.printSeparador(46);
        System.out.println("  _  _   _ _____ ___   ___   _____ ___  ___ \n" +
                " | \\| | /_\\_   _/ __| /_\\ \\ / / __| _ \\/ __|\n" +
                " | .` |/ _ \\| | \\__ \\/ _ \\ V /| _||   /\\__ \\\n" +
                " |_|\\_/_/ \\_\\_| |___/_/ \\_\\_/ |___|_|_\\|___/");
        LogicaFunc.printSeparador(46);
        System.out.println("Você fugiu para sua liberdade! A tortura até agora foi suficiente.");
        System.out.println("Após você sair, a humanidade é condenada ao fim");
        System.out.println("A exploração desenfreada e as emissões despreocupadas acabam com o nosso planeta");
        System.out.println("Este é o fim da Terra como conhecemos");
        LogicaFunc.qqContinuar();
        LogicaFunc.printSeparador(46);
        System.out.println("  _  _   _ _____ ___   ___   _____ ___  ___ \n" +
                " | \\| | /_\\_   _/ __| /_\\ \\ / / __| _ \\/ __|\n" +
                " | .` |/ _ \\| | \\__ \\/ _ \\ V /| _||   /\\__ \\\n" +
                " |_|\\_/_/ \\_\\_| |___/_/ \\_\\_/ |___|_|_\\|___/");
        LogicaFunc.printSeparador(46);
        System.out.println("Obrigada por jogar, espero que tenha gostado!");
        LogicaFunc.qqContinuar();
    }
    public static void finaljogoBom() {
        LogicaFunc.limparConsole();
        LogicaFunc.printSeparador(46);
        System.out.println("  _  _   _ _____ ___   ___   _____ ___  ___ \n" +
                " | \\| | /_\\_   _/ __| /_\\ \\ / / __| _ \\/ __|\n" +
                " | .` |/ _ \\| | \\__ \\/ _ \\ V /| _||   /\\__ \\\n" +
                " |_|\\_/_/ \\_\\_| |___/_/ \\_\\_/ |___|_|_\\|___/");
        LogicaFunc.printSeparador(46);
        System.out.println("Você derrotou o poderoso CEO da StellarTech");
        System.out.println("Após o derrotar, você consegue provar para o mundo os planos nefastos dos engravatados");
        System.out.println("A humanidade, agora conscientizada, se reune para reverter os danos");
        System.out.println("O planeta está a salvo graças ao poderoso herói "+LogicaFunc.jogador.nome+"!");
        LogicaFunc.qqContinuar();
        LogicaFunc.printSeparador(46);
        System.out.println("  _  _   _ _____ ___   ___   _____ ___  ___ \n" +
                " | \\| | /_\\_   _/ __| /_\\ \\ / / __| _ \\/ __|\n" +
                " | .` |/ _ \\| | \\__ \\/ _ \\ V /| _||   /\\__ \\\n" +
                " |_|\\_/_/ \\_\\_| |___/_/ \\_\\_/ |___|_|_\\|___/");
        LogicaFunc.printSeparador(46);
        System.out.println("Obrigada por jogar, espero que tenha gostado!");
        LogicaFunc.qqContinuar();
    }
}
