package com.uninter;

import java.util.Random;

public class ComputadorC extends Computador{

    public ComputadorC() {
        super();
    }

    @Override
    public void info(){
        super.info();
    }
    public static void movimentoComputadorC(char[][] tabuleiro){

        Random rand = new Random();

        int move = rand.nextInt(9);

        boolean resultado = Tabuleiro.validaMovimentacao(move,tabuleiro);
        while(!resultado){
            move = rand.nextInt(9);
            resultado = Tabuleiro.validaMovimentacao(move, tabuleiro);
        }
        System.out.println("Computador marcou a posição "+ move);
        System.out.println();
        Tabuleiro.atualizaTabuleiro(move,2,tabuleiro);
    }

}
