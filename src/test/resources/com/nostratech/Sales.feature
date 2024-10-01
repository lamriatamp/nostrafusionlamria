Feature: Sales operations

   Scenario Outline: Create a Customer
    Given I already on sales page with the email "<email>" and password "<password>"
    When I click the master menu button
    And I click Customer
    And I click new Customer
    And I set Customer Code "<customerCode>"
    And I set Customer Name "<customerName>"
    And I see Region Indonesia
    And I click Number Phone
    And I set Number Phone "<numberphone>"
    And I set Notes "<notes>"
    And I click Continue
    And I set First Name "<firstname>"
    And I set Last Name "<lastname>"
    And I set Email "<emails>"
    And I click Continues
    And I click Billing Address 
    And I set Address "<address>"
    And I set City "<city>"
    And I set State "<state>"
    And I set Country "<country>"
    And I set Zip Code "<zipcode>"
    And I click as Primary Address
    And I click Submits 
    And I click Finally Submit
    Then I should see "Created successfully"
    
    Examples:
      | email                  | password       | customerCode    | customerName | numberphone   | notes     | firstname | lastname | emails               | address         | city    | state                | country     | zipcode |
      | cold15@warunkpedia.com | Admin19951996! | C-2024/7/21-793 | Michelle      | 08871284523   | Customer1 | Laura     | Michelle | Customer1@gmail.com  | Belawan Bahari  | Medan   |  Medan Kota Belawan  | Indonesia   | 54321   |
     
    Scenario Outline: Fail to Create a Customer with Duplicate Code
    Given I already on sales page with the email "<email>" and password "<password>"
    When I click the master menu button
    And I click Customer
    And I click new Customer
    And I set Customer Code "<customerCode>"
    And I set Customer Name "<customerName>"
    And I see Region Indonesia
    And I click Number Phone
    And I set Number Phone "<numberphone>"
    And I set Notes "<notes>"
    And I click Continue
    And I set First Name "<firstname>"
    And I set Last Name "<lastname>"
    And I set Email "<emails>"
    And I click Continues
    And I click Billing Address 
    And I set Address "<address>"
    And I set City "<city>"
    And I set State "<state>"
    And I set Country "<country>"
    And I set Zip Code "<zipcode>"
    And I click as Primary Address
    And I click Submits 
    And I click Finally Submit
    Then I should see error message "Code has been used"

		Examples:
  	 | email                  | password        | customerCode    | customerName  | numberphone  | notes          | firstname  | lastname      | emails        | address           | city      | state          | country   | zipcode |
   | cold15@warunkpedia.com | Admin19951996!  | C-2024/7/21-793 | Rindu Shenina | 089878567453 | Customer gagal | Rindu      | Tampubolon    | test@user.com | Jalan Perhubungan | Pelabuhan | Tanjung Priok  | Indonesia | 12345 |



  Scenario Outline: Edit Customer Name
    Given I already on sales page with the email "<email>" and password "<password>"
    When I click the master menu button
    And I click Customer
    And I click name to edit "<EditName>"
    And I click edit button customer
    And I click nama to edit "<namaBaru>"
    And I click Submits
    Then I should see success edit "Edited successfully"

    Examples: 
      | email                  | password       | EditName     | namaBaru  |
      | cold15@warunkpedia.com | Admin19951996! | Michelle     | Magdalena |

  Scenario Outline: Delete Customer with Name
    Given I already on sales page with the email "<email>" and password "<password>"
    When I click the master menu button
    And I click Customer
    And I click search button to see delete name "<Deletename>"
    And I click titik tiga button
    And I klik delete button
    And I confirm delete
    Then I should see success delete "Deleted successfully"

    Examples: 
      | email                  | password       | Deletename |
      | cold15@warunkpedia.com | Admin19951996! | Magdalena  |

   
 

