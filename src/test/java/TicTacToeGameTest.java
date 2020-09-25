import org.junit.Assert;
import org.junit.Test;

import java.lang.annotation.Target;

public class TicTacToeGameTest {

    @Test
    public void shouldReturnXOnFirstTurn(){
        TicTacToeGame ticTacToeGame = new TicTacToeGame();

        Assert.assertEquals('X',ticTacToeGame.getPlayer(1));
    }


}
