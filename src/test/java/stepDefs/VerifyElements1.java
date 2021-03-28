package stepDefs;

import io.cucumber.java8.En;
import org.testng.asserts.SoftAssert;
import pages.CommonPage;
import support.SoftAssertion;

public class VerifyElements1 implements En {

    SoftAssertion softAssert=new SoftAssertion();

    public VerifyElements1(){

        Given("User is on Dashboard Page", () ->System.out.print("On Dashboard"));

        When("Open Account is present", () ->{
            softAssert.assertEquals(CommonPage.isOpenAccountPresent(),"open account present");

        });

        When("Is Accounts Overview is present", () ->{
            softAssert.assertEquals(CommonPage.isAccountsOverviewPresent(),"accounts overview present");
        });


        Then("Message Elements are Present", () -> {
            System.out.print("success");
        });



    }
}
