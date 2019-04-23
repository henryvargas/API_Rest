# Login feature review the behavior in thie feature
Feature: Adiddas

  Scenario: Verificar que de pueda verificar una compra
    Given 'Addidas' page is loaded
    And Ir al subMenu de Futbol de la columna Tennis
    And get price for 'Calzado de Fútbol X' on 'futbol' catalog
    And select size "MX 9.5" on 'Calzado' page
    And click 'añadir al carrito' button
    And Verify that VIEW SHOOPING BAG is ONE "Cantidad: 1"
    And click 'ver carrito' link on VIEW SHOOPING BAG
    And Verify "Calzado de Fútbol X 18.3 TF" title is displayed on 'tu carrito' page
    And Quantity should be "1" on 'tu carrito' page
    Then Price should be "$1,329.00"
    And Total should be "$1,428.00"




