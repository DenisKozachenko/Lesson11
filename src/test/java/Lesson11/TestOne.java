package Lesson11;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOne extends BaseSetUp {

    private MainElem mainElem;

    @BeforeMethod
    public void setupMainElem() {
        mainElem = new MainElem(driver);
    }

    @Test
    public void canCheckTotalPriceForTShirt() {
        mainElem.searchValue();
        mainElem.doSearch();
        mainElem.selectViewMode();
        mainElem.addItemToCart();
        mainElem.proceed();
        mainElem.addOneMoreToCart();


        String actualResult = mainElem.getTotalPrice();
        String expectedResult = "$56.00";

        Assert.assertEquals(expectedResult, actualResult);

        mainElem.clearCart();

    }
}
