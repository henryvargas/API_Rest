package org.umssdiplo.automationv01.core.managepage.Adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class AdidasHeader extends BasePage {

    @FindBy(css = "a.label[manual_cm_sp='header-_-HOMBRE']")
    private WebElement hombreLink;

    @FindBy(css = "div.glass-navigation-flyout___1AJqi:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")
    private WebElement passwordInputField;



    public void obtenerPrecioProducto() {

        CommonEvents.overMouse(hombreLink,webDriver);
    }


}
