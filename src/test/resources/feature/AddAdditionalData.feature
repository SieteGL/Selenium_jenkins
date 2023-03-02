# language: es

@Add-extraData
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

  @DataFile:src/test/resources/data/data.xlsx
  @SheetName:additionalData
  @AfterCapture
  Escenario: Quiero agregar contacto de emergencia, salario y calificaciones
    Dado ingreso al menu de emergency contacts
    Cuando selecciono add contact
    E ingreso el dato del contacto ${name-contact}
    Y agrego la relacion con el empleado ${relationship}
    E ingreso el numero mobil ${mobil}
    Y guardo el contacto

#problemas con la tabla de tipo de moneda
  #Escenario: Agregar salario del empleado
    #Dado ingreso al menu de salary
    #Cuando selecciono add salary
    #E ingreso el componentSalary ${component-salary}
    #Y selecciono el tipo de currency
    #E introduzco el amount ${amount}
    #Y guardo el salario

  Escenario: Agreagar qualifications
    Dado ingreso al menu de qualifications
    Cuando selecciono add qualifications
    E ingreso el dato para company ${company}
    Y el dato para job title ${job-title}
    Y guardo las calificaciones
