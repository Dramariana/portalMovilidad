Feature: Consulta de Multas

  Scenario Outline: Crear una cuenta de usuario
    Given Ingresa al portal de movilidad con un usuario existente
    When ingresa al portal
    And consulta el numero de <documento>
    Then se muestra el resultado de la consulta

    Examples:
      | documento |  |
      | 111       |  |
      | 1111      |  |