package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TGHome{
	public WebDriver driver;

	public TGHome(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By carRegNum = By.cssSelector("input[name='regNo']");
	By ownerIcNo = By.cssSelector("input[name='icNo']");
	By postCode = By.cssSelector("input[name='postCode']");
	By cBoxreCon = By.cssSelector("div[class*='IN-checkbox']");
	By warningMess = By.cssSelector("div[class='wrapper']");
	By gQbUtton= By.cssSelector("button[type='submit']");

	public WebElement getcarRegNum() {
		return driver.findElement(carRegNum);
	}

	public WebElement getownerIcNo() {
		return driver.findElement(ownerIcNo);
	}
	
	public WebElement getpostCode() {
		return driver.findElement(postCode);
	}
	
	public WebElement getcBoxreCon() {
		return driver.findElement(cBoxreCon);
	}
	
	public String getwarningMess() {
		return driver.findElement(warningMess).getText();
	}
	public WebElement getgQbUtton() {
		return driver.findElement(gQbUtton);
	}
}
