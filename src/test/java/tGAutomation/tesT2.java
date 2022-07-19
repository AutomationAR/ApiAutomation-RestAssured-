package tGAutomation;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Resource.Base;
import pageObject.TGHome;

public class tesT2 extends Base {
	public WebDriver driver;

	@BeforeTest
	public void oPenBrowser() throws IOException {
		driver = initializedriver();
		driver.manage().window().maximize();
		driver.get(pop.getProperty("url"));
	}

	@Test
	public void ReCarCheckBox() {
		TGHome aa = new TGHome(driver);
		aa.getownerIcNo().sendKeys(pop.getProperty("VehicleOwner'sNRICorPassNumber"));
		aa.getcBoxreCon().click();
		Assert.assertEquals(aa.getwarningMess(), "Warning: Reconditioned cars are currently not supported.");
	}

	@AfterTest
	public void cLoseBrowser() {
		driver.close();
	}

}
