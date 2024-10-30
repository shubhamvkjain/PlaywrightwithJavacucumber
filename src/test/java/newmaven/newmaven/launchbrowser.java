package newmaven.newmaven;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class launchbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    Playwright playwright = Playwright.create();
            Browser browser = playwright.chromium().launch(
            		new LaunchOptions().setHeadless(false)
            	);
            Page page = browser.newPage();
            page.navigate("http://playwright.dev");
            page.locator("//a[normalize-space()='Get started']").click();
            page.close();
            

	}

}
