import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class DraftTest {

    @Test
    public void loginTest() {
        Driver.setHeadless();
        Driver.getDriver().get("https://practice.expandtesting.com/login");
        Driver.getDriver().findElement(By.id("username")).sendKeys("practice");
        Driver.getDriver().findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        String getAccess = Driver.getDriver().findElement(By.xpath("//div[@id='flash']//b")).getText();
        Assertions.assertEquals("You logged into a secure area!", getAccess);
        Driver.getDriver().quit();
    }
}
