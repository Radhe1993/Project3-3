package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearTest;
import com.softwaretestingboard.magento.pages.MenTest;
import com.softwaretestingboard.magento.pages.WomenTest;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest
{
    WomenTest womentest = new WomenTest();
    MenTest men = new MenTest();
    GearTest gear = new GearTest();

    @Test
    public void verifyTheSortByProductNameFilter()
    {
        womentest.setWomen();
        womentest.setTop();
        womentest.clickOnJacket();
        womentest.realProductName();
        womentest.selectProductName();
        womentest.setJacketsNameListAfter();
        String expected ="Adrienne Trek Jacket";
        String actual = getTextFromElement(By.xpath("//a[contains(text(),'Adrienne Trek Jacket')]"));
        Assert.assertEquals(actual,expected);
        womentest.setWomen1 ();
        womentest. setTop1 ();
        womentest.clickOnJacket1 ();
        womentest.realPrice ();
        womentest.selectProductPrice ();
        womentest.setJacketsPriceListAfter ();
        String expected1 ="32.0, 56.25, 57.0, 57.0, 59.0, 60.0, 69.0, 69.0, 75.0, 77.0, 77.0, 84.0";
        String actual1 = getTextFromElement(By.xpath("//span[@class='price-wrapper ']//span"));
        Assert.assertEquals(actual,expected);

    }
    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart()
    {
        men.setMen();
        men.setBottom();
        men.setPants();
        men.setYogaPant();
        men.setSize();
        men.setBlackColour();
        men.clickOnAddToCart();
        men.verifyMessage();
        String expected = "You added Cronus Yoga Pant to your shopping cart.";
        String actual = getTextFromElement(By.xpath("//body/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
        Assert.assertEquals(actual,expected);
        men.clickOnShoppingCart();
        men.verifyMessage1();
        String expected1 = "Shopping Cart";
        String actual1  = getTextFromElement(By.xpath("//body/div[1]/main[1]/div[1]/h1[1]/span[1]"));
        Assert.assertEquals(actual1,expected1);
        men.verifyMessage2();
        String expected2 = "Cronus Yoga Pant";
        String actual2 = getTextFromElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/strong[1]/a[1]"));
        Assert.assertEquals(actual2,expected2);
        men.verifyMessage3();
        String expected3 = "32";
        String  actual3 = getTextFromElement(By.xpath("//dd[contains(text(),'32')]"));
        Assert.assertEquals(actual3,expected3);
        men.verifyMessage4();
        String expected4 = "Black";
        String actual4 = getTextFromElement(By.xpath("//dd[contains(text(),'Black')]"));
        Assert.assertEquals(actual4,expected4);

    }
    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart1()
    {

        gear.setGear();
        gear.setBag();
        gear.clickOnProduct();
        gear.getText();
        String expected = "Overnight Duffle";
        String actual = getTextFromElement(By.xpath("//span[contains(text(),'Overnight Duffle')]"));
        Assert.assertEquals(actual,expected);
        gear.setProductQty();
        gear.clickOnAddToCart();
        gear.getText1();
        String expected1 = "You added Overnight Duffle to your shopping cart.";
        String actual1 = getTextFromElement(By.xpath("//body/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
        Assert.assertEquals(actual1,expected1);
        gear.clickOnShoppingCart();
        gear.veirfyProductName();
        String expected2 ="Cronus Yoga Pant";
        String actual2 =getTextFromElement(By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']"));
        Assert.assertEquals(actual2,expected2);
        gear. verifyProductQty();
        String expected3 = "3";
        String actual3 = getTextFromElement(By.xpath("driver.findElement(By.xpath(\"//input[@id='cart-244678-qty']\"))"));
        Assert.assertEquals(actual3,expected3);
        gear.veirfyProductPrice();
        String expected4 = getTextFromElement(By.xpath("driver.findElement(By.xpath(\"//span[contains(text(),'$144.00')]\"))"));
        String actual4 = "144.00";
        Assert.assertEquals(expected4,actual4);
        gear.changeQty();
        gear.setUpdateCart();
        gear.verifyProductPrice();
        String expected5 = "184.80";
        String actual5 = getTextFromElement(By.xpath("driver.findElement(By.xpath(\"//span[normalize-space()='$184.80']\"))"));
        Assert.assertEquals(actual5,expected5);

    }
}
