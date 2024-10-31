package newmaven.newmaven;

import com.microsoft.playwright.Browser;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.util.regex.Pattern;

import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class launchbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    Playwright playwright = Playwright.create();
            Browser browser = playwright.chromium().launch(
            		new LaunchOptions().setHeadless(false).setSlowMo(100)
            	);
            Page page = browser.newPage();
            page.navigate("http://playwright.dev");
            assertThat(page).hasTitle(Pattern.compile("Playwright"));
            page.locator("//a[normalize-space()='Get started']").click();
            page.locator("//a[normalize-space()='Generating tests']").click();
            page.close();
            

	}

}
