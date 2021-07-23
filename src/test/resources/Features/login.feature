Feature: To validate login functionality in Facebook application

  Background: 
    Given The user should be in Facebook page

  @smoke @regression
  Scenario Outline: To validate login functionality with invalid username and password
    When The user has to fill "<username>"  and "<password>"
    And The user has to  clcik the login button
    Then The user should be in invalid page

    Examples: 
      | username | password |
      | mano     |     5678 |

  @sanity @regression
  Scenario: To validate registration functionality1
    When The user has to fill firstname and lastname details
    And The user to click the sign up button
    Then The user successfully register

  @regression
  Scenario: To validate registration functionality2
    When The user has to fill firstname and lastname details
    And The user to click the sign up button
    Then The user successfully register
