#Auto generated Octane revision tag
@TID49001REV0.1.0
Feature: Completing contact form

    Scenario: Many users fill out the Contact Us form
    Given a customer fills in the Contct Us form
    When they click the submit button
    Then they get the thank you message
