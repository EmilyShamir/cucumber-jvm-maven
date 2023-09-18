package com.czeczotka.bdd.steps;

import com.czeczotka.bdd.calculator.Calculator;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CalculatorSteps {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Given("^I have a calculator$")
    public void i_have_a_calculator() throws Throwable {
        //assertNotNull(calculator);
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void i_add_and(int arg1, int arg2) throws Throwable {
        //calculator.add(arg1, arg2);
    }

    @Then("^the result should be (\\d+)$")
    public void the_result_should_be(int result) throws InterruptedException {
        Thread.sleep(10000);
        throw new RuntimeException("aaa");
       // throw new IllegalArgumentException("localDate= cannot be in the future");
//            List names = new ArrayList<>();
//            names.add("Eric");
//            names.add("Sydney");
//
//            Iterator iterator = names.iterator();
//
//            while (iterator.hasNext()) {
//                iterator.remove();
//            }

//        List names = new ArrayList<>();
//        names.add("Eric");
//        names.add("Sydney");

//        return names.get(5);
//        Integer number = null;
//
//        if (number > 0) {
//            System.out.println("Positive number");
//        }
        //throw new NoSuchMethodException("sss");
        //throw new InvocationTargetException(new Throwable());
        //assertEquals(result, calculator.getResult());
    }

    @Given("a client user on the dashboard page of the application")
public void aClientUserOnTheDashboardPageOfTheApplication() {
}
    @When("client adds to cart a number of {string} units of {string}, more or equal than {string} units")
public void clientAddsToCartANumberOfUnitsOfMoreOrEqualThanUnits(String arg0, String arg1, String arg2) {

}

    @Then("the client sees in his cart that instead of the original price {string} per unit of {string} he has to pay a new price which is {string} percentage of the original price {string}")
public void theClientSeesInHisCartThatInsteadOfTheOriginalPricePerUnitOfHeHasToPayANewPriceWhichIsPercentageOfTheOriginalPrice(String arg0, String arg1, String arg2, String arg3) {
}

    @And("total price is computed as {string} times {string}")
public void totalPriceIsComputedAsTimes(String arg0, String arg1) {

}
}
