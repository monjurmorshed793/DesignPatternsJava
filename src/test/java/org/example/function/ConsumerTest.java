package org.example.function;

import org.junit.Test;

public class ConsumerTest {
    @Test
    public void testConsumer(){
        Consumer<String> c1 = s-> System.out.println("C1 = "+ s);
        Consumer<String> c2 = s-> System.out.println("C2 = "+ s);

        Consumer<String> c3 = c1.andThen(c2);

        c3.accept("Hello");
    }
}
