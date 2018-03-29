Feature: Demoqa registrations

Background: User navigate to demoqa
    Given User register in demoqa page

  @textbox
  Scenario Outline: About textbox verification
    When User enter text "<fname>" and "<lname>"
    And User enter another text "<mobile>" and "<username>"
    And User enter about "<about>" and "<email>"
    And User enter pass "<pass>" and "<againpass>"
    Then User verifies text "<fname>" and "<lname>"
    And User verifies another text "<mobile>" and "<username>"
    And User verifies about "<about>" and "<email>"
    And User verifies pass "<pass>" and "<againpass>"

    Examples: 
      | fname | lname | mobile     | username | about       | email                 | pass | againpass |
      | Prem  | sri   | 9987042504 | premsri  | im good boy | premsri2504@gmail.com | prem | prem      |

  @radio
  Scenario: About radio and checkbox verification
    When User radio and checkbox click
    Then User verifies radio and checkbox selected

  @dropdown
  Scenario: About dropdown verification
    When User select dropdown
      | Country | Date | Month | Year |
      | India   |   25 |    12 | 1993 |
		Then User click verifies is selected