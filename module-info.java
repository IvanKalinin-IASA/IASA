package selenium_tests;

import epam.main_page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class EpamTests {
	
	
	WebDriver driver = null;
	main_page login;
	
	@Given("open {string}")
	public void open(String string) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Selenium\\cucumber\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		login = new main_page(driver);
		login.open(string);
	}
	
	@When("search {string}")
	public void search(String string) {
		login.search(string);
	}

	
	@When("scroll down to Join Our Team Today! click on {string}")
	public void scroll_down_to_join_our_team(String string) {
		login.click_on_JoinOurTeam();
	}

	@When("scroll down to PRIVACY POLICY click on {string}")
	public void scroll_down_to_privacy_policy(String string) {
		login.click_on_PrivacyPolicy();
	}
	
	@When("scroll down to Learn more about our partners click on {string}")
	public void scroll_down_to_learn_more_about_our_partners(String string) {
		login.click_on_LearnMoreAboutOurPartners();
	}
	
	@When("scroll down to OUR BRANDS click on {string}")
	public void scroll_down_to_our_brands(String string) {
		login.click_on_Our_Brands();
	}
	
	
	@When("click on letter picture")
	public void click_on_letter_picture() {
		login.click_on_letter_picture();
	}

	@When("click on Insights")
	public void click_on_insights() {
		login.click_on_insights();
	}
	
	@When("click on How we do it")
	public void click_on_how_we_do_it() {
		login.click_on_how_we_do_it();
	}
	
	
	@Then("u should see {string} {string}")
	public void u_should_see(String string1, String string2) {
		login.check_page(string1);
		login.check_page(string2);
	}
	
	@Then("u should see {string}")
	public void u_should_see(String string) {
		login.check_page(string);
	}
	@Then("u should see {string} {string}")
	public void u_should_see(String string1, String string2) {
		login.check_page(string1);
		login.check_page(string2);
	}



	@When("press {string} on keyboard")
	public void press_on_keyboard(String string) {

	    throw new io.cucumber.java.PendingException();
	}

}
