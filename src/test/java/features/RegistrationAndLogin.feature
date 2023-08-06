Feature: Registration and Login

  @register
  Scenario Outline: Validate that the user is registered then logged out successfully
      Given User is navigate to the product store website
      When  User is entered a valid "<username>" and valid "<password>"
      And   User is clicked on Signup button
      And   User is accepted the success alert


    Examples:

    |      username        |  password   |
    |      Mohamed_47     |  123        |

