Feature: User Registration
  I want to check that the user can register in our e-commerce website.

  Scenario Outline: User Registration
    Given The user in the home page
    When I enter <email>
    And I enter <firstname>,<lastname>,<email>,<password>,<address>,<city>,<state>,<zipcode>,<country>,<mobile>,<alias>
    Then The registration page displayed successfully

    Examples:
      | firstname | lastname | email | password| address | city| state|zipcode| country| mobile| alias|
      | An | MAgdy | anMagdy@gmail.com | 123456789|  50 farid street| California| state|82456| United States| 01234567891| ann|


