package org.example.factory;

import org.junit.Test;

public class AbstractFactoryPatternTest {
    @Test
    public void testFactoryPattern(){
        AbstractShapeFactory shapeFactory = FactoryProducer.getFactory();

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();
    }
}
