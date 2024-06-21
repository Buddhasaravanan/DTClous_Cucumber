Feature: Change Orders

  Scenario: Basic functionality test for change orders
    When user navigate change order
    And user click new change order button
    And user select external co and giving a name
    And user click create and open change order
    Then Validate new CO created
    When user go to new co and select design section
    And user remove original item with keep accessory
    Then Validate item removed and keep accessory
    When user remove original item keep labor
    Then Validate keep labor
    When user add item to change order
    Then Validate add item to CO
    When user copy item to all location
    Then Validate copy item
    When user replace the item
    Then Validate replace item
    When user create proposal
    Then Validate proposal created
    When user accept the change order
    Then Validate accepted CO
    
    When the user go to project overview page
    And the user go to payment page
    And the user crete new payment request
    Then validate payment request created as per given data
    When the user share payment request via email
    Then validate payemnt shared or not
    When the user mark payment stats as paid
    Then validate payment summary section
