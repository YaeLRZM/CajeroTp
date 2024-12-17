# Proyecto de sistema de cajero



##Introducción

Este proyecto ha sido desarrollado como parte de los requisitos para la materia de Tópicos Avanzados de Programación. Su objetivo principal es implementar un sistema de cajero automático funcional que permita a los usuarios realizar diversas operaciones financieras de manera eficiente y segura. En este sistema, los usuarios estarán identificados mediante un número único de tarjeta y una clave personal, lo que garantiza la autenticidad y privacidad de sus transacciones.
El cajero automático ofrece funcionalidades clave, como la consulta y modificación del saldo de las cuentas mediante operaciones comunes, incluyendo retiros, depósitos y pagos de servicios. Este proyecto no solo busca simular la funcionalidad de un cajero automático real, sino también brindar una experiencia intuitiva y confiable al usuario.
Para el desarrollo del sistema, se utilizó NetBeans como entorno de programación y MySQL Workbench como herramienta para la gestión de la base de datos, asegurando una estructura robusta y escalable para el manejo de la información. Estas herramientas permiten una integración eficiente entre la lógica del programa y el almacenamiento de datos, optimizando el desempeño general del sistema.


#Objetivos

##Objetivo General
 	Desarrollar un sistema de cajero automático funcional y seguro que permita a los usuarios realizar operaciones financieras como retiros, depósitos y pagos de servicios, utilizando un entorno programado en NetBeans y una base de datos gestionada con MySQL Workbench.
Objetivos específicos
1.	Implementar un sistema de autenticación que identifique a los usuarios mediante un número único de tarjeta y una clave personal para garantizar la seguridad y privacidad de las transacciones.
2.	Diseñar y programar las funcionalidades principales del cajero automático, incluyendo la consulta de saldo, retiros, depósitos y pagos de servicios.
3.	Configurar una base de datos relacionales en MySQL Workbench que permita almacenar de manera eficiente los datos de usuarios, transacciones y cuentas bancarias.
4.	Integrar la base de datos con la aplicación desarrollada en NetBeans para asegurar la correcta interacción entre la lógica del programa y el almacenamiento de datos.
5.	Garantizar una experiencia de usuario intuitiva mediante el diseño de una interfaz gráfica amigable y funcional.
6.	Validar y probar el sistema para asegurar su correcto funcionamiento y robustez frente a posibles errores o usos indebidos.



##Validaciones de campos requeridos: 
Para nuestro sistema que simula ser un cajero es necesario contar con validaciones desde un inicio tenemos lo que es el login que es la interfaz principal en donde nuestro usuario ingresa su numero de tarjeta y clave para poder acceder.

![image](https://github.com/user-attachments/assets/edf8f56b-1819-4891-9881-345e59d4160b)


En esta interfaz contamos con las validaciones para los números de tarjetas solo acepta un total de 16 dígitos y solo números. Lo mismo con la clave solo acepta un total de 4 dígitos y solo números. Para poder acceder es necesario tener ambos campos rellenados.  

![image](https://github.com/user-attachments/assets/c987eda4-ca4d-4e93-840e-46e187521505)


Contamos con otras interfaces en donde es necesario igual contar con validaciones en esta tenemos la parte de depósitos, retiros, pagos de servicios y movimientos. 


![image](https://github.com/user-attachments/assets/5403822b-37d2-4f98-92c0-2fe5b42f5c71)

Las validaciones en esta son para los campos de cantidad, correo, descripción y numero de cuenta en donde ocupamos ciertas validaciones como los son que solo acepte números para cantidad y no acepte números para correo, descripción. 
Tanto depósito, pago de servicio y retiro cuentas con las mismas validaciones.

![image](https://github.com/user-attachments/assets/3d37c8d9-155e-44bb-9c9f-a8a7b260a78d)

![image](https://github.com/user-attachments/assets/6c84d887-7258-496c-91c3-7efdd58d5064)


##Gestión de usuarios y productos (CRUD): 
Para la gestión de usuarios contamos con una interfaza en donde podemos añadir mas usuarios a nuestra BD haciendo mas funcional y mejor el registro de nuevos usuarios. 

![image](https://github.com/user-attachments/assets/75d1b967-f1de-405f-a1e2-423ff29cbac7)

En esta interfaz podemos añadir mas usuarios, para agregar mas es necesario rellenas cada uno de los apartados para poder hacer un registro adecuado a lo igual que podemos eliminar el usuario en caso de ser necesario. 

##Conexión a base de datos y uso de MVC: 
La conexión a la base de datos se hizo utilizando MySQL Workbech en donde se diseño y relleno. 

![image](https://github.com/user-attachments/assets/2738a192-b151-4e88-a955-f88328a38516)

![image](https://github.com/user-attachments/assets/637ef4d9-9d96-4256-b76c-a4eb966abc8e)
![image](https://github.com/user-attachments/assets/5c744ddb-f913-4648-97d8-ae78019ca267)
![image](https://github.com/user-attachments/assets/fcec4201-a4a4-4205-aae1-813368b3fca4)

La conexión a la base de datos fue a través de la clase clsBD_Conexion para esta es necesaria contar con el URL que nos proporciona workbench, el usuario y la contraseña de nuestro usuario. Por defecto el usuario es root y la contraseña la ponemos nosotros. 

![image](https://github.com/user-attachments/assets/c73213a5-7596-4f9c-9af8-3d433885fc8f)

En esta clase contamos con lo que es un método para realizar la conexión, desconectar la conexión y un método get para obtener la conexión. 


Tenemos la clase main en donde se comprueba si la conexión a nuestra base de datos fue exitosa o hubo algún error. 

![image](https://github.com/user-attachments/assets/df59d3bc-343d-4fc9-a83d-b2d1d215983b)

##Uso del componente:
En este proyecto es necesario realizar comprobantes cuando se gestiona un depósito, retiro o pago de servicio para lo cual utilizamos como componente para nuestro proyecto un botón para realizar PDF que se presento por nuestro equipo en la clase. 
Presentación del método del componente que usamos: 

![image](https://github.com/user-attachments/assets/fd04b299-1ba4-44c5-8c03-48c2f3e4a6db)
![image](https://github.com/user-attachments/assets/070e2342-a147-49cf-93ad-e0e3f0fed289)
Explicación del código adaptado para el PDF: 

El método tiene como objetivo permitir la creación de comprobantes de depósito personalizados en formato PDF con un diseño optimizado para impresión en tamaño de ticket (80mm x 200mm). Este método incluye validación de campos, incorporación de imágenes, formato de texto y apertura automática del archivo generado.

##Adición de Contenido al PDF:
•	Imagen: Se carga y añade un logo ajustado al ancho del ticket.
•	Texto: Se agrega contenido estructurado utilizando diferentes fuentes:
o	Un título en negritas y centrado.
o	Detalles como la cantidad, correo y descripción.
o	Un mensaje de agradecimiento.
o	Fecha y hora actuales.
Generación y Apertura del PDF:
•	Una vez generado, se muestra un mensaje de éxito con la ruta del archivo.
•	Si el sistema lo soporta, el archivo se abre automáticamente.
Manejo de Errores:
•	Se capturan y manejan posibles errores relacionados con el manejo del archivo o la creación del documento, mostrando mensajes específicos al usuario.
Cierre del Documento:
•	El documento se cierra correctamente en el bloque finally para evitar inconsistencias.



Validación de Campos Vacíos:
•	Antes de generar el PDF, el sistema verifica que los campos txtCantidad, txtCorreo y txtDescripcion no estén vacíos.
•	Si alguno de los campos está vacío, se muestra un mensaje al usuario solicitando que complete la información.
Configuración del Documento PDF:
•	Se crea un documento con dimensiones específicas (80mm x 200mm) convertidas a puntos.
•	Se define la ruta de salida del archivo como ticket_deposito.pdf.
Adición de Contenido al PDF:
•	Imagen: Se carga y añade un logo ajustado al ancho del ticket.
•	Texto: Se agrega contenido estructurado utilizando diferentes fuentes:
o	Un título en negritas y centrado.
o	Detalles como la cantidad, correo y descripción.
o	Un mensaje de agradecimiento.
o	Fecha y hora actuales.
Generación y Apertura del PDF:
•	Una vez generado, se muestra un mensaje de éxito con la ruta del archivo.
•	Si el sistema lo soporta, el archivo se abre automáticamente.
Manejo de Errores:
•	Se capturan y manejan posibles errores relacionados con el manejo del archivo o la creación del documento, mostrando mensajes específicos al usuario.
Cierre del Documento:
•	El documento se cierra correctamente en el bloque finally para evitar inconsistencias.

##ADMINISTRADOR 
![image](https://github.com/user-attachments/assets/5096ef87-4fd7-452c-9e88-8f197a0019a7)
![image](https://github.com/user-attachments/assets/b3cafb3f-6846-4610-84d0-0af439f53098)
![image](https://github.com/user-attachments/assets/1d71fea8-ae7b-4e1e-96dc-969513493ef0)



##Envió del PDF adjunto: 
![image](https://github.com/user-attachments/assets/835c6eed-bd20-411c-83f9-122892ffa0d1)
![image](https://github.com/user-attachments/assets/850d13b8-8f65-4513-8362-2b982359db68)
![image](https://github.com/user-attachments/assets/0e72def9-e71f-41b4-8549-57304057de74)



##ENVIO DE CORREO
![image](https://github.com/user-attachments/assets/8f12fcc2-2174-45ea-b12d-24f42b960d8e)
![image](https://github.com/user-attachments/assets/16a51b47-43af-42e2-abab-4aa52ecc1ce8)
![image](https://github.com/user-attachments/assets/0a952a4c-799a-4b23-9cd7-b4cb96695554)



Conclusión
Este proyecto ha logrado implementar un sistema de cajero automático funcional que cumple con los objetivos establecidos, proporcionando a los usuarios una plataforma eficiente y segura para realizar operaciones financieras. Gracias a la integración de NetBeans y MySQL Workbench, se ha creado una solución robusta que no solo simula las operaciones básicas de un cajero automático real, sino que también garantiza la privacidad y seguridad de las transacciones a través del uso de un número único de tarjeta y clave personal.
 El sistema ha sido diseñado para ser intuitivo, ofreciendo una experiencia confiable que satisface las necesidades de los usuarios al gestionar sus cuentas de manera efectiva. En resumen, este proyecto no solo demuestra la capacidad de aplicar conceptos avanzados de programación, sino también la importancia de combinar herramientas adecuadas para lograr soluciones tecnológicas eficientes y escalables.





##Enlace del video explicativo al sistema: 
https://drive.google.com/file/d/17djw_nlB1Of5niOQZo3B8wSaA3NqJvMu/view?usp=sharing 

##Referencias
iText Software. (n.d.). iText 7: PDF library for Java and .NET. iText Software. https://itextpdf.com 
The Java™ Mail API. (2020). JavaMail API 1.6.2 documentation. Oracle. https://javaee.github.io/javamail/ 
Oracle Corporation. (n.d.). NetBeans IDE. Oracle. https://netbeans.apache.org/ 
Oracle Corporation. (n.d.). MySQL Workbench. Oracle. https://www.mysql.com/products/workbench/ 

