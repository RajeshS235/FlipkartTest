Feature: verify flikart add to kart features

  Given: validate the add to kart module with possitive and negative inputs

  Scenario Outline: validate the add to bags with single product

    When i search "<product>" in search bar and click search
    And i click the my product
    And i added my product to add to bags
    And i used login credential "<username>" and "<password>" for add my product to add to bags module
    Then i verify my product is presented in add to bags
     
     Examples:
      | product | username                | password  |
      | iphone  | rajeshsv.1987@gmail.com | raji@5924 |
