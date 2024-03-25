Feature:Flight from istanbul to ankara

  @case1
  Scenario: Verify main page tabs
    Given user goes to enuygun.com webpage
    When user search for a round trip departure on "25" "Temmuz 2024"  and return on "10" "Agustos 2024"  from "istanbul" to "ankara" for 1 adult
    And user clicks on search and filter departure flights between 600 and 1080
    Then user validates the result are between 1000 and 1800
  @case2
  Scenario: Verify whether the order of Turkish Airlines flight prices increasing
    Given user goes to enuygun.com webpage
    When user search for a round trip departure on "25" "Temmuz 2024"  and return on "10" "Agustos 2024"  from "istanbul" to "ankara" for 1 adult
    And user clicks on search and filter departure flights between 600 and 1080
    Then user clicks on the THY company and validate the order