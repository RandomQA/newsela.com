package newsela.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import newsela.pages.A_Home_Page;
import newsela.utilities.ConfigReader;
import newsela.utilities.Driver;
import newsela.utilities.Log4j;
import newsela.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class A_HomePage_StepDefinitions {

    A_Home_Page a_home_Page = new A_Home_Page();
    Actions actions=new Actions(Driver.getDriver());

    @Given("User goes to newsela.com Homepage {string}")
    public void userGoesToNewselaComHomepage(String homepage) {
        Log4j.startLog("HomePage Test");
        Log4j.info("User goes to the Home Page of newsela.com");
        Driver.getDriver().get(ConfigReader.getProperty(homepage));
    }

    @Given("User close the announcement bar")
    public void userCloseTheAnnouncementBar() {
        Log4j.info("User close the announcement bar");
        a_home_Page.announcement.click();
    }

    @And("User hover over to the header links one by one")
    public void userHoverOverToTheHeaderLinksOneByOne() {
        Log4j.info("User hover over to the header links one by one");
        for (int i = 0; i < a_home_Page.headerLinks.size(); i++) {
            ReusableMethods.borderMaking(a_home_Page.headerLinks.get(i));
            ReusableMethods.hover(a_home_Page.headerLinks.get(i));
            ReusableMethods.waitFor(2);
        }
        Log4j.info("User close the get in touch pop up");
        a_home_Page.getInTouchPopUp.click();
    }

    @Then("User clicks learn more button")
    public void userClicksLearnMoreButton() {
        Log4j.info("User clicks the Learn More Button");
        a_home_Page.learnMoreButton.click();
        Log4j.info("User switched to the new tab");
        Set<String> allWindowHandle = Driver.getDriver().getWindowHandles();
        List<String> windowsHandles = new ArrayList<>(allWindowHandle);
        Driver.getDriver().switchTo().window(windowsHandles.get(1));
    }

    @And("User scroll down to the bottom of the page")
    public void userScrollDownToTheBottomOfThePage() {
        Log4j.info("User scroll down to the bottom of the page");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.END).perform();
    }

    @Then("User hover over to the links one by one at the top of the page")
    public void userHoverOverToTheLinksOneByOneAtTheTopOfThePage() {
        Log4j.info("User hover over to the links one by one at the top of the page and make red border for them.");
        for (int i = 0; i < a_home_Page.topElements.size(); i++) {
            ReusableMethods.hover(a_home_Page.topElements.get(i));
            ReusableMethods.waitFor(1);
            ReusableMethods.borderMaking(a_home_Page.topElements.get(i));
        }
        Log4j.endLog("HomePage Test");
    }


}