Feature: User should be able to send message.

  @done
  Scenario: Send Message
    Given User on the Next Base CRM Dashboard page
    When User should be able to click MESSAGE tab
    When User should be able to cancel message by clicking cancel button
    When User send message by clicking MESSAGE tab
    And User should be able to attach link by clicking on the link icon
    And User should be able to click cancel button
    Then User should see their message on tap of the page
