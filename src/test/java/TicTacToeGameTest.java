import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.annotation.Target;

public class TicTacToeGameTest {

    private TicTacToeGame ticTacToeGame;
    @Before
    public void init() {
        ticTacToeGame = new TicTacToeGame();
    }
    @Test
    public void shouldReturnXOnFirstTurn(){
        Assert.assertEquals('X',ticTacToeGame.getPlayer(1));
    }

    @Test
    public void shouldReturnOonSecondTurn(){
        Assert.assertEquals('O',ticTacToeGame.getPlayer(2));
    }


}
