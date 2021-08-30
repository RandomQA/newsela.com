package newsela.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class C_Apply_Page extends BasePage {

    @FindBy(xpath = "//*[@id='gatsby-focus-wrapper']/main/header/div/nav/div[7]/div[2]/a[4]")
    public WebElement careersLink;

    @FindBy(xpath = "//a[@class='heroClassic-module--button--2LE3Z']")
    public WebElement joinOurTeamButton;

    @FindBy(xpath = "(//a[@target='_top'])[47]")
    public WebElement QualityEngineerLink;

    @FindBy(xpath = "//button[@class='popupCTA-module--close--1Dks8']")
    public WebElement getInTouchPopUp;

    @FindBy(xpath = "//button[@class='header-module--announcement__close--XcH6S']")
    public WebElement announcement;





}
