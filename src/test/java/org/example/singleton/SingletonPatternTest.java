package org.example.singleton;

import org.junit.Test;

public class SingletonPatternTest {

    @Test
    public void testSingleTonPattern(){
        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }

}
