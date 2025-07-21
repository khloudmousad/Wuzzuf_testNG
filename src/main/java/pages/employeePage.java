package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.util.ArrayList;

public class employeePage extends base{
    public employeePage(WebDriver driver){
        super(driver);

    }
    private final By searchBar =By.xpath("//input[@placeholder=\"Search jobs, companies..\"]");
    private final By searchicon =By.xpath("//button[@type=\"submit\"][@class=\"css-23vaul eqveyz00\"]");
    private final By searchedElement =By.xpath("//div[@class=\"css-1gatmva e1v1l3u10\"]//h2");
    private final By datePostedArrow =By.xpath("//h3[@class=\"css-1d5tds3\"]//i[@class=\"css-1oy4qip efou2fk0\"]");
    private final By postedlastweek =By.xpath("//div[@class=\"css-19idom\"][3]//div[@class=\"css-bhwo3q e1kea1u61\"]");
    private final By firstJob =By.xpath("//div[@class=\"css-1gatmva e1v1l3u10\"][1]//div[@class=\"css-laomuu\"]//h2//a");
    private final By applyForJob =By.xpath("//button[@class=\"css-1m0yk35 ezfki8j0\"]");
    private final By saveAndapplyLAter =By.xpath("//button[@class=\"css-17magmd ezfki8j0\"]");
    private final By profileIcon =By.xpath("//div[@class=\"css-1y21uxh e52wflf2\"]//i[@class=\"css-190q8f efou2fk0\"]");
    private final By accountSettings =By.xpath("//div[@class=\"css-123hd9o epb9wcb2\"][9]//i[@class=\"css-yb1q05 efou2fk0\"]");
    private final By deleteAccount =By.xpath("//button[@class=\"css-14lf7og ezfki8j0\"]");
    private final By checkBoxDelete =By.xpath("//div[@class=\"css-1htfnu4\"]//span[@class=\"css-hx5gx4\"]");
    private final By deleteButton =By.xpath("//div[@class=\"css-1htfnu4\"]//button[@type=\"submit\"]");
    private final ArrayList<WebElement> searchedItems=new ArrayList<>(driver.findElements(By.xpath("//div[@class=\"css-1gatmva e1v1l3u10\"]//h2")));
@FindBy(xpath ="//span[@class=\"css-xkh9ud\"]/strong")
public WebElement  numberOfSearchedJobs;
@FindBy(xpath ="//h2[@class=\"css-2vkjbx e744ua62\"]")
public WebElement  savedDraft;
@FindBy(xpath ="//h3[@class=\"css-18nekxb\"]")
public WebElement  accountDeleted;

    public void searchOnJob(String text){
        Actions action =new Actions(driver);
        set_text(searchBar,text);
        action.sendKeys(Keys.ENTER).perform();

    }
    public  void checkThatsSearchedItemsAReRElated(){
        int size=getSize(searchedElement);
        int counter=0;
        for(int  i=1;i<=size;i++){

            if(driver.findElement(By.xpath("//div[@class=\"css-1gatmva e1v1l3u10\"]["+i+"]//h2")).getText().toLowerCase().contains("software")||driver.findElement(By.xpath("//div[@class=\"css-1gatmva e1v1l3u10\"]["+i+"]//div[@class=\"css-y4udm8\"]//div[2]//a")).getText().toLowerCase().contains("software")||driver.findElement(By.xpath("//div[@class=\"css-1gatmva e1v1l3u10\"]["+i+"]//div[@class=\"css-y4udm8\"]//div[2]//a")).getText().toLowerCase().contains("engineer"))
            {
                counter++;
            }
        }
        if(counter==size){
            System.out.println("The job listings relevant to Software Engineer.");
        }
        else {
            System.out.println("there are unrelated jobs in the kob list to software engineer");
        }

    }
    public void printNumberofSearchedJobs() throws InterruptedException {
        Thread.sleep(10000);
        String text=get_text(numberOfSearchedJobs);
        System.out.println(text);
    }
    public void FilterBypostedDate(){
        Actions action=new Actions(driver);
                action.scrollToElement(driver.findElement(datePostedArrow)).perform();
        click(datePostedArrow);
        click(postedlastweek);
    }
    public void applyForjob(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(firstJob)).click().perform();
        ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        click(applyForJob);
        actions.scrollToElement(driver.findElement(saveAndapplyLAter));
      click(saveAndapplyLAter);


    }
    public void  deleteAccount(){
        Actions actions = new Actions(driver);

        click(profileIcon);
        actions.moveToElement(driver.findElement(accountSettings)).click().perform();
        actions.moveToElement(driver.findElement(deleteAccount)).click().perform();
        click(checkBoxDelete);
        click(deleteButton);



    }
}
