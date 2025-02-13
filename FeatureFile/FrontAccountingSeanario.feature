Feature: sales Quotation Entry

  Scenario: validate cancel Quotaion button
    Given open chrome browser and go to provided site
    And user should login
    When user click on sales quotation option
    And user click on cancel quotation button
    And user click on ok on alert window
    Then validate cancel option has been clicked And move to the another page
