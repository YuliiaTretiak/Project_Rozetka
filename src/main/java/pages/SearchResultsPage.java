package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage{

    @FindBy(xpath = "//div[@class='rz-search-result-qnty']")
    private WebElement result;

    public SearchResultsPage(WebDriver driver) {super(driver);}

    public boolean isResultVisible() {
        return result.isDisplayed();
    }

    public String getSearchResultText(){return result.getText();}
}
