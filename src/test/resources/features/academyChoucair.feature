#Autor : Holman Gonzalez
@stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screanplay at the Choucair Academy with the automation course
    @scenario1
    Scenario: Search for automation course
      Given than brandon wants to learn automation at the academy Choucair
      | strUser     | strPassword   |
      | 1053342743  | Choucair2021* |
      When he search for the course on the choucair academy platform
      | strCourse                   |
      | Workshop de Automatización  |
      Then he finds the course called resources Recursos
      | strCourse                   |
      | Workshop de Automatización  |