Feature: Dashboard site

  Scenario: display dasboard page and sales menu
    Given I already login with the email "cold15@warunkpedia.com" and password "Admin19951996!"
    And I click sales menu
    Then I should see Dashboard sales

  Scenario: display dasboard page and inventory menu
    Given I already login with the email "cold15@warunkpedia.com" and password "Admin19951996!"
    And I click inventory menu
    Then I should see Dashboard inventory
