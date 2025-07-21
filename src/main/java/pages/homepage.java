package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homepage extends base{
    public homepage(WebDriver driver ){
        super(driver);

    }
private final By getStarted=  By.xpath("//a[@aria-label=\"navigate to sign up page\"]");








    public void clickOnGetStarted(){
        click(getStarted);
    }
}
