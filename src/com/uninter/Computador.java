package com.uninter;

public class Computador {

    public Computador() {
    }

    /*
    A função movimentoComputador() recebe por parametro o tabuleiro e o
    nível de dificuldade para fazer a validação e chamar a classe filha
    que vai herdar o tabuleiro.
    */

    public static void movimentoComputador(int level, char[][] tabuleiro){

        switch (level){
            case 1:
                ComputadorA.movimentoComputadorA(tabuleiro);
                break;

            case 2:
                ComputadorB.movimentoComputadorB(tabuleiro);
                break;

            case 3:
                ComputadorC.movimentoComputadorC(tabuleiro);
                break;

            default:
                break;
        }
    }

    //função para implementar um exemplo de uso de herança
    void info(){
        System.out.println("Sua vez!");
    }

}
