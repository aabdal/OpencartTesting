package org.automation.pages;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shantonu on 12/28/16.
 */
public class Menu extends PageBase {

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=17']")
    @CacheLookup
    private WebElement software;

    public Menu(WebDriver aDriver) {
        super(aDriver);
    }
}