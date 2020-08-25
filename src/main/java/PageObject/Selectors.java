package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selectors {
    WebDriver driver;

    public Selectors(WebDriver driver) {
        this.driver = driver;
    }

    By Cookies = By.cssSelector("[data-qa='cookiesAgreementAcceptBtn']");
    public WebElement getCookies() {
        return driver.findElement(Cookies);
    }

    By KategorienDropDown = By.cssSelector("button[data-qa='headerCategoriesOpenBtnDesktop']");
    public WebElement getKategorienDropDown() {
        return driver.findElement(KategorienDropDown);
    }

    By KategorienButton = By.cssSelector("a[data-qa='headerCategoriesTreeTitleLink']");
    public WebElement getKategorienButton() {
        return driver.findElement(KategorienButton);
    }

    By Computer = By.xpath("//a[contains(text(),'Computer')]");
    public WebElement getComputer() {
        return driver.findElement(Computer);
    }

    By Videospiele = By.cssSelector("main.container-fluid:nth-child(3) div.cat-categories div.cat-categories__item:nth-child(9) h3:nth-child(1) > a.cat-categories__headingLink");
    public WebElement getVideospiele() {
        return driver.findElement(Videospiele);
    }

    By Kinderzimmer = By.cssSelector("main.container-fluid:nth-child(3) div.cat-categories div.cat-categories__item:nth-child(11) ul.u-resetList:nth-child(2) li:nth-child(2) > a:nth-child(1)");
    public WebElement getKinderzimmer() {
        return driver.findElement(Kinderzimmer);
    }

    By list = By.cssSelector("button[data-qa='searchResultPageListViewIcon']");
    public WebElement getList() {
        return driver.findElement(list);
    }

    By assertListView = By.xpath("//li[@class='c-sortAndViewSwitch__viewSwitch js-c-sortAndViewSwitch__viewSwitch ml-4 pt-1']//button[@class='c-viewSwitch__button js-c-viewSwitch__button--list btn-reset c-viewSwitch__button--activeView']");
    public WebElement getAssertListView() {
        return driver.findElement(assertListView);
    }

    By sortBy = By.cssSelector("select[data-qa='searchResultPageContentSortingSelect']");
    public WebElement getSortBy() {
        return driver.findElement(sortBy);
    }

    By cheapest = By.cssSelector("option[data-qa='searchResultPageContentSortingSelectOption_cheapest']");
    public WebElement getCheapest() {
        return driver.findElement(cheapest);
    }

    By newest = By.cssSelector("option[data-qa='searchResultPageContentSortingSelectOption_newest']");
    public WebElement getNewest() {
        return driver.findElement(newest);
    }

    By mostExpensive = By.cssSelector("option[data-qa='searchResultPageContentSortingSelectOption_mostexpensive']");
    public WebElement getMostExpensive() {
        return driver.findElement(mostExpensive);
    }
}
