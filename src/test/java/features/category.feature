Feature: category

  @category
  Scenario Outline: on category page
    Given I am on Nopcommerece homepage
    When I click on "<button_name>"button
    Then I should be verify that I am on related "<page url>"
    And I should verify that my "<page title>"

    Examples:
      | button_name |  | page url                                 |  | page title  |
      | Apparel     |  | https://demo.nopcommerce.com/apparel     |  | Apparel     |
#      | Electronics |  | https://demo.nopcommerce.com/electronics |  | Electronics |
#      | Books       |  | https://demo.nopcommerce.com/books       |  | Books       |
