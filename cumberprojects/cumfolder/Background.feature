@backgrounds
Feature: background verfication checks

  Background: students completed school education
    Given the students finished high school
    Given the students finished Higher scendary school

  Scenario: To study medicine
    Given the students applied for medical course
    When the students cleared entrance exam
    Then the students eligble for joining any medical Instutie

  Scenario: To study arts and science
    Given the students applied for arts and science course
    When the students cleared entrance exam
    Then the students eligble for joining any arts and science
