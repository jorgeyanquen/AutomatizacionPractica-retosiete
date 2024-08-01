@Regresion
  Feature: The HeroKuapp page needs to be automated to validate the behavior of the buttons
    #Se requiere automatizar la pagina HeroKuapp para validar el comportamiento de los botones

  @CasoExitoso
  Scenario: HeroKuapp page automation
    Given the user enters the HeroKuapp page
    When he selects the javascript_alerts link
    And interacts with the controls on this screen
    Then Learn how to handle JavaScript type alerts

