package chu.xo.controller;

import chu.xo.model.Field;
import chu.xo.model.Figure;
import chu.xo.model.exceptions.AlreadyOccupiedException;
import chu.xo.model.exceptions.invalidPointException;

import java.awt.*;

/**
 * Created by Chmakov on 16.01.2016.
 */
public class MoveController {

    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure)throws AlreadyOccupiedException,invalidPointException {
        if (field.getFigure(point) !=null){
            throw new AlreadyOccupiedException();
        }
        field.setFigure(point, figure);


    }
}
