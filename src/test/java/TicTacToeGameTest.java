import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TicTacToeGameTest {

    public static final char PLAYER_X = 'X';
    public static final char PLAYER_O = 'O';
    private TicTacToeGame ticTacToeGame;

    @Before
    public void init() {
        ticTacToeGame = new TicTacToeGame();
    }

    @Test
    public void shouldReturnXOnFirstTurn() {
        Assert.assertEquals(PLAYER_X, ticTacToeGame.getPlayer(1));
    }

    @Test
    public void shouldReturnOonSecondTurn() {
        Assert.assertEquals(PLAYER_O, ticTacToeGame.getPlayer(2));
    }


}
