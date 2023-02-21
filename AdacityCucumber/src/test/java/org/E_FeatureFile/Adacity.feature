#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Adacity Hotel Website Validation

  #Background:
  #Given Launch the Browser
  #And Passing Url
  #@aslists
  #Scenario: Login Page Validation
  #When Entering Username and Entering Password
  #| daisyrubycatharine | RP65IQ  |
  #| praveen            | b4a6b7u |
  #And Clicking LoginButton
  #Then I validate the outcomes
  #And check more outcomes
  #xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
  #	                        =========>SCENARIO OUTLINE<=========
  @tag2
  Scenario Outline: Scenario outline Login Page Validation
    Given Launch the Browser
    And Passing Url
    When Entering Username "<username>"
    And Entering Password "<password>"
    And Clicking LoginButton
    Then I validate the outcomes
    And check more outcomes

    Examples: 
      | username           | password |
      | daisyrubycatharine | RP65IQ   |

  #| praveen            | sd90753895 |
  #| robert             | 974jndf    |
  @tag3
  Scenario Outline: Search Hotel Page Validations
    When Select the Location "<location>"
    And Select the Hotel "<hotel>"
    And Select the RoomType "<roomType>"
    And Select the NoOfRooms "<noOfRooms>"
    And Enter the CheckInDate "<checkIn>"
    And Enter the CheckOutDate "<checkOut>"
    And Select Adult per Room "<adultPerRoom>"
    And Select Child per Room "<childPerRoom>"
    Then Click the SearchButton

    Examples: 
      | location | hotel       | roomType | noOfRooms | checkIn    | checkOut   | adultPerRoom | childPerRoom |
      | Brisbane | Hotel Creek | Double   |         1 | 18/05/2023 | 27/05/2023 |            2 |            1 |

  #| Adelaide | Hotel Hervey  | Super Deluxe |         3 | 18/05/2023 | 27/05/2023 |            3 |            1 |
  #| New York | Hotel Cornice | Deluxe       |         2 | 18/05/2023 | 27/05/2023 |            1 |            1 |
  @tag4
  Scenario: Radio button Validation
    When Click the Radio button
    And Click Search button

  #@tag5
  #Scenario Outline: 
    #When enter the FirstName "<firstName>"
    #And enter the LastName "<astName>"
    #And enter the Address "<address>"
    #And enter the CreditCard Number "<creditCardNo>"
    #And Select CreditCard Type "<cardType>"
    #And Select Expiry Date "<date>"
    #And Select Expiry Year "<year>"
    #And Enter Cvv Number "<cvv>"
    #Then Click SubmitButton
#
    #Examples: 
      #| firstName | astName | address                | creditCardNo     | cardType | date | year | cvv |
      #| Hemsworth | Rok     | Sukino bavanthu Street | 6589654854123650 | AMEX     |    3 | 2015 | 192 |

  @asMap
  Scenario: 
    When enter the FirstName
      | firstName | Praveen |
    And enter the LastName
      | astName | Christopher |
    And enter the Address
      | address | Rajaji Street, Lithuania |
    And enter the CreditCard Number
      | creditCardNo | 4578487965478547 |
    And Select CreditCard Type
      | cardType | AMEX |
    And Select Expiry Date
      | date | 3 |
    And Select Expiry Year
      | year | 2016 |
    And Enter Cvv Number
      | cvv |  | 175 |
    Then Click SubmitButton
      #| Adelaide  | Hotel Hervey  | Super Deluxe |            3 | 18/05/2023 | 27/05/2023 |    3 |   1 |
      #| New York  | Hotel Cornice | Deluxe       |            2 | 18/05/2023 | 27/05/2023 |    1 |   1 |
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
