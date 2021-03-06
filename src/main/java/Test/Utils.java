package Test;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Utils extends BasePage
{
    public void Implicitywait()
    {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.NANOSECONDS);
    }

    public void explicitywait()
    {

        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
    }

    public static void  click_Element(By by) // to click element
    {
        driver.findElement(by).click();
    }

    public static String get_text_Element(By by){ // to get text
        String text = driver.findElement(by).getText();
        return text;
    }

    public static void clear_element(By by){ // to clear element

        driver.findElements(by).clear();
    }
    public static void assert_element(Object actual,Object expected ,String message){//for Assert
        Assert.assertEquals(actual,expected,message);

    }
    public static void send_keys(By by,String b)// to send element
    {
        driver.findElement(by).sendKeys(b);
    }

    public static String get_attriubutes(By by,String b){
        String attr=driver.findElement(by).getAttribute(b);
        return attr;

    }
    public static List findElements(By by) {
        List a = driver.findElements(by);
        return a;
    }




    }
