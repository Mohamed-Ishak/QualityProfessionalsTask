Feature: Validate Login functionality

  @login
  Scenario Outline: Validate that user can logged in and complete the checkout
    When  User is clicked on login tab
    And   User is filled the form using the same credentials "<username>" and "<password>"
    And   User is clicked on login button
    Then  User is logged to the account landing page and "<username>" is displayed
    Then  Check that the category List has Items
    Then  User is selected random products
    And   User is added a random product to cart
    And   User is accepted the success alert
    And   User is clicked on Cart tab and navigated to Cart page
    And   User is clicked on placeOrder button
    And   User is filled all the mandatory info to complete a successful purchase "<productName>" "<creditCardNum>"
    Then  A successful purchase message is displayed

    Examples:

      |      username           |  password   |productName|creditCardNum|
      |       Mohamed_47        |  123        |  Iphone6  |85478522369  |