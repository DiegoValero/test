Feature: Verificar el título de la página de inicio de Google

 Scenario: Verificar titulo de la pagina
    Given que estoy en la pagina de inicio
    Then el titulo de la pagina deberia ser "uTest"

 Scenario: Verificar entrar a become tester
    Given que estoy en la pagina de inicio
    Then el titulo de la pagina deberia ser "uTest"
    When hago click en el become tester
    Then el step 1 debe ser visible
    And el subTitle debe ser "Tell us about yourself"

