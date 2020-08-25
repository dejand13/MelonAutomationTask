import PageObject.Selectors;
import PageObject.WebDriverSetup;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

@Slf4j
public class ElectronicComputerTest extends WebDriverSetup {
    public WebDriver driver;
    @Test
    public void ElectronicComputerTest() throws Exception {
        driver = initDriver();
        driver.get(prop.getProperty("url"));

        Selectors kategorien = new Selectors(driver);

        kategorien.getCookies().click();
        kategorien.getKategorienDropDown().click();
        kategorien.getKategorienButton().click();
        kategorien.getComputer().click();
        kategorien.getList().click();

        try{
            boolean checkList = kategorien.getAssertListView().isDisplayed();
            Assert.assertEquals(checkList,true);
//            log.info("Item has been displayed in list view.");
        } catch (Exception e) {
            throw new AssertionError("List view was not displayed");
        }

        Select ByValue = new Select(kategorien.getSortBy());
        ByValue.selectByValue("newest");

        boolean newest = kategorien.getNewest().isSelected();
        Assert.assertEquals(newest,true);

        Select ByVisibility = new Select(kategorien.getSortBy());
        ByVisibility.selectByVisibleText("Preis aufsteigend"); //cheapest

        boolean cheapest = kategorien.getCheapest().isSelected();
        Assert.assertEquals(cheapest,true);


        Select ByIndex = new Select(kategorien.getSortBy());
        ByIndex.selectByIndex(3);

        boolean mostExpensive = kategorien.getMostExpensive().isSelected();
        Assert.assertEquals(mostExpensive,true);
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
