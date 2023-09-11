Feature: form

  Scenario:fill form
    Given he user enter in the page
    Then he user fill form
      | name    | lastname | age | email             | salary | department |
      | Anthony | meneses  | 25  | anthony@gmail.com | 200000 | cauca      |
    When he user fill form succesfully