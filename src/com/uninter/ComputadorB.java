package com.uninter;

import java.util.Random;

public class ComputadorB extends Computador{

    public ComputadorB() {
        super();
    }

    @Override
    public void info(){
        super.info();
    }
    public static void movimentoComputadorB(char[][] tabuleiro){

        Random rand = new Random();

        int move = rand.nextInt(9)+2;

        boolean resultado = Tabuleiro.validaMovimentacao(move,tabuleiro);
        while(!resultado){
            move = rand.nextInt(9)+2;
            resultado = Tabuleiro.validaMovimentacao(move,tabuleiro);
        }
        System.out.println("Computador marcou a posição "+ move);

        Tabuleiro.atualizaTabuleiro(move,2,tabuleiro);
    }
}
