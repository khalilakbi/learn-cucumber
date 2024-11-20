package hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before(order = 1)
    public void setUp() {
        System.out.println("this will run before each scenario");
    }

    @After(order = 1)
    public void tearDown() {
        System.out.println("this will run after each scenario");
    }
}
