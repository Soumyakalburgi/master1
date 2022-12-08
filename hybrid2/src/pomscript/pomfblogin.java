package pomscript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class pomfblogin 
	{
		@FindBy(xpath="//input[@id='email']")
		private WebElement unTbox;
		
		@FindBy(id="pass")
		private WebElement pwTbox;
		
		@FindBy(xpath="//button[@type='submit']")
		private WebElement lgnBtn;
		
		@FindBy(xpath=("(//input[@placeholder='Search Facebook'])[1]"))
		private WebElement search;

		public pomfblogin(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public void userName(String un)
		{
			unTbox.sendKeys(un);
		}
		public void password(String pwd)
		{
			pwTbox.sendKeys(pwd);
		}
		public void login()
		{
			lgnBtn.click();
		}
		public void search(String sch)
		{
			search.sendKeys(sch);
		}
		

	}


