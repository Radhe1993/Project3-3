package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearTest extends Utility
{

    By gear = By.xpath("//a[@id='ui-id-6']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']");
    By bag = By.xpath("//span[normalize-space()='Bags']");
    By product = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By text = By.xpath("//span[@class='base']");
    By qty = By.xpath("//input[@id='qty']");
    By addToCart = By.xpath("//button[@id='product-addtocart-button']");
    By text1 = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    By productName = By.xpath("//body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[2]/tr[1]/td[1]/div[1]/strong[1]/a[1]");
    By productQty = By.xpath("//input[@title='Qty']");
    By productPrice = By.xpath("//span[@class='cart-price']//span)[2]");
    By changeQty = By.xpath("(//input[@class='input-text qty'])[1]");
    By updateCart = By.xpath("//span[contains(text(),'Update Shopping Cart')]");
    By newPrice = By.xpath("//span[@class='cart-price']//span)[2]");

    //userShouldAddProductSuccessFullyTo ShoppingCart

    public void setGear()
    {
        //* Mouse Hover on Gear Menu
        mouseHoverToElement(gear);
    }
    public void setBag()
    {
        //* Click on Bags
        clickOnElement(bag);
    }
    public void clickOnProduct()
    {
        //* Click on Product Name ‘Overnight Duffle
        clickOnElement(product);
    }
    public void getText()
    {
        //* Verify the text ‘Overnight Duffle
        getTextFromElement(text);
    }
    public void setProductQty()
    {
        //* Change Qty 3

        remove(qty,"3");
    }
    public void clickOnAddToCart()
    {
        //* Click on ‘Add to Cart’ Button
        clickOnElement(addToCart);
    }
    public void getText1()
    {
        //* Verify the text
        getTextFromElement(text1);
    }
    public void clickOnShoppingCart()
    {
        //* Click on ‘shopping cart’ Link into
        clickOnElement(shoppingCart);
    }
    public void veirfyProductName()
    {
        //Verify the product name ‘Cronus Yoga Pant
        getTextFromElement(productName);
    }
    public void verifyProductQty()
    {
        //* Verify the Qty is ‘3’
        getTextFromElement(productQty);
    }
    public void veirfyProductPrice()
    {
        //* Verify the product price ‘$135.00’
        getTextFromElement(productPrice);
    }
    public void changeQty()
    {
        //Change Qty to ‘5’
        remove(changeQty,"5");
    }
    public void setUpdateCart()
    {
        //Click on ‘Update Shopping Cart’ button
        clickOnElement(updateCart);
    }
    public void verifyProductPrice()
    {
        //Verify the product price ‘$225.00’
        getTextFromElement(newPrice);

    }


}
