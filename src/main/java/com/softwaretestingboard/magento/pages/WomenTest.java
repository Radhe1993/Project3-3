package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WomenTest extends Utility {
   By women = By.xpath("//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']");
   By top = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
   By jacket = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
   ArrayList<String> jacketsNameListBefore = new ArrayList<>();
   By productName = By.id("sorter");
   ArrayList<String > jacketsNameListAfter = new ArrayList<>();
   By women1 = By.xpath("//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']");
   By top1 = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
   By jacket1 = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
   ArrayList<Double> beforePrice = new ArrayList<>();
   By price = By.id("sorter");
   ArrayList<Double> lowToHigh = new ArrayList<>();

  // verifyTheSortByProductNameFilter
      public void setWomen () {
         //* Mouse Hover on Women Menu
         mouseHoverToElement(women);
      }

      public void setTop () {
         //* Mouse Hover on Tops
         mouseHoverToElement(top);

      }

      public void clickOnJacket () {
         // * Click on Jackets
         clickOnElement(jacket);
      }


      public void realProductName ()
      {
         List<WebElement> jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
         System.out.println("Total product = " + jacketsElementsList.size());
         for (WebElement product : jacketsElementsList) {
            jacketsNameListBefore.add(product.getText());
         }
         System.out.println("Total product = " + jacketsNameListBefore);
      }

      public void selectProductName ()
      {
         //* Select Sort By filter “Product Name”
         selectByVisibleTextFromDropDown(productName, "Product Name");
      }

      public void setJacketsNameListAfter () {
         List<WebElement> jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
         System.out.println("Total products = " + jacketsElementsList.size());

         for (WebElement product : jacketsElementsList) {

            jacketsNameListAfter.add(product.getText());


         }
         System.out.println("After Products = " + jacketsNameListAfter);

      }

   //verifyTheSortByPriceFilter

   public void setWomen1 () {
      //* Mouse Hover on Women Menu
      mouseHoverToElement(women1);
   }

   public void setTop1 () {
      //* Mouse Hover on Tops
      mouseHoverToElement(top1);

   }

   public void clickOnJacket1 () {
      // * Click on Jackets
      clickOnElement(jacket1);
   }
   public void realPrice ()
   {
      List<WebElement> jacketPrice = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
      System.out.println("Total product = " + jacketPrice.size());
      for (WebElement price : jacketPrice) {
         beforePrice.add(Double.valueOf(price.getText().replace("$", "")));
      }
      System.out.println("Total product price = " + beforePrice);
   }
   public void selectProductPrice ()
   {
      //* Select Sort By filter “Product Name”
      selectByVisibleTextFromDropDown(price, "Price");
   }
   public void setJacketsPriceListAfter () {
      List<WebElement> afterJacketsPrice = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
      System.out.println("Total products = " + afterJacketsPrice.size());

      for (WebElement price : afterJacketsPrice) {

        lowToHigh.add(Double.valueOf(price.getText().replace("$", "")));


      }
      System.out.println("After Products price = " + lowToHigh);

   }




}


