package baseclass;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.sourceforge.cobertura.javancss.FileUtil;

public class BaseClass {

	public static WebDriver driver;
	public WebDriver launchBrowser(String name) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\javapracctise\\SeleniumPractise\\lib\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get(name);
		return driver;
	}
	
	public void sendText(WebElement element, String name) {
		element.sendKeys(name);
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void quit() {
		driver.quit();
	}
	
	public void mouseOver(WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target);
	}
	
	public void dropDown(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	public void implicit() {
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}
	
	public void explicit(WebElement element) {
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void fluient(WebElement element) {
		FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver);
		f.pollingEvery(1, TimeUnit.SECONDS);
		f.ignoring(NoSuchElementException.class);
		f.until(ExpectedConditions.visibilityOf(element));
		f.withTimeout(10, TimeUnit.SECONDS);
		
	}
	
	public void scroll(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(fasle);", element);
			}
	}
	
	public void screenShot(String name) throws IOException {
		TakesScreenshot s = (TakesScreenshot) driver;
		File file = s.getScreenshotAs(OutputType.FILE);
		File target = new File("D:\\Notes\\seleinum task\\"+name+".jpg");
		FileUtils.moveFile(file, target);
	
	}
	
}
