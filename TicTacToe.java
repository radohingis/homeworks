package sk.kosickaakademia.hingis.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.ticTacToe();

    }
    private int[][] paper;
    private int player = 1;
    private int count = 1;
    private int row;
    private int column;

    public TicTacToe () {
        paper = new int[5][5];
        prepareTiles();
    }

    public void ticTacToe(){ //urcuje samotny prieber hry
        Scanner sc = new Scanner(System.in);
        int userInput = 0;
        while(checkWinner(paper)==0){  
            System.out.print(" "+player+"'s turn: ");
            userInput = sc.nextInt();
            if (userInput<1 || userInput>25){
                System.out.print("There are only 25 tiles. Choose among them.");
                continue;
            }

            row = (userInput-1)/5;
            column = (userInput-1)%5;

            if (paper[row][column] != 0){
                System.out.println("Tile's not available.");
                continue;
            }
            paper[row][column] = player;
            updateGameBoard();
            count++;
            if (count==25)
                break;

            nextPlayer();
        }

        if (checkWinner(paper) == 1) System.out.println("Player 1 RUUUULEEEES");
        else if (checkWinner(paper) == 2) System.out.println("Player 2 RUUUULEEEES");
        else if (checkWinner(paper) == 3) System.out.println("Player 3 RUUUULEEEES");
        else System.out.println("CAT HAHA");
    }

    private void nextPlayer() { //prepnutie hraca a integeru
        if (player == 1) player = 2; //ktory sa ma do pola pridat
        else if (player == 2) player = 3;
        else player = 1;
    }

    private void updateGameBoard() { //aktualizacia pola
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(paper[i][j]+" ");
            }
            System.out.println();
        }
    }


    public int checkWinner (int[][] array){ //kontrola pola
        for (int i = 0; i < 5; i++){        // berie dane pole a vracia integer pre pracu s vysledkom
            if (paper[i][0]*paper[i][1]*paper[i][2]*paper[i][3]*paper[i][4] == 1 || paper[0][i]*paper[1][i]*paper[2][i]*paper[3][i]*paper[4][i] == 1)
                return 1;
            if (paper[i][0]*paper[i][1]*paper[i][2]*paper[i][3]*paper[i][4] == 32 || paper[0][i]*paper[1][i]*paper[2][i]*paper[3][i]*paper[4][i] == 32)
                return 2;
            if (paper[i][0]*paper[i][1]*paper[i][2]*paper[i][3]*paper[i][4] == 243 || paper[0][i]*paper[1][i]*paper[2][i]*paper[3][i]*paper[4][i] == 243)
                return 3;
        }
        if (paper[4][0]*paper[3][1]*paper[2][2]*paper[1][3]*paper[0][4] == 1 || paper[0][0]*paper[1][1]*paper[2][2]*paper[3][3]*paper[4][4] == 1)
            return 1;
        if (paper[4][0]*paper[3][1]*paper[2][2]*paper[1][3]*paper[0][4] == 32 || paper[0][0]*paper[1][1]*paper[2][2]*paper[3][3]*paper[4][4] == 32)
            return 2;
        if (paper[4][0]*paper[3][1]*paper[2][2]*paper[1][3]*paper[0][4] == 243 || paper[0][0]*paper[1][1]*paper[2][2]*paper[3][3]*paper[4][4] == 243)
            return 3;

        return 0;
    }

    private void prepareTiles() { //pripravi pociatocny vzhlad pola a zobrazi hracom
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                paper[i][j] = 0;
                System.out.print(paper[i][j]+" ");
            }
            System.out.println();
        }
    }
}



