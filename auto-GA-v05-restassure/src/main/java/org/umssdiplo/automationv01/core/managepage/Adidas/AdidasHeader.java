package org.umssdiplo.automationv01.core.managepage.Adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;


public class AdidasHeader extends BasePage {

    @FindBy(css = "a.label[manual_cm_sp='header-_-HOMBRE']")
    private WebElement hombreLink;

    @FindBy(xpath = "//div[@class='col-5']/ul/li/a[@href='/calzado_de_futbol-hombre']")
    private WebElement calzadoFutbolBtn;

    @FindBy(css = ".gl-price__value--sale")
    private WebElement fieldPrice;

    @FindBy(css = ".gl-dropdown--no-max-height button[title='Elige tu talla']")
    private WebElement sizeBtn;

    @FindBy(xpath = "//li[@title='MX 9.5']/*[@value='BB9398_680']")
    private WebElement size95;

    @FindBy(css = "button[aria-label='Añadir al carrito']")
    private WebElement carritoBtn;

    @FindBy(xpath = "//*[@class='gl-body--s']/span[3]")
    private WebElement cantidadCarrito;

    @FindBy(css = "a.gl-cta:nth-child(7)")
    private WebElement verCarritoBtn;

    @FindBy(xpath = "//a[@class='name']")
    private WebElement titleField;

    @FindBy(xpath = "//*[@class='ffSelectButton']")
    private WebElement catidadPedido;

    @FindBy(xpath = "//*[@class='ffSelectMenuMid']/ul/li/span[@data-val='1']")
    private WebElement catidadPedidoSelected;

    @FindBy(xpath = "//div[@data-ci-test-id='orderTotalProductsDeliveryValue']")
    private WebElement precioFinal;

    @FindBy(xpath = "//div[@data-ci-test-id='orderTotalCartValue']")
    private WebElement precioTotal;

    public void obtenerPrecioProducto() {
        CommonEvents.overMouse(hombreLink,webDriver);
        CommonEvents.clickButton(calzadoFutbolBtn);
    }


    public String getPriceShoe() {
        return CommonEvents.getTextContent(fieldPrice);
    }

    public void selectSize() {
        CommonEvents.clickButton(fieldPrice);
        CommonEvents.clickButton(sizeBtn);
        CommonEvents.clickButton(size95);
    }

    public void clickCarritoBtn() {
        CommonEvents.clickButton(carritoBtn);
    }

    public String verifyQuantity() {
        return CommonEvents.getTextContent(cantidadCarrito);
    }

    public void clickVerCarrito() {
        CommonEvents.clickButton(verCarritoBtn);
    }

    public String getTitle() {
        return CommonEvents.getTextContent(titleField);
    }

    public String getCantidad() {
        CommonEvents.clickButton(catidadPedido);
        CommonEvents.clickButton(catidadPedidoSelected);
       return CommonEvents.getTextContent(catidadPedidoSelected);
    }

    public String getPriceFinal() {
    return CommonEvents.getTextContent(precioFinal);
    }

    public String getTotalPrice() {
        return CommonEvents.getTextContent(precioTotal);
    }
}
