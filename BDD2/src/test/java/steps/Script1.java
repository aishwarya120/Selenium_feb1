package steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Script1 {
	
	WebDriver d1;
	@Given("Open chrome browser and url of the application")
	public void open_chrome_browser_and_url_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aishwarya.sacharya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		d1=new ChromeDriver();
		d1.get("https://ksrtc.in/oprs-web/login/show.do");
		System.out.println("Given done");
	}
	@When("Enter {string} , {string} and click on login button")
	public void enter_and_click_on_login_button(String string, String string2) throws AWTException {
	    // Write code here that turns the phrase above into concrete actions
		  d1.findElement(By.id("userName")).sendKeys("aishwarya.sacharya@hcl.com");
		  d1.findElement(By.id("password")).sendKeys("Aishwarya13*");
		  d1.findElement(By.id("submitBtn")).click();
		  d1.findElement(By.id("fromPlaceName")).sendKeys("BANGALORE");
		  Robot r1=new Robot();
		  r1.keyPress(KeyEvent.VK_ENTER);
		  r1.keyRelease(KeyEvent.VK_ENTER);
		  d1.findElement(By.id("toPlaceName")).sendKeys("AATINGAL");
		  r1.keyPress(KeyEvent.VK_ENTER);
		  r1.keyRelease(KeyEvent.VK_ENTER);
		  
		  JavascriptExecutor jse=(JavascriptExecutor) d1;
		  
		  jse.executeScript("document.getElementById('txtJourneyDate').value='27/01/2022'");
		  jse.executeScript("document.getElementById('txtReturnJourneyDate').value='31/01/2022'");
		  System.out.println("When done");
		  d1.findElement(By.xpath("//*[@id='bookingsForm']/div[1]/div/div[2]/div[3]/button")).click();
	}
	@Then("Success in login")
	public void success_in_login() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Then done");
	}

}
