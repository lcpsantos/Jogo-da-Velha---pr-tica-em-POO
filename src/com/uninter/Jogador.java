package com.uninter;

import java.util.Scanner;

public class Jogador {

  static Scanner scan = new Scanner(System.in);

  public Jogador() {}

  public static void movimentoJogador(char[][] tabuleiro) {
    System.out.println();
    System.out.println("Faça a jogada. (1-9)"); //os numeros representam cada campo. Ex: 1 é a posição da matriz linha[0] coluna[0], 5 é a posição da matriz linha[1] coluna[2].

    int move = scan.nextInt();

    boolean resultado = Tabuleiro.validaMovimentacao(move, tabuleiro);

    while (!resultado) {
      System.out.println("Este campo já está marcado!");
      move = scan.nextInt();
      resultado = Tabuleiro.validaMovimentacao(move, tabuleiro);
    }

    System.out.println("Humano marcou a posicao " + move);
    Tabuleiro.atualizaTabuleiro(move, 1, tabuleiro);
  }
}




