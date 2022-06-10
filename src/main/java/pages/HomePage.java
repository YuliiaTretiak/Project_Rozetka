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

    public HomePage(WebDriver driver) {super(driver);}

    public boolean isHeaderVisible() {
        return header.isDisplayed();
    }

    public boolean isSearchFieldVisible() {
        return searchField.isDisplayed();
    }

    public void searchByKeyword(final String keyword) {
        searchField.clear();
        searchField.sendKeys(keyword, Keys.ENTER);
    }

}
