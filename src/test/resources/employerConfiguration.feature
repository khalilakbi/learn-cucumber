Feature: add configuration field

  Scenario: add custom fields
    Given user login to application
    When click on PIM link
    And user click on configuration drop down
    And user select custom fields
    And user click on add button
    And user enter field name "gender"
    And user select screen "personal details"
    And user select type "text or number"
    And user click on save
    Then field will be added to the list

