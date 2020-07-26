package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Phone_PADs extends Util
{
    private By _hTCTouchHD = By.xpath("//div[@class=\"row\"]/div[1]/div[1]/div[2]/div[2]/button/span");
    String expectedTextForFirstProduct = "HTC Touch HD";
    private By _iPhone = By.xpath("//div[@class=\"row\"]/div[2]/div[1]/div[2]/div[2]/button/span");
    String expectedTextForSecondProduct = "iPhone";
    private By _shoppingCartButton = By.xpath("//span[text()=\"Shopping Cart\"]");

    public void toVerifyUserAddBothProductInToCart()
    {
        clickOnElement(_hTCTouchHD);
        clickOnElement(_iPhone);

    }
    public void toVerifyThatUserShouldClickOnShoppingCart()
    {
        clickOnElement(_shoppingCartButton);
        Assert.assertEquals(getTextFromElement(_hTCTouchHD),expectedTextForFirstProduct," First Product Wrong");
        Assert.assertEquals(getTextFromElement(_iPhone),expectedTextForSecondProduct,"Second Product is Wrong");
    }
}
