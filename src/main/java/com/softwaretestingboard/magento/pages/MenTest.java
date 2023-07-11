package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenTest extends Utility
{
    By men = By.xpath("//ul[@id='ui-id-2']//span[text()='Men']");
    By bottom = By.xpath("//a[@id='ui-id-18']");
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By yogaPant = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/a[1]/span[1]/span[1]/img[1]");
    By size = By.cssSelector("#option-label-size-143-item-175");
    By blackColour = By.xpath("//div[@id='option-label-color-93-item-49']");
    By addToCart = By.xpath("//span[contains(text(),'Add to Cart')]");
    By message = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    By message1 = By.xpath("//span[@class='base']");
    By productName = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By productSize = By.xpath("//dd[contains(text(),'32')]");
    By productColour = By.xpath("//dd[contains(text(),'Black')]");


    public void setMen()
    {
        mouseHoverToElement(men);
    }
    public void setBottom()
    {
        mouseHoverToElement(bottom);
    }
    public void setPants()
    {
        clickOnElement(pants);
    }
    public void setYogaPant()
    {
        mouseHoverToElementAndClick(yogaPant);
    }
    public void setSize()
    {
        clickOnElement(size);
    }

    public void setBlackColour()
    {
        clickOnElement(blackColour);
    }

    public void clickOnAddToCart()
    {
        clickOnElement(addToCart);
    }
    public void verifyMessage()
    {
        getTextFromElement(message);
    }
    public void clickOnShoppingCart()
    {
        clickOnElement(shoppingCart);
    }
    public void verifyMessage1()
    {
        getTextFromElement(message1);
    }
    public void verifyMessage2()
    {
        getTextFromElement(productName);
    }
    public void verifyMessage3()
    {
        getTextFromElement(productSize);
    }
    public void verifyMessage4()
    {
        getTextFromElement(productColour);
    }


}
