Feature: TC to search B/W source to destination

  Scenario Outline: Search flights B/W source to destination
    Given Login url
    Then Enter "<source>" and "<destination>"
    Then Enter the Depart date as "31 Jan, 2019"
    Then Enter the number of "<adults>" and "<Chilrens>" and "<Infants>"
    Then Select the class as "<Class>"
    Then Click on Search button
    Then verify that list of flights are displayed
    Examples:
      | source   |  | destination |    | adults |  | Chilrens |  | Infants |  | Class           |
      | Hyderbad |  | Banglore    |    |      2 |  |        1 |  |       1 |  | Business        |
      #| Banglore |  | Goa         |    |      2 |  |        1 |  |       1 |  | Premium Economy |

      
      
      