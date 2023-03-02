# language: es

@Add-Employee
Característica: Logear usuario
  Escenario: Deseo ingresar al sitio con las credenciales
    Dado navego a la url de orangeHRM ${tcit.orange.url}
    Cuando ingreso el userName para logearme ${tcit.orange.username}
    E ingreso el password requerido
    Y hago click en boton de login

@DataFile:src/test/resources/data/data.xlsx
@SheetName:addEmployee
@AfterCapture
  Escenario: Deseo crear un nuevo usuario en PIM
    Dado ingreso al menu de PIM
    Cuando selecciono add employee
    E ingreso el nombre ${first-name}
    Y agrego el segundo nombre ${middle-name}
    E ingreso el apellido ${last-name}
    Y luego recupero el employee ID
    Y luego habilito el radio button
    E ingreso el username ${userName}
    Y tambien creo una contraseña con la combinacion requerida ${password}
    Y luego confirmo mi contraseña ${password}
    Y hago click en el save button