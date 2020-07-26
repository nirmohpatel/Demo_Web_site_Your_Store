package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Suit extends Base_Test
{
    Home_Page home_page = new Home_Page();

    @Test
    public void toVerifyUserIsOnHomePage()
    {
        home_page.UserShouldBeAbleToAddProductToBasketSuccessfully();
        home_page.toVerifyUserClickOnPhoneAndPDAs();
    }

}
