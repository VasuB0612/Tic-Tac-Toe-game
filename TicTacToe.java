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

        while(true){
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Enter X in a position from 1 to 9: ");
            int pos1 = scan1.nextInt();
            moves(board, pos1, 'X');
            gameBoard(board);
            if(winCheck(board,'X')){
                System.out.println("Player 1 has won.");
                break;
            }

            Scanner scan2 = new Scanner(System.in);
            System.out.println("Enter O in a position from 1 to 9: ");
            int pos2 = scan2.nextInt();
            moves(board, pos2, 'O');
            gameBoard(board);
            if(winCheck(board,'O')){
                System.out.println("Player 2 has won.");
                break;
            }
        }
    }

    public static void gameBoard(char [][] board){
        for(char[] r : board){
            for(char c : r){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void moves(char[][] board, int pos, char player){
        switch (pos) {
            case 1:
                board[0][0] = player;
                break;
            case 2:
                board[0][2] = player;
                break;
            case 3:
                board[0][4] = player;
                break;
            case 4:
                board[2][0] = player;
                break;
            case 5:
                board[2][2] = player;
                break;
            case 6:
                board[2][4] = player;
                break;
            case 7:
                board[4][0] = player;
                break;
            case 8:
                board[4][2] = player;
                break;
            case 9:
                board[4][4] = player;
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public static boolean winCheck(char[][] board, char player){
        if(
            (board[0][0] == player && board[0][2] == player && board[0][4] == player) ||
            (board[2][0] == player && board[2][2] == player && board[2][4] == player) ||
            (board[4][0] == player && board[4][2] == player && board[4][4] == player) ||
            (board[0][0] == player && board[2][0] == player && board[4][0] == player) ||
            (board[0][2] == player && board[2][2] == player && board[4][2] == player) ||
            (board[0][4] == player && board[2][4] == player && board[4][4] == player) ||
            (board[0][0] == player && board[2][2] == player && board[4][4] == player) ||
            (board[0][4] == player && board[2][2] == player && board[4][0] == player)
        )
        {
            return true;
        }
        return false;
    }
}