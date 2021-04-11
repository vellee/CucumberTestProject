package Steps;

import app.Calculator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CalculatorStepDefinition {
    private Calculator calculator;
    int firstNum;
    int secondNum;

    @Given("calculator app is up and running")
    public void startCalculator() {
        calculator = new Calculator();
        System.out.println("app.Calculator was turned on");
    }

    @When("number one equals {int}")
    public void numberOneEquals(int arg0) {
        firstNum = arg0;
        System.out.println("The first number received is " + firstNum);
    }

    @And("number two equals {int}")
    public void numberTwoEquals(int arg0) {
        secondNum = arg0;
        System.out.println("The second number received is " + secondNum);
    }

    @Then("result equals {int}")
    public void resultEquals(int expectedResult) {
        int actualResult = calculator.addTwoNum(firstNum, secondNum);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
