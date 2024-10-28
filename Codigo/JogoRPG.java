import java.util.Scanner;

public class JogoRPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introdução à trama
        Trama.introduzirTrama();

        // Criando personagens
        Guerreiro guerreiro = new Guerreiro("Arthur", 100, 20);
        Mago mago = new Mago("Merlin", 80, 15, 50);

        // Escolha do personagem
        System.out.println("Escolha seu personagem: 1. Guerreiro | 2. Mago");
        int escolha = scanner.nextInt();

        Personagem jogador;
        Personagem inimigo;

        if (escolha == 1) {
            jogador = guerreiro;
            inimigo = mago;
        } else if (escolha == 2) {
            jogador = mago;
            inimigo = guerreiro;
        } else {
            System.out.println("Escolha inválida! Personagem padrão 'Guerreiro' foi selecionado.");
            jogador = guerreiro;
            inimigo = mago;
        }

        // Descrição do personagem escolhido e enredo
        Trama.descricaoPersonagem(jogador);
        Trama.descricaoEnredo();

        // Início da batalha
        System.out.println("Batalha iniciada entre " + jogador.getNome() + " e " + inimigo.getNome());

        while (jogador.getVida() > 0 && inimigo.getVida() > 0) {
            System.out.println(jogador.getNome() + ", escolha sua ação: 1. Atacar | 2. Verificar Status");
            int acao = scanner.nextInt();

            if (acao == 1) {
                jogador.atacar(inimigo);
            } else if (acao == 2) {
                System.out.println(jogador.getNome() + " - Vida: " + jogador.getVida());
                if (jogador instanceof Mago) {
                    System.out.println("Mana: " + ((Mago) jogador).getMana());
                }
            } else {
                System.out.println("Ação inválida! Escolha novamente.");
                continue;
            }

            if (inimigo.getVida() > 0) {
                System.out.println(inimigo.getNome() + " está atacando!");
                inimigo.atacar(jogador);
            }
        }

        // Resultado da batalha
        if (jogador.getVida() > 0) {
            System.out.println(jogador.getNome() + " venceu!");
            System.out.println("Parabéns, você conquistou a Jóia dos Deuses e restaurou a paz em Eldoria!");
        } else {
            System.out.println(inimigo.getNome() + " venceu!");
            System.out.println("Você foi derrotado. O Reino das Sombras triunfou.");
        }

        scanner.close();
    }
}

class Trama {
    public static void introduzirTrama() {
        System.out.println("Bem-vindo ao mundo de Eldoria!");
        System.out.println("Dois reinos antigos, o Reino da Luz e o Reino das Sombras, lutam pelo controle da poderosa 'Jóia dos Deuses'.");
        System.out.println("Você é um herói escolhido para restaurar a paz. Mas primeiro, você deve derrotar seu oponente.");
    }

    public static void descricaoPersonagem(Personagem personagem) {
        if (personagem instanceof Guerreiro) {
            System.out.println("Você escolheu ser Arthur, o Guerreiro do Reino da Luz.");
            System.out.println("Sua missão é derrotar o mago sombrio Merlin e proteger a Jóia dos Deuses.");
        } else if (personagem instanceof Mago) {
            System.out.println("Você escolheu ser Merlin, o Mago do Reino das Sombras.");
            System.out.println("Sua missão é conquistar a Jóia dos Deuses e dominar Eldoria.");
        }
    }

    public static void descricaoEnredo() {
        System.out.println("Os rumores dizem que a Jóia dos Deuses está escondida na antiga caverna ao norte.");
        System.out.println("Prepare-se para enfrentar desafios e derrotar seu oponente em uma batalha final épica!");
    }
}

abstract class Personagem {
    private String nome;
    private int vida;
    private int forca;

    public Personagem(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    public abstract void atacar(Personagem inimigo);

    public void receberDano(int dano) {
        this.vida -= dano;
        if (this.vida < 0) this.vida = 0;
    }
}

class Guerreiro extends Personagem {
    public Guerreiro(String nome, int vida, int forca) {
        super(nome, vida, forca);
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(getNome() + " ataca com a espada!");
        inimigo.receberDano(getForca());
    }
}

class Mago extends Personagem {
    private int mana;

    public Mago(String nome, int vida, int forca, int mana) {
        super(nome, vida, forca);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public void atacar(Personagem inimigo) {
        if (mana >= 10) {
            System.out.println(getNome() + " lança um feitiço!");
            inimigo.receberDano(getForca());
            mana -= 10;
        } else {
            System.out.println(getNome() + " não tem mana suficiente para lançar um feitiço e tenta um ataque fraco!");
            inimigo.receberDano(5);
        }
    }
}
