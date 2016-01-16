import chu.xo.model.Field;
import chu.xo.model.Figure;
import chu.xo.model.Game;
import chu.xo.model.Player;
import chu.xo.view.ConsoleView;

/**
 * Created by Chmakov on 16.01.2016.
 */
public class XOCli {
    public static void main(final String[] args){
        final String name1 = "chuma";
        final String name2 = "ololo";
        final Player[] players = new Player[2];
        players[0] = new Player(name1, Figure.X);
        players[1] = new Player(name2, Figure.O);


        String newgamexo;
        final Game gameXO = new Game(players,new Field(3),"XO");

        final ConsoleView consoleView = new ConsoleView();
        consoleView.show(gameXO);


    }
}
