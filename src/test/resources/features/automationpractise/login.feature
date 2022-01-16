Feature: Login To AutomationPractice


  Scenario Outline: Login with valid credentials
    Given Enter the application url
    When User enter user name as "<username>"
    And User enter password as "<password>"
    Then click on sigin in button
    Then user should be able to login successfully

    Examples:
      | username                    | password        |
      | Automationjan2022@gmail.com | Welcomejan@2022 |