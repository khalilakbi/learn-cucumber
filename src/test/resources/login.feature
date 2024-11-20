#Feature: login
#
#  Background:
#    Given user open application
##  @smoke @regression
#  Scenario: valid login
##    Given user open application
#    When user enter valid username
#    And user enter valid password
#    And user click on login
#    Then account page should be open
#
##  @regression
#  Scenario: invalid login
##    Given user open application
#    When user enter invalid username "admin"
#    And user enter invalid password "admin"
#    And user click on login
#    Then invalid credentials msg pop up

#  @regression
#  Scenario Outline: invalid login2
#    Given user open application
#    When user enter invalid username "<username>"
#    And user enter invalid password "<password>"
#    And user click on login
#    Then invalid credentials msg pop up
#    Examples:
#      | username | password
#
#      | aksil    | rachida
#      | fazia    | nassiba
