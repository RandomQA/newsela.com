package newsela.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import newsela.pages.C_Apply_Page;
import newsela.utilities.Driver;
import newsela.utilities.ReusableMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class C_Apply_StepDefinitions {
    C_Apply_Page c_apply_page = new C_Apply_Page();
    Actions actions = new Actions(Driver.getDriver());

    @Then("User Clicks the Career link")
    public void userClicksTheCareerLink() {
        c_apply_page.careersLink.click();
    }

    @And("User Clicks the Join our Team Button")
    public void userClicksTheJoinOurTeamButton() {
        ReusableMethods.waitFor(2);
        c_apply_page.announcement.click();
        c_apply_page.joinOurTeamButton.click();
    }

    @And("User scroll down till TECHNOLOGY cathegory")
    public void userScrollDownTillTECHNOLOGYCathegory() {
        ReusableMethods.waitFor(3);
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.waitFor(6);
        c_apply_page.getInTouchPopUp.click();
        ReusableMethods.waitFor(2);
    }

    @Then("User clicks Quality Engineer link")
    public void userClicksQualityEngineerLink() {
        Driver.getDriver().switchTo().frame("grnhse_iframe");
        ReusableMethods.waitFor(1);
        JavascriptExecutor je = (JavascriptExecutor) Driver.getDriver();
        je.executeScript("arguments[0]. scrollIntoView(true);", c_apply_page.technologyLink);
        c_apply_page.QualityEngineerLink.click();
        ReusableMethods.waitForVisibility(c_apply_page.QualityEngineerLink, 5);
    }
}
