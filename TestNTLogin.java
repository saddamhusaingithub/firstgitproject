package po.iteration3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterClass;

public class TestNTLogin {
	NTLoginPage myHomePage;

	@Test (groups = {"Smoke", "Regression"})
	public void nicheThyselfLoginTest() throws InterruptedException {
		myHomePage.login("stc123", "12345");
		String expectedTitleAfterLogin = "My account";
		String actualTitleAfterLogin = myHomePage.getTitleAfterLogin();
		assertEquals(actualTitleAfterLogin, expectedTitleAfterLogin, "Loing was unsuccessful");
	}

	@BeforeClass
	public void beforeClass() {
		myHomePage = new NTLoginPage();
	}

	@AfterClass
	public void afterClass() {
		myHomePage.closeBrowser();
	}

}
