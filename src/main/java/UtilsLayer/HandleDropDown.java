package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass{
	
	public static void dropDownByVisibleText(WebElement wb,String value) {
		
		Select sb=new Select(wb);
		sb.selectByVisibleText(value);
				
	}

}
