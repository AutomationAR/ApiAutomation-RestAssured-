package tGAutomation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resource.Base;
import pageObject.TGHome;

public class tesT1 extends Base {
	public WebDriver driver;

	@BeforeTest
	public void oPenBrowser() throws IOException {
		driver = initializedriver();
		driver.manage().window().maximize();
		driver.get(pop.getProperty("url"));
	}

	@Test
	public void getQuotation() {
		TGHome aa = new TGHome(driver);
		aa.getcarRegNum().sendKeys(pop.getProperty("CarRegistrationNumber"));
		aa.getownerIcNo().sendKeys(pop.getProperty("VehicleOwner'sNRICorPassNumber"));
		aa.getpostCode().sendKeys(pop.getProperty("Postcode"));
		aa.getgQbUtton().click();
		Assert.assertEquals(aa.getwarningMess(),
				"Uh-Oh, Looks like something went wrong, Make sure the info key in above are correct, and try again.");
	}

	@AfterTest
	public void cLoseBrowser() {
		driver.close();
	}

}
