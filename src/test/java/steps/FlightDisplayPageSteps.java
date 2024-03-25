package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

public class FlightDisplayPageSteps extends CommonMethods {
    @When("user clicks on search and filter departure flights between {int} and {int}")
    public void user_click_on_search_and_filter_departure_flights_between_and(int firstHour, int secondHour) {
        click(flightDisplayPage.gidisKalkisVarisSaatleri);
        Actions action = new Actions(driver);
        action.dragAndDropBy(flightDisplayPage.gidisSaatiSlider1, 0, firstHour).build().perform();
        action.dragAndDropBy(flightDisplayPage.gidisSaatiSlider2, 1440, secondHour).build().perform();
    }


    @Then("user validates the result are between {int} and {int}")
    public void user_validates_the_result_are_between_and(int firstHour, int secondHour) {
        for (WebElement flightHours : flightDisplayPage.gidisKalkisSaatlerListesi
        ) {
            int i = Integer.parseInt(flightHours.getText().replace(":", ""));
            Assert.assertTrue(firstHour <= i && i <= secondHour);
        }
    }

    @Then("user clicks on the THY company and validate the order")
    public void userClicksOnTheTHYCompanyAndValidateTheOrder() {
        click(flightDisplayPage.airlineCompanySelect);
        click(flightDisplayPage.thySelect);
        for (int i = 0; i <flightDisplayPage.thyFlightsDepTimeList.size() ; i++) {
          int firstIndex = Integer.parseInt( flightDisplayPage.thyFlightsDepTimeList.get(i).getText().replace(":",""));
          int secondIndex = Integer.parseInt( flightDisplayPage.thyFlightsDepTimeList.get(i+1).getText().replace(":",""));
                    Assert.assertTrue(secondIndex>firstIndex);

        }
        //

    }
}
