package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class basetest {
    WebDriver driver;
    @BeforeMethod
    public void beforemethod()
    {
       WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(100000,TimeUnit.MILLISECONDS);
     driver.get("https://wuzzuf.net/jobs/egypt");
    }
    @AfterMethod
    public void aftermethod(){
       // driver.quit();
    }
}
