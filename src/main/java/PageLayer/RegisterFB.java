package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.HandleDropDown;

public class RegisterFB extends BaseClass{
	
	@FindBy (name="firstname")
	WebElement fname;

	@FindBy (name="lastname")
	WebElement lname;
	
	@FindBy (name="reg_email__")
	WebElement email;
	
	
	@FindBy (id="day")
	WebElement day;
	
	
	@FindBy (id="month")
	WebElement month;
	
	@FindBy (id="year")
	WebElement year;
	
	@FindBy (name="websubmit")
	WebElement submit;
	
	
	public RegisterFB() {
		
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	
	
	public void regFbPage(String Fname,String Lname,String Email,String Day,String Month,String Year) {
		
		fname.sendKeys(Fname);
		lname.sendKeys(Lname);
		email.sendKeys(Email);
		HandleDropDown.dropDownByVisibleText(day,Day );
		HandleDropDown.dropDownByVisibleText(month, Month);
		HandleDropDown.dropDownByVisibleText(year, Year);
		submit.click();
		
		
	}

}
