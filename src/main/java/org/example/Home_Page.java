package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Home_Page extends Util
{
    private By _yourStoreTitleText = By.xpath("//a[text()=\"Your Store\"]");
    String expectedTitleOfThePage = "Your Store";
    private By _phones_PDAs = By.xpath("//a[text()=\"Your Store\"]");

    public void UserShouldBeAbleToAddProductToBasketSuccessfully()
    {
        Assert.assertEquals(getTextFromElement(_yourStoreTitleText),expectedTitleOfThePage, "user is not on Home Page");

    }
    public void toVerifyUserClickOnPhoneAndPDAs()
    {
        clickOnElement(By.xpath("//a[text()=\"Phones & PDAs\"]"));
    }
}
