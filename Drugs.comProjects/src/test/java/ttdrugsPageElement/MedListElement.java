package ttdrugsPageElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MedListElement {

	
	@FindBy(xpath="//*[@id='inner-wrap']/div[2]/div/ul/li[9]/a/img")
	public WebElement txtMedList;
}
