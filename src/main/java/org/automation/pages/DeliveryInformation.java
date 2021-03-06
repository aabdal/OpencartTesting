package org.automation.pages;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by shantonu on 3/20/17.
 */
public class DeliveryInformation extends PageBase {
    public DeliveryInformation(WebDriver aDriver) {
        super(aDriver);
    }

    public WebElement description;
    public WebElement title;
}
