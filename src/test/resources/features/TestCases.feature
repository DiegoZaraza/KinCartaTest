@Execution

  Feature: Validate Find thing on amazon

    Scenario: Validate Things on page
      Given The user navigates to www.amazon.com
      And Searches for 'Alexa'
      And Navigates to the second page
      And Select the third item
      Then Validate Result
