Feature:Email a Friend
  @emailafriend
  Scenario: Email a Friend with registration Details and Sign in Details,
    to check email can be sent sucessfully

    Given I am on registration page
    When I enter required registration details without timestamp
    And Click on log in button and fill the details
    And Click on Apple MacBook Pro inch
    And Click on email a friend button
    Then I should Be able to send Email A Friend
