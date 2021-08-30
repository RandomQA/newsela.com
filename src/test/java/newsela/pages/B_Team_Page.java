package newsela.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class B_Team_Page extends BasePage {

    @FindBy(xpath = "//button[@class='header-module--announcement__close--XcH6S']")
    public WebElement announcement;

    @FindBy(xpath = "//div[@class='mainNav-module--menu__parent--3oUlw']")
    public List<WebElement> headerLinks;

    @FindBy(xpath = "//*[@id='gatsby-focus-wrapper']/main/header/div/nav/div[7]/div[2]/a[2]")
    public WebElement teamLink;

    @FindBy(xpath = "//h1[@class='teamMembers-module--member__name--1w_3f']")
    public List<WebElement> teamMembers;




}
