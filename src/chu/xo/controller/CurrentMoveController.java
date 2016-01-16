package chu.xo.controller;

import chu.xo.model.Field;
import chu.xo.model.Figure;
import chu.xo.model.exceptions.invalidPointException;

import java.awt.*;

/**
 * Created by Chmakov on 16.01.2016.
 */
public class CurrentMoveController {
    public Figure currentMove(final Field field){
        int countFigure = 0;
        for(int x = 0;x < field.getSize();x++){
            for(int y = 0;y < field.getSize();y++){
                try {
                    if (field.getFigure(new Point(x,y)) != null)
                    countFigure++;
                } catch (invalidPointException e) {
                    e.printStackTrace();
                }
            }
        }
        if (countFigure == field.getSize() * field.getSize())
            return null;
        if (countFigure % 2 == 0)
            return Figure.X;

        return Figure.O;

    }
}
