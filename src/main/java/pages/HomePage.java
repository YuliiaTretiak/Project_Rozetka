package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.openqa.selenium.Keys.ENTER;

public class HomePage extends BasePage{

    @FindBy(xpath = "//header")
    private WebElement header;

    @FindBy(xpath = "//input")
    private WebElement searchField;
    @FindBy (xpath = "//button[contains(@class, 'search-form__submit ng-star-inserted')]")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {super(driver);}

    public boolean isHeaderVisible() {
        return header.isDisplayed();
    }

    public boolean isSearchFieldVisible() {
        return searchField.isDisplayed();
    }

    public void searchByKeyword(final String keyword) {
        searchField.sendKeys(keyword);
    }

    public void clickSearchButton () { searchButton.click();}

}
