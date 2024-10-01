Feature: Inventory Operations
	
	 Scenario: Success create supplier
    Given I already on inventory page
    When I click the master menu button and click supplier
    And I click Create button
    And I set supplier code "<suppcode>" 
    And I set supplier name "<suppname>" 
    And I set region 
    And I set add phone Number "<numberphone>"
    And I click continueBtn
    And I set firstname "<firstname>" 
    And I set lastname "<lastname>" 
    And I set email "<email>"
    And I klik continue btn
    And I click add Address
    And I set Alamat "<Alamat>"
    And I set city "<city>"
    And I set state "<state>"
    And I set country "<country>"
    And I set zip code "<zipcode>"
    And I set as primary
    And I klik submit Btn
    And I klik submit Btn again
    Then I see success Notif supplier
    
    Examples:
    | suppcode | suppname              | numberphone   |firstname   | lastname      | email             | Alamat             |  city             |  state           |country    | zipcode |
    | AQA-2907 | Automation Tests 4977 | 0987860464085 |Lamria      | Tampubolon    | test1@customer.id | Jalan Perhubungan  | Kab. Deli Serdang |  Sumatera Utara  | Indonesia | 20229   |
    
		
    
  Scenario: Failed create suppliers with duplicate code
    Given I already on inventory page
    When I click the master menu button and click supplier
    And I click Create button
    And I set supplier code "<suppcode>" 
    And I set supplier name "<suppname>" 
    And I set region 
    And I set add phone Number "<numberphone>"
    And I click continueBtn
    And I set firstname "<firstname>" 
    And I set lastname "<lastname>" 
    And I set email "<email>"
    And I klik continue btn
    And I click add Address
    And I set Alamat "<Alamat>"
    And I set city "<city>"
    And I set state "<state>"
    And I set country "<country>"
    And I set zip code "<zipcode>"
    And I set as primary
    And I klik submit Btn
    And I klik submit Btn again
    Then I see invalid Notif supplier
    
    Examples:
    | suppcode      | suppname               |  numberphone   |firstname   | lastname      | email                 | Alamat             |  city             |  state           |country    | zipcode |
    | AQA-2900      | Automation Tests 4977  |  0987860464085 |Lamria      | Tampubolon    | test1@customer.id     | Jalan Perhubungan  | Kab. Deli Serdang |  Sumatera Utara  | Indonesia | 20229   |
    
    Scenario: Success update supplier
    Given I already on inventory page
    When I click the master menu button and click supplier
    And I click supp name 
    And I click Edit btn
    And I set update supp code "<suppcode>"
    And I click Submit btn edit
    Then I see success Notif supplier
    
    Examples: 
     | suppcode |
     | AQA-120403 |
    
    Scenario: Delete supplier
    
    Given I already on inventory page
    When I click the master menu button and click supplier
    And I click supp name 
    And I click Delete btn
    And I click konfirmasi delete
    Then I see success Notif delete
		
		
    Scenario: Success create Warehouse
     Given I already on inventory page
     When I click the master menu button and click warehouse
     And I klik create btn warehouse
     And I set Warehouse code "<codewarehouse>" 
     And I set Warehouse name "<namewarehouse>"
     And I set address for warehouse "<alamat>"
     And I set Rack Code "<rackcode>"
     And I click Submit button
     
       Examples: 
     | codewarehouse       |   namewarehouse        |  alamat     |  rackcode |
     | MDN-120403          |  Warehouse Medan Area  | Jalan Medan | 12        |
    
	 
	 
    Scenario: Success update Warehouse
    Given I already on inventory page
    When I click the master menu button and click warehouse
    And I click code warehouse
    And I click edit Btn warehouse
    And I set update warehouse name "<name>"
    And I click Submit button
    Then I see success notif warehouse
    
    Examples: 
     | name              | 
     | Warehouse Jateng  |
    