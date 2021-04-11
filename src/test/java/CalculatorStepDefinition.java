import io.cucumber.java.en.Given;

public class CalculatorStepDefinition {
    private Calculator calculator;

    @Given("calculator app is up and running")
    public void startCalculator() {
        calculator = new Calculator();
        System.out.println("Calculator was turned on");
    }
}
