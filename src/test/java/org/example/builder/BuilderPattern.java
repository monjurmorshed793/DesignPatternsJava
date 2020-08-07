package org.example.builder;

import org.junit.Test;

public class BuilderPattern {

    @Test
    public void testBuilderPattern(){
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.toString());
    }
}
