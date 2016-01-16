package chu.xo.controller;

import chu.xo.model.Field;
import chu.xo.model.Figure;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Created by Chmakov on 16.01.2016.
 */
public class WinnerControllerTest {

    @Test
    public void testGetWinnerWhenWinnerRow() throws Exception {
        final Field field = new Field(3);
        final WinnerController winnerController = new WinnerController();
        for (int i = 0; i < 3; i++) {
            field.setFigure(new Point(i, 0), Figure.X);
            field.setFigure(new Point(i, 1), Figure.X);
            field.setFigure(new Point(i, 2), Figure.X);

            assertEquals(Figure.X, winnerController.getWinner(field));
        }
    }
    @Test
    public void testGetWinnerWhenNoWinnerRow() throws Exception {

        final WinnerController winnerController = new WinnerController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(i, 0), Figure.O);
            field.setFigure(new Point(i, 1), Figure.X);
            field.setFigure(new Point(i, 2), Figure.X);

            assertNull(winnerController.getWinner(field));
        }
    }
}