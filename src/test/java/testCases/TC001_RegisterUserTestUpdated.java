package testCases;

import functions.NewToursCommonFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;

public class TC001_RegisterUserTestUpdated {

    WebDriver driver;

    @BeforeMethod
    public void openPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/newtours/index.php");
    }

    @Test
    public void TC001(){
//        registerUser();
//        verifyRegistrationSuccess();

        HomePageUpdated homePage = new HomePageUpdated(driver);
        String actualText = homePage.selectRegisterMenu()
                            .setFirstName("Davey")
                            .setLastName("Jones")
                            .setEmail("test@gmail.com")
                            .setCountrySelect()
                            .setUserName("DJones")
                            .setPassword("test123")
                            .setConfirmPassword("test123")
                            .setSubmitBtn()
                            .registerSuccessText();

//        RegisterSuccessPageUpdated registerSuccessPage = new RegisterSuccessPageUpdated(driver);
//        String actualText = registerSuccessPage.registerSuccessText();
        Assert.assertTrue(actualText.contains("Dear"),"Registration attempt failed");

//        NewToursCommonFunctions newToursCommonFunctions = new NewToursCommonFunctions(driver);
//        String actualText =newToursCommonFunctions.registerUser("Davey","Jones","test@gmail.com","DJones","test123","test123");
//        Assert.assertTrue(actualText.contains("Dear"),"Registration Attempt failed");

//        driver.findElement(homePage.registerBtn_loc).click();

    }



    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}

//    public void registerUser(){
//        HomePageUpdated homePage = new HomePageUpdated(driver);
//        homePage.registerBtn_ele.click();
//
//        RegisterPageUpdated registerPage = new RegisterPageUpdated(driver);
//        registerPage.setFirstName("Davey");
//        registerPage.setLastName("Jones");
//        registerPage.setEmail("test@gmail.com");
//        registerPage.setCountrySelect();
//        registerPage.setUserName("DJones");
//        registerPage.setPassword("test123");
//        registerPage.setConfirmPassword("test123");
//        registerPage.setSubmitBtn();
//    }
//
//    public void verifyRegistrationSuccess(){
//        RegisterSuccessPageUpdated registerSuccessPage = new RegisterSuccessPageUpdated(driver);
//        String actualText = registerSuccessPage.registerSuccessText();
//        Assert.assertTrue(actualText.contains("Dear"),"Registration attempt failed");
//    }
