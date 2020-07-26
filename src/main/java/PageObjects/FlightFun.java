package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightFun {
	public WebDriver driver;
	public FlightFun(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
		@FindBy(id="ctl00_mainContent_rbtnl_Trip_1")
		public WebElement selectTrip;
		
		@FindBy(id="ctl00_mainContent_ddl_originStation1_CTXT")
		public WebElement departDropdwn;
		
		@FindBy(css="a[value='MAA']")
		public WebElement goDepart;
		
		@FindBy(css="[id*='glsctl00_mainContent_ddl_destinationStation1_CTNR'] [value*='GOI']")
		public WebElement goDestn;
		
		@FindBy(id="divpaxinfo")
		public WebElement clickPassenger;
		
		@FindBy(id="ctl00_mainContent_ddl_Adult")
		public WebElement passengerDropAdult;
		
		@FindBy(id="ctl00_mainContent_DropDownListCurrency")
		public WebElement currDropdown;
		
		@FindBy(css="[data-handler='selectDay']")
		public List<WebElement> dateList1;
		
		@FindBy(xpath="//div[@id='ui-datepicker-div']/div[1]/div/div/span[1]")
		public WebElement monthSelect1;
		
		@FindBy(xpath="//div[@id='ui-datepicker-div']/div[2]/div/a/span")
		public WebElement monthNext1;
		
		/*@FindBy(xpath="//div[@id='ui-datepicker-div']/div[2]/div/div/span[1]")
		public WebElement monthSelect2;
		
		@FindBy(xpath="//div[@id='ui-datepicker-div']/div[2]/div/a/span")*/
		
		
		public WebElement monthNext1() {
			return monthNext1;
		}
		
		public WebElement monthSelect1() {
			return monthSelect1;
		}
		
		public List<WebElement> dateList1() {
			return dateList1;
			
		}
		
		public WebElement currDropdown() {
			return currDropdown;
		}
		public WebElement passengerDropAdult(){
			return passengerDropAdult;	
		}
		
		
		
		
		public WebElement clickPassenegr() {
			return clickPassenegr();
		}
		
		
		public WebElement goDestn() {
			return goDestn;	
		}
		public WebElement goDepart() {
			return goDepart;
			
		}
		public WebElement departDropdwn() {
			return departDropdwn;
			
		}
		
		public WebElement selectTrip() {
			return selectTrip;
		}
		
		
		
	

}
