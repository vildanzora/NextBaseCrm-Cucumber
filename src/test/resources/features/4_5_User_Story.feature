Feature: User should be able to create a poll

  @userstory4
  Scenario: User should be able to create a poll

    Given User on the Next Base CRM Dashboard page
    When User can write a poll message title with question & answer
    When User should be able to check allow multiple Choice
    When User should be able to add questions
    Then User should be able to cancel poll
    When User can select an answer and vote for a poll.
    When User can vote agin
    Then poll owner should be able to stop a poll
