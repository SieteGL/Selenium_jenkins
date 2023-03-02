# language: es

@Login
Característica: Logear usuario
  Escenario: Deseo ingresar al sitio con las credenciales
    Dado navego a la url de orangeHRM ${tcit.orange.url}
    Cuando ingreso el userName para logearme ${tcit.orange.username}
    E ingreso el password requerido
    Y hago click en boton de login





