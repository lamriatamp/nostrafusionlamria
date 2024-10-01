Feature: Sales Quotations

    
  Scenario: Create Sales Quotation
    Given I already on sales page
    When I click the transaction menu button
    And I click sales quotation
    And I click new sales quotation
    And I Klik customer in sales quotation
    And I set customer in sales quotation
    And I set Sales Quotation Date 
    And I set Sales Quotation Number "<QuotationNumber>" 
    And I set Customer PO Number "<PONumber>"
    And I set Salesperson "<Salesperson>"
    And I set Est. Delivery Date "2024-08-02"
    And I Klik item
    And I set Item
    And I klik submit
    Then I see success Notif
    
    Examples:
    | QuotationNumber   | PONumber         | Salesperson     |
    | SQ-2024/8/2-00015 | PO-KKV-ICH-001   | Nadira Handoko   | 
    

  Scenario: Update Sales Quotation
    Given I already on sales page
    When I click the transaction menu button
    And I click sales quotation
    And I click Elemen to update
    And I Klik Edit button
    And I set update Customer PO Number "<PONumber>"
    And I klik submit
    Then I see success Notif update

    	Examples:
    | PONumber     | 
    | PO-0001204   |
    
   Scenario: Success create Sales Order
   Given I already on sales page
    When I click the transaction menu button
    And I click sales quotation
    And I click Elemen to update
    And I Klik Edit button
    And I set update Customer PO Number "<PONumber>"
    And I klik submit
    Then I see success Notif update
    
    	Examples:
    | PONumber      | 
    | PO-00012077   |