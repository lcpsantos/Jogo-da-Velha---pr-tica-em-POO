package com.uninter;

public class Tabuleiro{

    //variáveis para interação do jogo
    static int pontuacaoHumano = 0;
    static int pontuacaoComputador = 0;

    //variável que monta a matriz tabuleiro
    char [][] tabuleiro = {{'_','|','_','|','_'}, {'_', '|', '_','|','_'}, {' ','|',' ','|',' '}};

    public Tabuleiro() {
        desenhaTabuleiro(tabuleiro);
    }

    protected static void desenhaTabuleiro(char[][] tabuleiro){

        for(char[] row : tabuleiro){
            for( char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    protected static void atualizaTabuleiro(int posicao, int humano, char[][] tabuleiro){

        char simbolo;

        if(humano==1){
            simbolo = 'X';
        }else{
            simbolo = 'O';
        }

        switch (posicao){

            case 1:
                tabuleiro[0][0] = simbolo;
                desenhaTabuleiro(tabuleiro);
                break;
            case 2:
                tabuleiro[0][2] = simbolo;
                desenhaTabuleiro(tabuleiro);
                break;
            case 3:
                tabuleiro[0][4] = simbolo;
                desenhaTabuleiro(tabuleiro);
                break;
            case 4:
                tabuleiro[1][0] = simbolo;
                desenhaTabuleiro(tabuleiro);
                break;
            case 5:
                tabuleiro[1][2] = simbolo;
                desenhaTabuleiro(tabuleiro);
                break;
            case 6:
                tabuleiro[1][4] = simbolo;
                desenhaTabuleiro(tabuleiro);
                break;
            case 7:
                tabuleiro[2][0] = simbolo;
                desenhaTabuleiro(tabuleiro);
                break;
            case 8:
                tabuleiro[2][2] = simbolo;
                desenhaTabuleiro(tabuleiro);
                break;
            case 9:
                tabuleiro[2][4] = simbolo;
                desenhaTabuleiro(tabuleiro);
                break;
            default:
                break;
        }
    }

    //metodo para validar uma movimentação
    protected static boolean validaMovimentacao(int move, char[][] tabuleiro){

        switch (move){
            case 1:
                return tabuleiro[0][0] == '_';
            case 2:
                return tabuleiro[0][2] == '_';
            case 3:
                return tabuleiro[0][4] == '_';
            case 4:
                return tabuleiro[1][0] == '_';
            case 5:
                return tabuleiro[1][2] == '_';
            case 6:
                return tabuleiro[1][4] == '_';
            case 7:
                return tabuleiro[2][0] == ' ';
            case 8:
                return tabuleiro[2][2] == ' ';
            case 9:
                return tabuleiro[2][4] == ' ';

            default:
                return false;
        }
    }

    /*método para verificar quem venceu fazendo a conferencia das possiveis
    jogadas.
    */
    protected static boolean isfimDoJogo(char [][] tabuleiro){

        //Vitória pela horizontal
        if(tabuleiro[0][0] == 'X'&& tabuleiro[0][2] == 'X' && tabuleiro [0][4] == 'X' ){
            System.out.println("Jogador Humano venceu");
            pontuacaoHumano++;
            return true;
        }
        if(tabuleiro[0][0] == 'O'&& tabuleiro[0][2] == 'O' && tabuleiro [0][4] == 'O' ){
            System.out.println("Jogador Computador venceu");
            pontuacaoComputador++;
            return true;
        }
        if(tabuleiro[1][0] == 'X'&& tabuleiro[1][2] == 'X' && tabuleiro [1][4] == 'X' ){
            System.out.println("Jogador Humano venceu");
            pontuacaoHumano++;
            return true;
        }
        if(tabuleiro[1][0] == 'O'&& tabuleiro[1][2] == 'O' && tabuleiro [1][4] == 'O' ){
            System.out.println("Jogador Computador venceu");
            pontuacaoComputador++;
            return true;
        }
        if(tabuleiro[2][0] == 'X'&& tabuleiro[2][2] == 'X' && tabuleiro [2][4] == 'X' ){
            System.out.println("Jogador Humano venceu");
            pontuacaoHumano++;
            return true;
        }
        if(tabuleiro[2][0] == 'O'&& tabuleiro[2][2] == 'O' && tabuleiro [2][4] == 'O' ) {
            System.out.println("Jogador Computador venceu");
            pontuacaoComputador++;
            return true;
        }

        //Vitória pela vertical
        if(tabuleiro[0][0] == 'X'&& tabuleiro[1][0] == 'X' && tabuleiro [2][0] == 'X' ){
            System.out.println("Jogador Humano venceu");
            pontuacaoHumano++;
            return true;
        }
        if(tabuleiro[0][0] == 'O'&& tabuleiro[1][0] == 'O' && tabuleiro [2][0] == 'O' ){
            System.out.println("Jogador Computador venceu");
            pontuacaoComputador++;
            return true;
        }

        if(tabuleiro[0][2] == 'X'&& tabuleiro[1][2] == 'X' && tabuleiro [2][2] == 'X' ){
            System.out.println("Jogador Humano venceu");
            pontuacaoHumano++;
            return true;
        }
        if(tabuleiro[0][2] == 'O'&& tabuleiro[1][2] == 'O' && tabuleiro [2][2] == 'O' ){
            System.out.println("Jogador Computador venceu");
            pontuacaoComputador++;
            return true;
        }

        if(tabuleiro[0][4] == 'X'&& tabuleiro[1][4] == 'X' && tabuleiro [2][4] == 'X' ){
            System.out.println("Jogador Humano venceu");
            pontuacaoHumano++;
            return true;
        }
        if(tabuleiro[0][4] == 'O'&& tabuleiro[1][4] == 'O' && tabuleiro [2][4] == 'O' ){
            System.out.println("Jogador Computador venceu");
            pontuacaoComputador++;
            return true;
        }

        //Vitória pela diagonal
        if(tabuleiro[0][0] == 'X'&& tabuleiro[1][2] == 'X' && tabuleiro [2][4] == 'X' ){
            System.out.println("Jogador Humano venceu");
            pontuacaoHumano++;
            return true;
        }
        if(tabuleiro[0][0] == 'O'&& tabuleiro[1][2] == 'O' && tabuleiro [2][4] == 'O' ){
            System.out.println("Jogador Computador venceu");
            pontuacaoComputador++;
            return true;
        }

        if(tabuleiro[2][0] == 'X'&& tabuleiro[1][2] == 'X' && tabuleiro [0][4] == 'X' ){
            System.out.println("Jogador Humano venceu");
            pontuacaoHumano++;
            return true;
        }
        if(tabuleiro[2][0] == 'O'&& tabuleiro[1][2] == 'O' && tabuleiro [0][4] == 'O' ){
            System.out.println("Jogador Computador venceu");
            pontuacaoComputador++;
            return true;
        }

        if(tabuleiro[0][0] != '_' && tabuleiro[0][2] != '_' && tabuleiro[0][4] != '_' && tabuleiro[1][0] !='_'&&
                tabuleiro[1][2] != '_' && tabuleiro[1][4] != '_' && tabuleiro[2][0] != ' ' && tabuleiro[2][2] != ' ' && tabuleiro[2][4] != ' '){
            System.out.println("Empate!");
            return true;
        }

        return false;
    }

    /*método para reiniciar o tabuleiro caso o jogador decida jogar novamente.
    Este método seta cada índice com um símbolo underline para indicar que ele está vazio.
    */
    protected static void reiniciaTabuleiro(char [][] tabuleiro){
        tabuleiro[0][0] = '_';
        tabuleiro[0][2] = '_';
        tabuleiro[0][4] = '_';
        tabuleiro[1][0] = '_';
        tabuleiro[1][2] = '_';
        tabuleiro[1][4] = '_';
        tabuleiro[2][0] = ' ';
        tabuleiro[2][2] = ' ';
        tabuleiro[2][4] = ' ';
    }
}