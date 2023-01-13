package numatic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class test1 extends base1
{

	pom1_homepage page1;
	
	
  @BeforeClass
  public void openbrowser() throws IOException 
  {
	    initilizebrowser();
	    page1= new pom1_homepage (driver);
		
  }
  
  @Test(priority = 0)
  public void verify_header_text() throws EncryptedDocumentException, IOException, InterruptedException
  {
	
	 page1.verify_header_text(utility1.GetTestData(0, 0));
	 Thread.sleep(5000);
  }
  
  @Test(priority = 1)
  public void select_QA_option() throws InterruptedException
  {
	  page1.select_QA_Engineer();
  }
  
  @Test(priority = 2)
  public void Verify_Title() throws InterruptedException, EncryptedDocumentException, IOException
  {
	  page1.verify_title(utility1.GetTestData(0, 1));
  }
  
  @Test(priority = 3)
  public void Verify_button() throws InterruptedException, EncryptedDocumentException, IOException
  {
	  page1.verify_button();
  }
}
