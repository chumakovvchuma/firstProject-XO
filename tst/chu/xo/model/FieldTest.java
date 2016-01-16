package chu.xo.model;

import chu.xo.model.exceptions.AlreadyOccupiedException;
import chu.xo.model.exceptions.invalidPointException;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Created by Chmakov on 15.01.2016.
 */
public class FieldTest {

    @Test
    public void testGetSize() throws Exception {
        final Field field = new Field(3);
        assertEquals(3,field.getSize());

    }

    @Test
    public void testSetFigure() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(0,0);
        final Figure inputFigure = Figure.O;

        field.setFigure(inputPoint, inputFigure);

        final Figure actualFigure = field.getFigure(inputPoint);

        assertEquals(inputFigure,actualFigure);
    }

    @Test
    public void testGetFigureWhenFigureIsNotSet() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(0,0);

        final Figure actualFigure = field.getFigure(inputPoint);

        assertNull(actualFigure);
    }
    @Test
    public void testGetFigureWhenXIsLessThenZero() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(-1,0);

        try {
        field.getFigure(inputPoint);
            fail();
        } catch (final invalidPointException e){}

    }
    @Test
    public void testGetFigureWhenYIsLessThenZero() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(0,-1);

        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final invalidPointException e){}

    }
    @Test
    public void testGetFigureWhenXIsMoreThenSize() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(field.getSize() + 1,0);

        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final invalidPointException e){}

    }
    @Test
    public void testGetFigureWhenYIsMoreThenSize() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(0,field.getSize() + 1);

        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final invalidPointException e){}

    }

}