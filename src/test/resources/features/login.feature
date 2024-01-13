Feature: Login portal de movilidad
@Run
  Scenario: Crear una cuenta de usuario
    Given el usuario ingresa al portal de movilidad
    And selecciona registrarse
    When visualiza el formulario de registro
    And ingresa los datos necesarios
    Then el registro es exitoso

  Scenario: Ingresar al portal de movilidad
    Given el usuario ingresa al portal de movilidad
    When ingresa los datos de un usuario existente
    Then el ingreso es exitoso