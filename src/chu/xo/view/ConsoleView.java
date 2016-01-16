package chu.xo.view;

import chu.xo.model.Field;
import chu.xo.model.Figure;
import chu.xo.model.Game;
import chu.xo.model.exceptions.invalidPointException;

import java.awt.*;

/**
 * Created by Chmakov on 16.01.2016.
 */
public class ConsoleView {

    public void show(final Game game){
        System.out.format("Game Name XO%s",game.getName());
        final Field field = game.getField();
        for(int x = 0;x < field.getSize(); x++){
            printLine(field,x);
        }
        printSeparator();

    }

    private void printLine(final Field field,final int x) {
        printSeparator();
        System.out.print("|");
        for(int y = 0;y < field.getSize(); y++){
            final Figure figure;
            try {
                figure = field.getFigure(new Point(x,y));
            } catch (invalidPointException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
            System.out.print(figure != null ? figure : " ");
            System.out.print("|");
        }
        System.out.println();

    }
    private void printSeparator(){
        System.out.println("~~~~~~~");
    }


    public void move(final Game game){

    }
}
