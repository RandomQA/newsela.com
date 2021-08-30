package newsela.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import newsela.pages.A_Home_Page;
import newsela.pages.B_Team_Page;
import newsela.utilities.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class B_Team_StepDefinitions {
    Actions actions=new Actions(Driver.getDriver());
    B_Team_Page b_team_page=new B_Team_Page();
    List<String> teamNamesList = new ArrayList<>();
    List<String> sameNameList = new ArrayList<>();
    String fileName = "Some Information About Newsela.com";



    @Given("User Hover over to the Company link")
    public void userHoverOverToTheCompanyLink() {
        Log4j.info("User close the announcement bar");
        b_team_page.announcement.click();
        Log4j.info("User Hover over to the Company link");
        ReusableMethods.hover(b_team_page.headerLinks.get(6));
        ReusableMethods.waitFor(2);
    }

    @Then("User Clicks the Team link")
    public void userClicksTheTeamLink() {
        Log4j.info("User Clicks the Team link");
        b_team_page.teamLink.click();
        ReusableMethods.waitFor(2);
        b_team_page.announcement.click();
        Log4j.info("User scroll down one time");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("User gets the team members name")
    public void userGetsTheTeamMembersName() {
        Log4j.info("User gets the team members name&surname and added to the 'Some Details About Newsela.com Text File'");
        for (int i = 0; i < b_team_page.teamMembers.size(); i++) {
            teamNamesList.add(ReusableMethods.getElementsText(b_team_page.teamMembers).get(i));
        }
        WriteToText.write(fileName, "The All Members in Newsela.com :\n" + teamNamesList);
    }

    @When("Check the names for duplicated one")
    public void checkTheNamesForDuplicatedOne() {
        Log4j.info("User Check the names for duplicated one");
        for (int i = 0; i < teamNamesList.size(); i++) {
            String employeeName = teamNamesList.get(i);
            int count = 0;
            for (int j = i + 1; j < teamNamesList.size() - 1; j++) {
                if (employeeName.equalsIgnoreCase(teamNamesList.get(j))) {
                        count++;
                }
            }
            if (count > 0) {
                sameNameList.add(employeeName);
            }
            count = 0;
        }
    }

    @Then("Write the duplicated names to the 'Some Details About Newsela.com Text File' if there is.")
    public void writeTheDuplicatedNameToTheDetailsFileIfThereIs() {
        Set<String> sameNames = new HashSet<>(sameNameList);
        Log4j.info("User printed the duplicated names on 'Some Details About Newsela.com Text File' if there is.");
        WriteToText.write(fileName, "The Duplicated Names in Team :\n" + sameNames.toString());
        Log4j.endLog("Team Test");
    }
}
