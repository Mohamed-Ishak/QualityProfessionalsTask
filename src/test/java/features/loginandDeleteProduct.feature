Feature: Login and Delete a selected product from the cart

  @loginAndDelete
  Scenario Outline: Validate that user can logged in and delete a product successfully
    When  User is clicked on login tab
    And   User is filled the form using the same credentials "<username>" and "<password>"
    And   User is clicked on login button
    Then  User is logged to the account landing page and "<username>" is displayed
    Then  Check that the category List has Items
    Then  User is selected random products
    And   User is added a random product to cart
    And   User is accepted the success alert
    And   User is clicked on Cart tab and navigated to Cart page
    And   user is observed the selected product and delete it

    Examples:

      |      username        |  password   |
      |       Mohamed_47           |  123        |