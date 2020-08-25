package stepDefinations;

import PageObject.Selectors;
import PageObject.WebDriverSetup;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

@RunWith(Cucumber.class)
public class stepDefination extends WebDriverSetup {


    @Given("^User is on MyWorld com home page$")
    public void user_is_on_myworld_com_home_page() throws Throwable {
        driver = initDriver();
        driver.get(prop.getProperty("url"));
    }
    @When("^User opens All Categories dropdown menu$")
    public void user_opens_all_categories_dropdown_menu() throws Throwable {
        Selectors kategorien = new Selectors(driver);
        kategorien.getCookies().click();
        kategorien.getKategorienDropDown().click();
    }
    @And("^User clicks on All Categories and chooses Computer subcategory$")
    public void user_clicks_on_all_categories() throws Throwable {
        Selectors kategorien = new Selectors(driver);
        kategorien.getKategorienButton().click();
        kategorien.getComputer().click();
    }
    @Then("^Computer subcategory is populated$")
    public void all_categories_page_is_populated() throws Throwable {
//        System.out.println("All categories page is displayed");
        Selectors kategorien = new Selectors(driver);
        boolean isComDisplayed = kategorien.getComputerDisplayed().isDisplayed();
        Assert.assertEquals(isComDisplayed,true);
    }


    @Given("^Computer Page displayed$")
    public void all_categories_page_is_opened() throws Throwable {
        System.out.println("Computer Page displayed");
    }
    @When("^User click on list view button$")
    public void user_click_on_list_view_button() throws Throwable {
        Selectors kategorien = new Selectors(driver);
        kategorien.getList().click();
    }
    @Then("^List view computer products representation is displayed$")
    public void list_view_computer_products_representation_is_displayed() throws Throwable {
        Selectors kategorien = new Selectors(driver);
        boolean checkList = kategorien.getAssertListView().isDisplayed();
        Assert.assertEquals(checkList,true);
    }


    @Given("^List view computer products representation$")
    public void list_view_computer_products_representation() throws Throwable {
        System.out.println("Computer subcategories are displayed using list view");
    }
    @When("^User select most relevant option$")
    public void user_select_most_relevant_option() throws Throwable {
        Selectors kategorien = new Selectors(driver);
        Select ByIndex = new Select(kategorien.getSortBy());
        ByIndex.selectByIndex(3);
    }
    @Then("^Computer products are sorted by most relevant products$")
    public void computer_products_are_sorted_by_most_relevant_products() throws Throwable {
        Selectors kategorien = new Selectors(driver);
        boolean mostExpensive = kategorien.getMostExpensive().isSelected();
        Assert.assertEquals(mostExpensive,true);
    }


    @When("^User select cheapest option$")
    public void user_select_cheapest_option() throws Throwable {
        Selectors kategorien = new Selectors(driver);
        Select ByVisibility = new Select(kategorien.getSortBy());
        ByVisibility.selectByVisibleText("Preis aufsteigend"); //cheapest
    }
    @Then("^Computer products are sorted starting from cheapest products$")
    public void computer_products_are_sorted_starting_from_cheapest_products() throws Throwable {
        Selectors kategorien = new Selectors(driver);
        boolean cheapest = kategorien.getCheapest().isSelected();
        Assert.assertEquals(cheapest,true);
    }


    @When("^User select newest option$")
    public void user_select_newest_option() throws Throwable {
        Selectors kategorien = new Selectors(driver);
        Select ByIndex = new Select(kategorien.getSortBy());
        ByIndex.selectByIndex(3);
    }
    @Then("^Computer products are sorted starting from newest products$")
    public void computer_products_are_sorted_starting_from_newest_products() throws Throwable {
        Selectors kategorien = new Selectors(driver);
        boolean mostExpensive = kategorien.getMostExpensive().isSelected();
        Assert.assertEquals(mostExpensive,true);
    }
}