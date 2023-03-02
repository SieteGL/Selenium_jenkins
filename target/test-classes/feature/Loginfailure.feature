# language: es

@login-failure
Característica: Logear usuario
  Esquema del escenario: Deseo ingresar al sitio con las credenciales
    Dado navego a la url de orangeHRM ${tcit.orange.url}
    Cuando ingreso el userName para logearme ${tcit.orange.username}
    Y hago ingreso del password con errores <data>
    Y hago click en boton de login

    Ejemplos:
      | data |
      | p    |

