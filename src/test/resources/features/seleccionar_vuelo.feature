@Seleccionar_vuelo
Feature: Seleccionar el vuelo mas barato disponible en Viva Air
  Como usuario general del sitio Viva Air,
  Quiero seleccionar el vuelo mas barato, especificando la fecha, origen y destino del vuelo

  #@seleccion
  #Scenario Outline: Seleccion de caracteristicas del vuelo
    Scenario: Seleccion de caracteristicas del vuelo
    Given abro la pagina de viva air
    When hago una seleccion de vuelos con los parametros
    #When hago una seleccion de vuelos con los parametros <ida> , <vuelta> y <fecha>
    Then verifico que se ha seleccionado el vuelo

    #Examples:
     # | ida | vuelta | fecha |
      #| med | bog    | 322   |

