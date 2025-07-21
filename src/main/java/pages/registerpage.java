package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import javax.xml.xpath.XPath;
import java.util.ArrayList;

public class registerpage extends base{
    Faker fake =new Faker();
    public registerpage(WebDriver driver){
        super(driver);
    }

    private final By firstname =By.xpath("//input[@id=\"firstname\"]");
    private final By lastname =By.xpath("//input[@id=\"lastname\"]");
    private final By password =By.xpath("//input[@name=\"password\"]");
    private final By email =By.xpath("//input[@id=\"email\"]");
    private final By jobTitle =By.xpath("//input[@placeholder=\"e.g. Marketing, Data Analyst, Sales, etc..\"]");
    private final By creatButton =By.xpath("//button[@class=\"css-12g3p01 ezfki8j0\"]");
    private final By signUpManually =By.xpath("//a[@class=\"css-110f84v ezfki8j0\"]");
    private final By dayArrow =By.xpath("//div[@class=\"col-2-lg col-12\"]//div[@class=\" css-1wy0on6\"]");
    private final By monthArrow =By.xpath("//div[@class=\"col-3-lg col-12\"][1]//i[@class=\"css-tjx49 efou2fk0\"]");
    private final By yearArrow =By.xpath("//div[@class=\"col-3-lg col-12\"][2]//i[@class=\"css-tjx49 efou2fk0\"]");
    private final By female   =By.xpath("//label[@class=\"css-1t6kodx e1kea1u62\"][2]/div[@class=\"css-bhwo3q e1kea1u61\"]");
    private final By nationalityArrow   =By.xpath("//div[@class=\"section-validation-error css-6hend0 e1v1l3u10\"][1]//div[@class=\"css-rpi6b5 e1g066lk4\"]//i[@class=\"css-tjx49 efou2fk0\"]");
    private final By countryArrow   =By.xpath("//div[@class=\"section-validation-error css-6hend0 e1v1l3u10\"][1]//div[@class=\"css-rpi6b5 e1g066lk4\"][1]//i[@class=\"css-tjx49 efou2fk0\"]");
    private final By cityArrow   =By.xpath("//div[@class=\"section-validation-error css-6hend0 e1v1l3u10\"][1]//div[@class=\"css-rpi6b5 e1g066lk4\"][2]//i[@class=\"css-tjx49 efou2fk0\"]");
    private final By mobile  =By.xpath("//input[@name=\"primaryPhone\"]");
    private final By continueButton  =By.xpath("//button[@class=\"css-2dg8nw ezfki8j0\"]");
    private final By bachelor=By.xpath("//div[@class=\"css-1dy69p2 eequ2uf0\"][1]");
    private final By fieldofstudy=By.xpath("//input[@placeholder=\"e.g., Business, Accounting\"]");
    private final By university=By.xpath("//div[@class=\"css-rzjfos\"]//input[@autocomplete=\"off\"]");
    private final By dateOfDegreeArrow=By.xpath("//div[@class=\"css-vbnqhq e1g066lk2\"]//i[@class=\"css-tjx49 efou2fk0\"]");
    private final By gradeArrow=By.xpath("//div[@class=\"css-1guj1as\"]//i[@class=\"css-tjx49 efou2fk0\"]");
    private final By yearsOfExperinceArrow=By.xpath("//div[@class=\"section-validation-error css-1h480x3 e1v1l3u10\"]//i[@class=\"css-tjx49 efou2fk0\"]");
    private final By yearsOfExperince=By.xpath("//div[@class=\" css-11r7ebr-menu\"]/div/div");
    private final By jobTitleIn=By.xpath("//input[@name=\"jobTitle\"]");
    private final By company=By.xpath("//input[@name=\"companyName\"]");
    private final By jobCategoryArrow=By.xpath("//div[@data-field=\"jobCategories\"]//i[@class=\"css-tjx49 efou2fk0\"]");
    private final By jobCategory=By.xpath("//div[@class=\" css-11r7ebr-menu\"]/div/div[18]");
    private final By internship=By.xpath("//div[@tabindex=\"0\"][4]");
    private final By startMonthArrow=By.xpath("//div[@data-field=\"experienceDuration.startMonth\"]//i");
    private final By startMonth=By.xpath("//div[@class=\" css-17vybl5\"]/div[9]");
    private final By startyearArrow=By.xpath("//div[@data-field=\"experienceDuration.startYear\"]//div[@class=\" css-1dgicot-container\"]//i");
    private final By startyear=By.xpath("//div[@class=\" css-11r7ebr-menu\"]/div/div[2]");
    private final By currentlyWorkHere=By.xpath("//span[@class=\"css-hx5gx4\"]");
    private final By saveWorkExperince=By.xpath("//button[@name=\"Save_Work_Experience\"]");
    private final By languageArrow=By.xpath("//div[@class=\"css-911kv1 e1g066lk0\"][1]//i[@class=\"css-tjx49 efou2fk0\"]");
    private final By proficiencyArrow=By.xpath("//div[@class=\"css-911kv1 e1g066lk0\"][2]//i[@class=\"css-tjx49 efou2fk0\"]");
    private final By addLaanguageButton=By.xpath("//button[@class=\"css-ksyb00 ezfki8j0\"]");
    private final By iTSoftware=By.xpath("//div[@class=\" css-szlc4p-option\"][17]");
    private final By jobCategoryArrow_interesting=By.xpath("//div[@class=\"section-validation-error css-6hend0 e1v1l3u10\"]//i[@class=\"css-tjx49 efou2fk0\"]");
    private final By onSite=By.xpath("//button[@name=\"workplaces\"][1]//i[@class=\"css-10ppzdg efou2fk0\"]");
    private final By hybrid=By.xpath("//button[@name=\"workplaces\"][3]//i[@class=\"css-10ppzdg efou2fk0\"]");
    private final By fullTime=By.xpath("//button[@name=\"workTypes\"][1]//i[@class=\"css-10ppzdg efou2fk0\"]");
    private final By entryLevel=By.xpath("//div[@class=\"css-1dy69p2 eequ2uf0\"][2]");
    private final By minSalary=By.xpath("//input[@name=\"minimumSalary\"]");

   @FindBy(xpath="//form[@id=\"general-info-form\"]//div[1]//h4[@class=\"css-xy3oy2 e1gqe2o91\"]")
   public WebElement personalInfo;
@FindBy(xpath="//span[@class=\"css-vlxyh0\"]")
   public WebElement education;
@FindBy(xpath="//span[@class=\"css-vlxyh0\"]")
   public WebElement experience;
@FindBy(xpath="//span[@class=\"css-vlxyh0\"]")
   public WebElement expertise;
@FindBy(xpath="//span[@class=\"css-vlxyh0\"]")
   public WebElement careerInterest;
@FindBy(xpath="//button[@class=\"css-pkb4uu ezfki8j0\"]")
   public WebElement getStartedButton;



    public void fillRegisterInfo(String _firstname ,String _lastname ,String _email ,String  _pass,String job){
        set_text(firstname,_firstname);
        set_text(lastname,_lastname);
        set_text(email,_email);
        set_text(password,_pass);
        set_text(jobTitle,job);
    }
    public void click0nCreatAccount() throws InterruptedException {
        Thread.sleep(2000);

        click(creatButton);
        Thread.sleep(5000);
    }
    public void clickOnSignUPManually(){
        click(signUpManually);
    }
    public void selectDOB(int day ,int month,int year){
        click(dayArrow);
         driver.findElement(By.xpath("//div[@class=\" css-1tci6j0\"]//div["+day+"]")).click();
         click(monthArrow);
         driver.findElement(By.xpath("//div[@class=\" css-1tci6j0\"]//div["+month+"]")).click();
         click(yearArrow);
         driver.findElement((By.xpath("//div[@class=\" css-1tci6j0\"]//div["+year+"]"))).click();
    }
    public void  setpersonalinfo(){
        Faker fake =new Faker();
        click(female);
        click(nationalityArrow);
        int nationality=  getSize(By.xpath("//div[@class=\" css-1tci6j0\"]/div"));
        driver.findElement(By.xpath("//div[@class=\" css-1tci6j0\"]//div["+fake.number().numberBetween(1,nationality)+"]")).click();
        click(countryArrow);
        int  country=getSize(By.xpath("//div[@class=\" css-1tci6j0\"]/div"));
        driver.findElement(By.xpath("//div[@class=\" css-1tci6j0\"]//div["+fake.number().numberBetween(1,country)+"]")).click();
        click(cityArrow);
        int city =getSize(By.xpath("//div[@class=\" css-1tci6j0\"]/div"));
        driver.findElement(By.xpath("//div[@class=\" css-1tci6j0\"]//div["+fake.number().numberBetween(1,city)+"]")).click();
        set_text(mobile,Integer.toString(fake.number().numberBetween(01016611000,01016611666)));
    }
public void clickOnContinueButton() throws InterruptedException {
    Thread.sleep(3000);

    click(continueButton);
        Thread.sleep(1000);
}
public void setEductionalInfo(String field,String uni){
        click(bachelor);
        set_text(fieldofstudy,field);
        set_text(university,uni);
        click(dateOfDegreeArrow);
        int date=getSize(By.xpath("//div[@class=\" css-11r7ebr-menu\"]/div/div"));
        driver.findElement(By.xpath("//div[@class=\" css-11r7ebr-menu\"]/div/div["+fake.number().numberBetween(1,date)+"]")).click();
        click(gradeArrow);
        int grade=getSize(By.xpath("//div[@class=\" css-1tci6j0\"]/div"));
        driver.findElement(By.xpath("//div[@class=\" css-1tci6j0\"]/div["+fake.number().numberBetween(1,grade)+"]")).click();
}
public void fillExperinceInfo(){
        click(yearsOfExperinceArrow);
        driver.findElement(By.xpath("//div[@class=\" css-11r7ebr-menu\"]/div/div[2]")).click();
        set_text(jobTitleIn,"software tester");
    driver.findElement(jobTitleIn).sendKeys(Keys.ENTER);

    set_text(company,"semicorner");
    click(jobCategoryArrow);
    click(jobCategory);
        click(internship);
        click(startMonthArrow);
click(startMonth);
click(startyearArrow);
click(startyear);
    click(currentlyWorkHere);
        click(saveWorkExperince);


        
}
public void fillExpertiseInfo() throws InterruptedException {
        click(languageArrow);
driver.findElement( By.xpath("//div[@class=\" css-1tci6j0\"]/div[1]")).click();
       click(proficiencyArrow);
    driver.findElement( By.xpath("//div[@class=\" css-1tci6j0\"]/div[4]")).click();
  click(addLaanguageButton);
  Thread.sleep(3000);
    click(languageArrow);
    driver.findElement( By.xpath("//div[@class=\" css-1tci6j0\"]/div[9]")).click();
    click(proficiencyArrow);
    driver.findElement( By.xpath("//div[@class=\" css-1tci6j0\"]/div[3]")).click();
    click(addLaanguageButton);
    Thread.sleep(3000);

    WebElement element = driver.findElement(By.xpath("//div[@class='css-1ie8yy5 e1g066lk4']"));
    Actions actions = new Actions(driver);
    actions.moveToElement(element).click().sendKeys("software testing").perform()  ;
    actions.moveToElement(element).sendKeys(Keys.ENTER).perform();
actions.moveToElement(element).click().sendKeys("istqb").perform()  ;
    actions.moveToElement(element).sendKeys(Keys.ENTER).perform();
actions.moveToElement(element).click().sendKeys("automation  testing ").perform()  ;
    actions.moveToElement(element).sendKeys(Keys.ENTER).perform();


}
public void fillCareerinterestInfo(){
        click(entryLevel);
        click(fullTime);
        click(onSite);
        click(hybrid);
        click(jobCategoryArrow_interesting);
        click(iTSoftware);
        set_text(minSalary,"8000");
}
public void clickOnGetStartedButton(){
        click(getStartedButton);
}
}
