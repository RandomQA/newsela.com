package newsela.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class A_Home_Page extends BasePage {

    @FindBy(xpath = "//button[@class='header-module--announcement__close--XcH6S']")
    public WebElement announcement;

    @FindBy(xpath = "//div[@class='mainNav-module--menu__parent--3oUlw']")
    public List<WebElement>headerLinks;

    @FindBy(xpath = "//a[@class='heroClassic-module--button--2LE3Z']")
    public WebElement learnMoreButton;

    @FindBy(xpath = "//button[@class='popupCTA-module--close--1Dks8']")
    public WebElement getInTouchPopUp;

    @FindBy(xpath = "//li[@class='bc-li-wrapper has-link component-wrapper bc-center empty']")
    public List<WebElement>topElements;

}
