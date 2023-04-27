package org.test.prolaborate.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends XLdata{
	public static WebDriver driver;
	public static PojoClass p;

	public static String xlfile = "TestData//Forms.xlsx";
	
	public static void testData(String xlfile) {
		xlfile = "TestData//Forms.xlsx";

	}

	public static void CloseBrowser() {
		driver.quit();
		System.out.println("\n *Successfully Closed the Browser* \n");
	}

	
	public static void launchURL(String url) {
		driver.get(url);

	}

	public static void maxWindows() {
		driver.manage().window().maximize();

	}

	public static void close() {
		driver.close();

	}

	public static void quit() {
		driver.quit();

	}

	public static void waits() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void elementWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 600000);
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	public static void sleep(int time) throws InterruptedException {
		Thread.sleep(time);

	}

	public static void sleep() throws InterruptedException {
		Thread.sleep(2000);

	}

	public static void textFill(WebElement element, String input) {
		element.sendKeys(input);

	}

	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);

	}

	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URl : " + currentUrl);
		return currentUrl;

	}

	public static void getTitle() {
		String currentTitle = driver.getTitle();
		System.out.println("Page Title : " + currentTitle);

	}

	public static void getValue(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}

	public static void click(WebElement element) {
		element.click();

	}

	public static void screenshot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File theDir = new File("ScreenShots");
		if (!theDir.exists()) {
			theDir.mkdirs();
		}
		File destination = new File("ScreenShots\\" + filename + ".png");
		FileUtils.copyFile(source, destination);
	}

	public static void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void forward() {
		driver.navigate().forward();

	}

	public static void backward() {
		driver.navigate().back();

	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void blank() {
		System.out.println("");

	}

	public static void doubleClick(WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).build().perform();
	}

	public static void mouseHover(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

	

	public static void msg(String text) {
		System.out.println(text);

	}

	

	// Kiran

	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://localhost/project/live/");// url hit
		System.out.println("Chrome browser opened");
	}

	public static void launchFirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://localhost/project/live/");// url hit
		System.out.println("firefox browser opened");
	}

	public static void launchEdge() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://localhost/project/live/");// url hit
		System.out.println("Edge browser opened");

	}

	public static void signout() throws InterruptedException {
		driver.findElement(By.xpath("//img[@class='d-inline-block rounded-circle user-icon']")).click();// profile image
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sign Out']")).click();// click sign out
	}

	public static void AdWaits() {
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	}

	public void elementwait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void userSignOut() throws InterruptedException {

		p.getProfileIcon().click();// clicking profile icon
		sleep();
		p.getSignout().clear();// cliking signout

	}
	public static void Waits(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	

}
