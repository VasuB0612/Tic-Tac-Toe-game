import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char [][] board = {
        {' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '}
    };

        gameBoard(board);

        // Entering the positions of 'X' and 'O'

        Scanner scan = new Scanner(System.in);
        int position = scan.nextInt();
    }

    public static void gameBoard(char [][] board){
        for(char[] r : board){
            for(char c : r){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}