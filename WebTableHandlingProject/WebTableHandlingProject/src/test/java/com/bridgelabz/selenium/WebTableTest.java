package com.bridgelabz.selenium;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.pages.WebPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTableTest extends BaseClass {
    WebPage wPage;
    @BeforeTest
    public void init(){
        setUp();
        wPage = new WebPage(driver);
    }

    @Test
    public void webTableDataExtraction_ReturnsOkStatus(){
        wPage.handlePage();
        System.out.println("Success");
    }

    @AfterTest
    public void closeDriver(){
        tearDown();
    }
}
