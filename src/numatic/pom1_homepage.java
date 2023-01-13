package numatic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1_homepage extends base1
{

	@FindBy (xpath = "//h2[text()='JOIN OUR CREW']") private WebElement Header_Text;
	@FindBy (xpath = "//lyte-icon[@class='dropdown']") private WebElement Filter_button;
	@FindBy (xpath = "//lyte-drop-item[@data-value='Engineering']") private WebElement Engineering;
	@FindBy (xpath = "(//a[@class='cw-1-title'])[2]") private WebElement QA_Engineer;
	@FindBy (xpath = "(//button[@type='button'])[2]") private WebElement Button;
	

	public pom1_homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public String verify_header_text(String expected_header)
	{
		String actual_header = Header_Text.getText();

		if(actual_header.equals(expected_header)) 
		{
			System.out.println("Test case is Pass");
		}
		else {
			System.out.println("Test case is Fail");
		}
		return actual_header;

	}		
	public void select_QA_Engineer() throws InterruptedException
	{
		Actions act = new Actions (driver);
		act.moveToElement(Filter_button);
		Thread.sleep(2000);
		act.click().perform();
		Thread.sleep(2000);
		Engineering.click();
		Thread.sleep(2000);
		QA_Engineer.click();
		
	}
	
	public String verify_title (String expected_title)
	{
		String actual_title = driver.getTitle();

		if(actual_title.equals(expected_title)) 
		{
			System.out.println("Test case is Pass as both titles same");
		}
		else {
			System.out.println("Test case is Fail as both titles are diffrent");
		}
		return actual_title;
	}
	
	public void verify_button()
	{
		boolean result = Button.isEnabled();
		if (result==true)
		{ 
			System.out.println(" ‘I’m interested’ button is present");
			Button.click();
		}
		else
		{
			System.out.println(" ‘I’m interested’ button is not present");
		}
		
	}

}






