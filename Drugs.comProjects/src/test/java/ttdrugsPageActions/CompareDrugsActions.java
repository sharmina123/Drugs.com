package ttdrugsPageActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import tt.utilities.SetupDrivers;
import ttdrugsPageElement.CompareDrugsElement;

public class CompareDrugsActions {

	CompareDrugsElement CompareDrugsElementObj;

	public CompareDrugsActions(){
		CompareDrugsElementObj = new CompareDrugsElement();
		PageFactory.initElements(SetupDrivers.driver, CompareDrugsElementObj);
	}
	
	
}

