package WayTest;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Basedata.base;
import PageObjects.FlightFun;

public class Functional extends base {

	@BeforeTest
	public void toPage() throws IOException {
		driver = initializer();
	}

	@Test
	public void FlightPage() {

		FlightFun F = new FlightFun(driver);
	    F.selectTrip.click();
		F.departDropdwn.click();
		F.goDepart.click();
		F.goDestn.click();

		while (!F.monthSelect1().getText().contains("June")) {
			F.monthNext1().click();
		}

		for (int i = 0; i < F.dateList1().size(); i++) {
			String text = F.dateList1().get(i).getText();
			if (text.equalsIgnoreCase("24")) {
				F.dateList1().get(i).click();
			}
		}
		driver.findElement(By.xpath("//div[@id='Div1']/button")).click();

		while (!F.monthSelect1.getText().contains("August")) {
			F.monthNext1().click();
		}

		for (int i = 0; i < F.dateList1().size(); i++) {
			if(F.dateList1().get(i).getText().equalsIgnoreCase("20")) {
				F.dateList1().get(i).click();
			}
		}

		F.clickPassenger.click();
		Select A = new Select(F.passengerDropAdult);
		A.selectByIndex(3);
		Select C = new Select(F.currDropdown);
		C.selectByVisibleText("USD");

	}
	/*
	 * @AfterTest public void teardown() { driver.close(); driver = null;
	 * 
	 * 
	 * 
	 * }
	 */
}
