package stepDefinations;

import PageObject.WebDriverSetup;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination extends WebDriverSetup {

    @Given("^User is on MyWorld com home page$")
    public void user_is_on_myworld_com_home_page() throws Throwable {
        driver = initDriver();
        driver.get(prop.getProperty("url"));
    }
    @When("^User opens All Categories dropdown menu$")
    public void user_opens_all_categories_dropdown_menu() throws Throwable {
        System.out.println("Given");
    }
    @And("^User clicks on All Categories$")
    public void user_clicks_on_all_categories() throws Throwable {
        System.out.println("Given");
    }
    @Then("^All Categories page is populated$")
    public void all_categories_page_is_populated() throws Throwable {
        System.out.println("Given");
    }


    @Given("^All categories page is opened$")
    public void all_categories_page_is_opened() throws Throwable {
        System.out.println("Given");
    }
    @When("^User clicks on computer subcategory from Electronic category$")
    public void user_clicks_on_computer_subcategory_from_electronic_category() throws Throwable {
        System.out.println("Given");
    }
    @And("^User click on list view button$")
    public void user_click_on_list_view_button() throws Throwable {
        System.out.println("Given");
    }
    @Then("^List view computer products representation is displayed$")
    public void list_view_computer_products_representation_is_displayed() throws Throwable {
        System.out.println("Given");
    }


    @Given("^List view computer products representation$")
    public void list_view_computer_products_representation() throws Throwable {
        System.out.println("Given");
    }
    @When("^User select most relevant option$")
    public void user_select_most_relevant_option() throws Throwable {
        System.out.println("WHEN");
    }
    @Then("^Computer products are sorted by most relevant products$")
    public void computer_products_are_sorted_by_most_relevant_products() throws Throwable {
        System.out.println("Given");
    }


    @When("^User select cheapest option$")
    public void user_select_cheapest_option() throws Throwable {
        System.out.println("Given");
    }
    @Then("^Computer products are sorted starting from cheapest products$")
    public void computer_products_are_sorted_starting_from_cheapest_products() throws Throwable {
        System.out.println("Given");
    }


    @When("^User select newest option$")
    public void user_select_newest_option() throws Throwable {
        System.out.println("Given");
    }
    @Then("^Computer products are sorted starting from newest products$")
    public void computer_products_are_sorted_starting_from_newest_products() throws Throwable {
        System.out.println("THEN");
    }
}