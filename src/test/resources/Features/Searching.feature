Feature: Feature to test Google search

  Scenario: Verify that user able to search the content
    Given Open Google
    When Search for J.P.Morgan
    And Click the first result returned by Google
    Then Verify that the J.P. Morgan logo is shown
