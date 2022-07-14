Feature: user should be able to login to the app

  @userstory1 @smoke
  Scenario Outline: User should be able to log in
    Given User on Next Base CRM Log in page
    When User should be able to access FORGOT YOUR PASSWORD? link page
    When User should be able to log in with valid "<username>" and valid "<password>"
    When User should be able to check Remember me on this computer option
    When User should be able to click log in button
    Then User should be able to see dashboard

    Examples:
      | username                      | password |
      | helpdesk35@cybertekschool.com | UserUser |

