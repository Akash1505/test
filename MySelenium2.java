import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class MySelenium2 {
    public static void main(String[] args) {
    	System.setProperty("webdriver.firefox.marionette","/home/ravi/Downloads/geckodriver");
    	WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://www.facebook.com";
        String tagName = "";
        
        driver.get(baseUrl);
        tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagName);
        driver.close();
        System.exit(0);
}
}