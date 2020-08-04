import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase {


    @Test
    public void logintest() {

        System.setProperty("webdriver.gecko.driver", "F:\\firefoxd driver\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();

        webDriver.navigate().to("https://accounts.lambdatest.com/login");

        WebElement textfield_email = webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/form/div[1]/input"));
        WebElement textfield_password = webDriver.findElement(By.xpath("//*[@id=\"userpassword\"]"));


        textfield_email.sendKeys("aafiahmed98new@gmail.com");
        textfield_password.sendKeys("12345678");

        webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[3]/button")).click();

        String Expected_title = "Welcome - LambdaTest";
        String Actial_title = webDriver.getTitle();

        Assert.assertEquals(Expected_title, Actial_title);

    }
    //////////////////////////////////////////////  2  /////////////////////////////////////////////////////////////


    @Test
    public void logintest2() {

        System.setProperty("webdriver.gecko.driver", "F:\\firefoxd driver\\geckodriver.exe");
        WebDriver webDriver2 = new FirefoxDriver();

        webDriver2.navigate().to("https://accounts.lambdatest.com/login");

        WebElement textfield_email2 = webDriver2.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/form/div[1]/input"));
        WebElement textfield_password2 = webDriver2.findElement(By.xpath("//*[@id=\"userpassword\"]"));


        textfield_email2.sendKeys("aafiahmed98new@gmail.com");
        textfield_password2.sendKeys("1234567....8");

        webDriver2.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[3]/button")).click();

        String Expected_title2 = "Welcome - LambdaTest";
        String Actial_title2 = webDriver2.getTitle();

        Assert.assertEquals(Expected_title2, Actial_title2);
    }





    /////////////////////////////////////////  3  ////////////////////////////////////////////////


    @Test
    public void logintest3() {

        System.setProperty("webdriver.gecko.driver", "F:\\firefoxd driver\\geckodriver.exe");
        WebDriver webDriver3 = new FirefoxDriver();

        webDriver3.navigate().to("https://accounts.lambdatest.com/login");

        WebElement textfield_email3 = webDriver3.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/form/div[1]/input"));
        WebElement textfield_password3 = webDriver3.findElement(By.xpath("//*[@id=\"userpassword\"]"));


        textfield_email3.sendKeys("aafiahmed98new@gmail.com");
        textfield_password3.sendKeys(" ");

        webDriver3.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[3]/button")).click();

        String Expected_title3 = "Welcome - LambdaTest";
        String Actial_title3 = webDriver3.getTitle();

        Assert.assertEquals(Expected_title3, Actial_title3);

    }


    ////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////sign up//////////////////////////////////////////////


    @Test
    public void signup1() {

        System.setProperty("webdriver.gecko.driver", "F:\\firefoxd driver\\geckodriver.exe");
        WebDriver webDriver4 = new FirefoxDriver();

        webDriver4.navigate().to("https://accounts.lambdatest.com/register");

        WebElement signuptextfield_username = webDriver4.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div[1]/input"));
        WebElement signuptextfield_email = webDriver4.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div[2]/input"));
        WebElement signuptextfield_password = webDriver4.findElement(By.xpath("//*[@id=\"userpassword\"]"));
        WebElement signuptextfield_companyname = webDriver4.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div[4]/input"));
        WebElement signuptextfield_phone = webDriver4.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div[5]/input"));

        signuptextfield_username.sendKeys("aafaq ahmed");
        signuptextfield_email.sendKeys("aafiahmed98new@gmail.com");
        signuptextfield_password.sendKeys("12345678");
        signuptextfield_companyname.sendKeys("abc");
        signuptextfield_phone.sendKeys("03231212118 ");

        webDriver4.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div[6]/button")).click();

        String signupExpected_title = "Verify Your Email Address - LambdaTest";
        String signupActial_title = webDriver4.getTitle();

        Assert.assertEquals(signupExpected_title, signupActial_title);

    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////sign up 2///////////////////////////////////////////////////////////////////////

    @Test
    public void signup2() {

        System.setProperty("webdriver.gecko.driver", "F:\\firefoxd driver\\geckodriver.exe");
        WebDriver webDriver5 = new FirefoxDriver();

        webDriver5.navigate().to("https://accounts.lambdatest.com/register");

        WebElement signuptextfield_username2 = webDriver5.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div[1]/input"));
        WebElement signuptextfield_email2 = webDriver5.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div[2]/input"));
        WebElement signuptextfield_password2 = webDriver5.findElement(By.xpath("//*[@id=\"userpassword\"]"));
        WebElement signuptextfield_companyname2= webDriver5.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div[4]/input"));
        WebElement signuptextfield_phone2 = webDriver5.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div[5]/input"));

        signuptextfield_username2.sendKeys("aafaq ahmed //////");
        signuptextfield_email2.sendKeys("aafiahmed98new@gmail.com");
        signuptextfield_password2.sendKeys("    ");     //here we give empty field
        signuptextfield_companyname2.sendKeys("abc");
        signuptextfield_phone2.sendKeys("03231212118 ");

        webDriver5.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div[6]/button")).click();

        String signupExpected_title2 = "Verify Your Email Address - LambdaTest";
        String signupActial_title2 = webDriver5.getTitle();

        Assert.assertEquals(signupExpected_title2, signupActial_title2);

    }

    //////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////sign up 3//////////////////////////////////////

    @Test
    public void signup3() {

        System.setProperty("webdriver.gecko.driver", "F:\\firefoxd driver\\geckodriver.exe");
        WebDriver webDriver6 = new FirefoxDriver();

        webDriver6.navigate().to("https://accounts.lambdatest.com/register");

        WebElement signuptextfield_username3 = webDriver6.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div[1]/input"));
        WebElement signuptextfield_email3 = webDriver6.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div[2]/input"));
        WebElement signuptextfield_password3 = webDriver6.findElement(By.xpath("//*[@id=\"userpassword\"]"));
        WebElement signuptextfield_companyname3= webDriver6.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div[4]/input"));
        WebElement signuptextfield_phone3 = webDriver6.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div[5]/input"));

        signuptextfield_username3.sendKeys("aafaq ahmed12345");        //here give integer in name
        signuptextfield_email3.sendKeys("aafiahmed98new@gmail.com");
        signuptextfield_password3.sendKeys("12345678 ");     //here we give empty field
        signuptextfield_companyname3.sendKeys("abc");
        signuptextfield_phone3.sendKeys("03231212118 ");

        webDriver6.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div[6]/button")).click();

        String signupExpected_title3 = "Verify Your Email Address - LambdaTest";
        String signupActial_title3 = webDriver6.getTitle();

        Assert.assertEquals(signupExpected_title3, signupActial_title3);

    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////








}





















 