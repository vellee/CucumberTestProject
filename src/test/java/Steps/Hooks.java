package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before("@operation_test")
    public void beforeHook() {
        System.out.println("This hook will run before the scenario\n");
    }

    @After("@operation_test")
    public void afterHook() {
        System.out.println("This hook will run after the scenario\n");
    }

}
