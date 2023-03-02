# language: es

@full-requirements
@AfterCapture
Característica: Running full requirements
  Escenario: Deseo ingresar al sitio con las credenciales
    Dado navego a la url de orangeHRM ${tcit.orange.url}
    Cuando ingreso el userName para logearme ${tcit.orange.username}
    Y hago ingreso del password con errores ${data}
    Y hago click en boton de login

  Escenario: Deseo ingresar al sitio con las credenciales
    Dado navego a la url de orangeHRM ${tcit.orange.url}
    Cuando ingreso el userName para logearme ${tcit.orange.username}
    E ingreso el password requerido
    Y hago click en boton de login

  @DataFile:src/test/resources/data/data.xlsx
  @SheetName:addEmployee
  Escenario: Deseo crear un nuevo usuario en PIM
    Dado ingreso al menu de PIM
    Cuando selecciono add employee
    E ingreso el nombre ${first-name}
    Y agrego el segundo nombre ${middle-name}
    E ingreso el apellido ${last-name}
    Y luego habilito el radio button
    E ingreso el username ${userName}
    Y tambien creo una contraseña con la combinacion requerida ${password}
    Y luego confirmo mi contraseña ${password}
    Y hago click en el save button

  @DataFile:src/test/resources/data/data.xlsx
  @SheetName:additionalData
  Escenario: Quiero agregar contacto de emergencia, salario y calificaciones
    Dado ingreso al menu de emergency contacts
    Cuando selecciono add contact
    E ingreso el dato del contacto ${name-contact}
    Y agrego la relacion con el empleado ${relationship}
    E ingreso el numero mobil ${mobil}
    Y guardo el contacto

  @DataFile:src/test/resources/data/data.xlsx
  @SheetName:additionalData
  Escenario: Agreagar qualifications
    Dado ingreso al menu de qualifications
    Cuando selecciono add qualifications
    E ingreso el dato para empresa ${company}
    Y el dato para cargo ${job-title}
    Y guardo las calificaciones

  @DataFile:src/test/resources/data/data.xlsx
  @SheetName:changePassword
  Escenario: Deseo actualizar la contraseña del usuario
    Dado ingreso al menu Admin
    E ingreso el userName para realizar la busqueda
    Y hago click en el boton de search
    Y selecciono el elemento de la tabla
    Y activo el change password
    E ingreso la nueva password ${new-password}
    Y luego confirmo la password ${new-password}
    Y hago click en el boton de save
