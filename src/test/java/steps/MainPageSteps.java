package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import utils.CommonMethods;

public class MainPageSteps extends CommonMethods {

    @Given("user goes to enuygun.com webpage")
    public void user_goes_to_enuygun_com_webpage() {
        click(mainPage.cerezKabulEt);
    }

    @When("user search for a round trip departure on {string} {string}  and return on {string} {string}  from {string} to {string} for {int} adult")
    public void user_search_for_a_round_trip_departure_on_and_return_on_from_to_for_adult(String depDay, String depMonth, String arrDay, String arrMonth, String departurePort, String destPort, int adultPassenger) {
        click(mainPage.gidisDonusField);
        click(mainPage.neredenField);
        sendText(mainPage.neredenField, departurePort);
        mainPage.neredenField.sendKeys(Keys.ENTER);
        click(mainPage.nereyeField);
        sendText(mainPage.nereyeField, destPort);
        mainPage.nereyeField.sendKeys(Keys.ENTER);
        click(mainPage.gidisTarihiField);
        for (int i = 0; i < 12; i++) {
            if (mainPage.firstMonth.getText().equals(depMonth)) {
                for (int j = 0; j < mainPage.firstMonthActiveDepartureDays.size(); j++) {
                    if (mainPage.firstMonthActiveDepartureDays.get(i).getText().equals(depDay)) {
                        mainPage.firstMonthActiveDepartureDays.get(i).click();
                        mainPage.firstMonthActiveDepartureDays.get(i).sendKeys(Keys.ENTER);
                        break;
                    }
                }
            } else if (mainPage.secondMonth.getText().equals(depMonth)) {
                for (int j = 0; j < mainPage.firstMonthActiveDepartureDays.size(); j++) {
                    if (mainPage.firstMonthActiveDepartureDays.get(i).getAttribute("data-day").equals(depDay)) {
                        mainPage.firstMonthActiveDepartureDays.get(i).click();
                        break;
                    }
                }
            } else {
                click(mainPage.departureMonthForwardButton);
            }
        }
        click(mainPage.passangerField);
        click(mainPage.searchButton);

    }

}
