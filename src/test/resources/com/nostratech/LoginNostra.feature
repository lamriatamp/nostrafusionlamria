Feature: Login Feature

    Scenario: Failed Login with Wrong Email and Correct Password
    Given I use web "chrome"
    When I navigate to login page Nostratech
    And I login with the wrong email "<email>" and correct password "<password>"
    And I click sign in button
    Then I see error message 
    
    Examples:
    | email                      | password            |
    | cold15@warunkpedia.co.id   | Admin19951996!      |
    
    Scenario: Failed Login with Correct Email and Wrong Password
    Given I use web "chrome"
    When I navigate to login page Nostratech
    And I login with the wrong email "<email>" and correct password "<password>"
    And I click sign in button
    Then I see error message 
    
    Examples:
    | email                     | password         |
    | cold15@warunkpedia.com    | Admin19951996??    |

  Scenario: Successful Login
    Given I use web "chrome"
    When I navigate to login page Nostratech
    And I login with the email "<email>" and password "<password>"
    And I click sign in button
    Then I navigate to dashboard page nostra fusion

  Examples:
    | email                   | password         |
    | cold15@warunkpedia.com  | Admin19951996!   |
   
    
    
    
  