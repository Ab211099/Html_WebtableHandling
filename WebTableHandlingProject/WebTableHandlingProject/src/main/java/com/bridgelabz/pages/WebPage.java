package com.bridgelabz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
public class WebPage {
    WebDriver driver;
    @FindBy(xpath = "//table/tbody/tr[3]/td[3]")
    WebElement columnDataThree;

    @FindBy(xpath = "//table/tbody/tr")
    WebElement noOfRows;
    public WebPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void handlePage(){
        String dataThirdColumn = columnDataThree.getText();
        System.out.println("Third Row and Third Column Data : "+dataThirdColumn);

        ArrayList<WebElement> trSize = (ArrayList<WebElement>) driver.findElements(By.xpath("//table/tbody/tr"));
        int totalRows = trSize.size();
        System.out.println("Total Number of Rows :"+totalRows);
        System.out.println("1St index data : "+ trSize.get(1).getText());
        for (int i=1; i<=totalRows;i++){
            System.out.println("Table Data : "+trSize.get(i).getText());
        }
    }
}
