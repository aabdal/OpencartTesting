package org.automation.pages;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shantonu on 3/20/17.
 * //todo element finders
 * /
 */
public class AboutUs extends PageBase {
    public AboutUs(WebDriver aDriver) {
        super(aDriver);
    }
//this represent About us page

    @FindBy(css ="#content > p" )
    public WebElement description;

    @FindBy(css ="h1" )
    public WebElement title;
}
