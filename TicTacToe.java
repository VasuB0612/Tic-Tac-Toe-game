public class TicTacToe {
    public static void main(String[] args) {
        char [][] board = {
                            {' ', '|', ' ', '|', ' '},
                            {'-','+','-', '+','-'},
                            {' ', '|', ' ', '|', ' '},
                            {'-','+','-', '+','-'},
                            {' ', '|', ' ', '|', ' '}
                        };

        gameBoard(board);
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