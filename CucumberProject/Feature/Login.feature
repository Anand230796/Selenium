Feature: Buying dresses

  Scenario: Adding the dresses to the cart
    Given user launch the browser and automationpractice application
    When user clicks the dresses button
    Then user select the evening dresses
    Then user select the quantity
    Then user select the size
    Then user select the colour
    And user clicks add to cart
    Then user clicks proceed to checkout

  Scenario: Updating all information
    When user clicks proceed to checkout again
    And user enter the email id
    Then user clicks create account button
    Then user enters all the personal details
    Then clicks register button
    Then user clicks proceed again button

  Scenario: Payment information
    When user clicks agree to terms and conditions
    Then user clicks proceed again button
    Then user clicks pay by wire
    Then user clicks confirms my order
    Then user click sign out button
