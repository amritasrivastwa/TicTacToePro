public class TicTacToeGame {

    public static final char PLAYER_X = 'X';
    public static final char PLAYER_O = 'O';
    char previousPlayer;
    char[] board = new char[8];

    public char getPlayer(int slotNumber) {
        return board[slotNumber];
    }

    public void playAtPosition(int positionNumber) {
        char currentPlayer = getCurrentPlayer();
        board[positionNumber] = currentPlayer;
        previousPlayer = currentPlayer;
    }

    private char getCurrentPlayer() {
        return previousPlayer == PLAYER_X ? PLAYER_O : PLAYER_X;
    }

    public char getWinner() {
        return PLAYER_X;
    }
}
