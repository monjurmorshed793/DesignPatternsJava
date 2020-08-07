package org.example.factory;

public class FactoryProducer {
    public static AbstractShapeFactory getFactory(){
        return new AbstractShapeFactoryImpl();
    }
}
