# language: es

Característica:
Escenario: Deseo actualizar la contraseña del usuario
  Dado ingreso al menu Admin
  E ingreso el userName para realizar la busqueda
  Y hago click en el boton de search
  Y selecciono el elemento de la tabla
  Y activo el change password
  E ingreso la nueva password ${new-password}
  Y luego confirmo la password ${new-password}
  Y hago click en el boton de save