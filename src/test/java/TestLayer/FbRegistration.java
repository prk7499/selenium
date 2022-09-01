package TestLayer;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterFB;

public class FbRegistration extends BaseClass {
	@Test
	public void validateFbRegistration() throws IOException {
		
		BaseClass.init();
		RegisterFB rfb=new RegisterFB();
		
		rfb.regFbPage("Pratik", "Bhavsar", "abc@gmail.com", "12", "Jan", "2022");
	}

}
