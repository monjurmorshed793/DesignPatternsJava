package org.example.factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactoryPatternTest {

    @Test
    public void testFactoryPattern(){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();
    }
}
