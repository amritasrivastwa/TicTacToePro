public class TicTacToeGame {

    public static final char PLAYER_X = 'X';
    public static final char PLAYER_O = 'O';

    public char getPlayer(int slotNumber) {
        if (slotNumber == 1)
            return PLAYER_X;
        else
            return PLAYER_O;
    }
}
