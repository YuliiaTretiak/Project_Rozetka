import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class HomePageTest extends BasePageTest{
    private String SEARCH_WORD = "Марка";
    private static final long DEFAULT_TIMEOUT = 90;
    private String EXPECTED_SEARCH_RESULT = "Знайдено більше 1000 товарів";

    @Test
    public void checkHeaderVisibility() {
        getHomePage().waitForPageLoadComplete(DEFAULT_TIMEOUT);
        getHomePage().waitForAjaxToComplete(DEFAULT_TIMEOUT);
        getHomePage().waitForAjaxToCompletePdp(DEFAULT_TIMEOUT);
        assertTrue(getHomePage().isHeaderVisible());
    }

    @Test
    public void checkSearchFieldVisibility() {
        assertTrue(getHomePage().isSearchFieldVisible());
    }

    @Test
    public void checkSearchResults (){
        getHomePage().searchByKeyword(SEARCH_WORD);
        getHomePage().clickSearchButton();
        getSearchResultsPage().waitForPageLoadComplete(DEFAULT_TIMEOUT);
        getSearchResultsPage().waitForAjaxToComplete(DEFAULT_TIMEOUT);
        getSearchResultsPage().waitForAjaxToCompletePdp(DEFAULT_TIMEOUT);
        assertTrue(getSearchResultsPage().isResultVisible());
        assertEquals(EXPECTED_SEARCH_RESULT, getSearchResultsPage().getSearchResultText());
    }
}
