#Author: elvismieles@gmail.com

Feature: write text
  As a Wikipedia user
  I want to log in
  to search for a word

  Background:
    Given I log in the page

  @SearchText
  Scenario Outline: Copy text
    When he enters the text <text>
    Then I see the <message>

    Examples:
    |text             |message       |
    |Automatización   |Automatización|
