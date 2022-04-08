package com.uninter;

import java.util.Scanner;

public class Jogo {

    static Scanner scan = new Scanner(System.in);

    private Tabuleiro tabuleiro;
    private Jogador jogador;
    private Computador computador;
    boolean fimDoJogo = false;
    boolean game = true;
    boolean verifica_nivel = false; //booleano para mostrar que o nível já foi definido e para o 2º while do game
    private static int level;

    public Jogo() throws InterruptedException { //construtor
        this.tabuleiro = new Tabuleiro();
        this.computador = new Computador();
        this.jogador = new Jogador();
        Jogar();
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public void Jogar() throws InterruptedException {
        while (game) {
            int cont = 0;
            while (!fimDoJogo) {
                if (cont == 0) {
                    System.out.println("Jogo da Velha!!");
                    System.out.println();
                    System.out.print("Escolha o nível de dificuldade do Computador. (1-fácil, 2-normal, 3-difícil): ");
                    int nivelDificuldade = scan.nextInt();
                    level = nivelDificuldade;
                    verifica_nivel = true; //significa que o nivel já foi escolhido e não precisa escolher mais nessa rodada.
                    cont++;
                } else if (verifica_nivel) {
                    jogador.movimentoJogador(tabuleiro.tabuleiro);
                    fimDoJogo = tabuleiro.isfimDoJogo(tabuleiro.tabuleiro);
                    if (fimDoJogo) {
                        break;
                    }
                    computador.movimentoComputador(level, tabuleiro.tabuleiro);
                    fimDoJogo = tabuleiro.isfimDoJogo(tabuleiro.tabuleiro);
                    if (fimDoJogo) {
                        break;
                    }
                }
            }

            System.out.println("Placar - jogador Humano: " + tabuleiro.pontuacaoHumano);
            System.out.println("Placar - jogador Computador: " + tabuleiro.pontuacaoComputador);
            System.out.println("Deseja jogar novamente? S/N");
            scan.nextLine();
            String resultado = scan.nextLine();

            switch (resultado) {
                case "S":
                case "s":
                    game = true;
                    verifica_nivel = false;
                    System.out.println("Reiniciando...");
                    Thread.sleep(2000); //função para aguardar 2 segundos antes do tabuleiro reiniciar apenas para mostrar o "loading" Reiniciando...
                    tabuleiro.reiniciaTabuleiro(tabuleiro.tabuleiro);
                    fimDoJogo = false;
                    tabuleiro.desenhaTabuleiro(tabuleiro.tabuleiro);
                    break;

                case "N":
                case "n":
                    game = false;
                    System.out.println();
                    break;
                default:
                    break;
            }
        }
    }
}
