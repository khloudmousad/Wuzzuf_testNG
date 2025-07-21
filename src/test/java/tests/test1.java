package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.employeePage;
import pages.homepage;
import pages.registerpage;

public class test1 extends basetest {
    homepage home;
    registerpage register;
    Faker fake =new Faker();
SoftAssert soft =new SoftAssert();
employeePage empolyee  ;
    @Test
    public void registerAccount() throws InterruptedException {
        home=new homepage(driver);
        register=new registerpage(driver);
        empolyee=new employeePage(driver);
        home.clickOnGetStarted();
        //creat account
        register.fillRegisterInfo(fake.name().firstName(),fake.name().lastName(),fake.internet().emailAddress(Integer.toString(fake.number().numberBetween(1000000000,1999999999))),fake.internet().password(8,10),fake.job().position());
        register.click0nCreatAccount();
        register.clickOnSignUPManually();
        //personal information
        soft.assertEquals(register.personalInfo.getText().toLowerCase(),"your personal info");
        register.selectDOB(fake.number().numberBetween(1,31),fake.number().numberBetween(1,12),fake.number().numberBetween(1,116));
        register.setpersonalinfo();
         register.clickOnContinueButton();
         //educational information
   register.setEductionalInfo("communication","alexandriaUniversity");
   soft.assertEquals("tell us about your "+register.education.getText().toLowerCase(),"tell us about your education");

        register.clickOnContinueButton();
        //experience info
        register.fillExperinceInfo();
        soft.assertEquals("tell us about your "+register.experience.getText().toLowerCase(),"tell us about your experience");
        register.clickOnContinueButton();
         //expertise info
        register.fillExpertiseInfo();
        soft.assertEquals("tell us about your "+register.expertise.getText().toLowerCase(),"tell us about your expertise");
        register.clickOnContinueButton();
      //career interest
        register.fillCareerinterestInfo();
        soft.assertEquals("tell us about your "+register.careerInterest.getText().toLowerCase(),"tell us about your career interests");
        register.clickOnContinueButton();
        register.clickOnGetStartedButton();
        //search for a job
        empolyee.searchOnJob("software engineer");
        empolyee.checkThatsSearchedItemsAReRElated();
        soft.assertTrue(empolyee.numberOfSearchedJobs.isDisplayed());
        empolyee.FilterBypostedDate();
         empolyee.printNumberofSearchedJobs();
        //apply for ajob
        empolyee.applyForjob();
        soft.assertEquals(empolyee.savedDraft.getText().toLowerCase(),"1 saved draft applications");
        //delete account
        empolyee.deleteAccount();
        soft.assertEquals(empolyee.accountDeleted.getText().toLowerCase(),"your account has been deleted successfully.");

        soft.assertAll();
    }

}
