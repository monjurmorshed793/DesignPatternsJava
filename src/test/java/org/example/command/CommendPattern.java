package org.example.command;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CommendPattern {
    @Test
    public void testRunnable(){
        Task task1 = new Task(10, 12);
        Task task2 = new Task(11, 13);

        Thread thread1 = new Thread(task1);
        thread1.start();

        Thread thread2 = new Thread(task2);
        thread2.start();
    }

    @Test
    public void testBasicCommand(){
        Light light = new Light();
        Switch lightSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(light);

        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);

    }


    @Test
    public void testMacroCommand(){
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();

        Switch lightSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(bedroomLight);

        lightSwitch.storeAndExecute(toggleCommand);
//        lightSwitch.storeAndExecute(toggleCommand);
//        lightSwitch.storeAndExecute(toggleCommand);

        List<Light> lights = new ArrayList<>();
        lights.add(kitchenLight);
        lights.add(bedroomLight);

        Command allLightsCommand = new AllLightsCommand(lights);
        lightSwitch.storeAndExecute(allLightsCommand);

    }
}
