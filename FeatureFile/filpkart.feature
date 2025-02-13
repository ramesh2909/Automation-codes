Feature: search movies in jio cinema

  Scenario Outline: verify search in flipkart
    Given launch chrome browser and go to flipkart
    When click on search option "<mobiles>"
    Then i verify the movies has been "<verify page>"

    Examples: 
      | mobiles | verify page                                   |
      | iphone | Showing 1 – 24 of 961 results for "i phone16" |
      | s25     | Showing 1 – 24 of 280 results for "s25"       |
