# Loteria
Caso práctico
Tu empresa ha sido seleccionada para desarrollar un programa para
realizar apuestas ficticias, como beta para realizar una app automática de
gestión de sorteos en un futuro.
Lo primero que hacéis es reuniros para saber qué pantallas va a contener
la aplicación, qué componentes utilizarán en cada una de ellas y qué tipos de
layout serán más apropiados en cada caso. Además necesitáis saber cómo
interactuará el usuario final de la aplicación con las distintas pantallas.
Después de esa reunión habéis tomado los acuerdos oportunos para
comenzar a trabajar.
1.- Enunciado.
APARTADO A: Diseño de las diferentes pantallas que se detallan a
continuación:
• Pantalla Principal: Debe aparecer el texto "Gestor de Loterías" y cuatro
botones verticales (uno debajo de otro). Los botones son (Registro,
Loterias, Ajustes y Sorteo ).En caso de posicionar el dispositivo en
orientación horizontal quedaran en dos columnas de dos botones
• Pantalla de Registro: Debe contener tres campos para introducir el
nombre, el email y la edad. Un usuario solo se podrá registrar si tiene 18
años o mas. Además debe haber un botón para volver a la pantalla
principal.
• Pantalla de Loterías: Debe contener un botón para votar aceptar la
elección, y cuatro imágenes (logotipos de las distintas loterías del
Estado, o para hacerlo mas original, por ejemplo cuatro dibujos
animados) con sus correspondientes casillas de verificación o CheckBox
donde debe aparecer el nombre de la loteria colocadas en una tabla de
dos columnas. Como el listado de loterías puede sobrepasar el tamaño
de la pantalla del dispositivo, deberá poder desplazarse los tipos de
loteria de forma vertical para poder seleccionar cualquiera de ellas. El
botón de Aceptar Elección siempre debe estar visible. Hay que tener en
cuenta al descargar los logotipos de la lotería que debemos adaptarlas a
un tamaño uniforme (ej 100 x 140 píxels) para una mejor visualización.
• Pantalla de Ajustes: Debe contener un botón para Aceptar los ajustes
y dos pestañas (Dinero a Apostar y Combinación Manual). En la primera
pestaña se debe poder introducir de manera manual usando un combo
(Ver documentación para el control Spinner) la cantidad a apostar (1, 2,
5 o 10 €). En la pestaña de "Combinación Manual" debe haber 3 campos
organizados en 1 fila y tres columnas en el que se podrán introducir
números entre 1 y 10.
• Pantalla de Sorteo: Debe contener el nombre introducido en el
registro, la cantidad apostada, el tipo de sorteo elegido y los tres
números elegidos en Ajustes. Tambien debe mostrarse debajo el botón
"Sorteo". Además existirá otro botón "Volver".
• Pantalla Acerca de: Debe contener un texto centrado con el nombre de
la aplicación, tu nombre como autor/a de la misma, el año en el que se
desarrolla la aplicación y un botón de volver.
• Pantalla Ayuda: Debe contener un texto lo suficientemente extenso
para que deba desplazarse por la pantalla verticalmente donde se
explique el funcionamiento de la aplicación. Además tendrá un botón de
volver en la parte inferior.
APARTADO B: Funcionalidades de interacción y navegación a través de las
pantallas.
Desde la pantalla principal el usuario podrá pulsar cualquiera de los
cuatro botones (Registro, Loterias, Ajustes y Sorteo) y además el botón menú
del dispositivo que tendrá las opciones "Acerca de" y "Ayuda" que abrirán cada
una de las pantallas correspondientes.
En la pantalla "Registro" el usuario podrá completar con sus datos
personales (nombre, email y edad) y pulsar el botón "Volver" para regresar a
la pantalla principal pasando como parámetros los tres datos introducidos por
el usuario y mostrando un mensaje al usuario de duración larga como el
siguiente: "Quedas registrado". Solo podrás registrarse si la edad es igual o
mayor a 18 años. En caso contrario no se guardarán los datos y mostrará el
mensaje "Un menor no puede registrarse en esta aplicación".
En la pantalla "Loterías" el usuario podrá seleccionar el sorteo que desee
marcando la casilla de verificación correspondiente y pulsar el botón "Aceptar"
para regresar a la pantalla principal pasando como parámetro el tipo de sorteo
seleccionado. Se debe informar al usuario con mensajes de duración larga las
siguientes situaciones posibles:
• Si no ha seleccionado ningún sorteo y pulsa el botón "Aceptar" se
mostrará el mensaje "No has seleccionado ningún sorteo" y seguiremos
en la misma pantalla. Si se produce de nuevo esta situación, se mostrará
el mensaje "Sigues sin seleccionar nada. Vale ya"
• Si ha seleccionado más de un sorteo y pulsa el botón "Aceptar" se
mostrará el mensaje "La versión Lite solo admite un tipo de Sorteo.
Compra nuestra versión de Pago"
• En caso de seleccionar un solo sorteo y pulsar el botón "Aceptar" se
mostrará el mensaje "Sorteo Guardado" y volveremos a la pantalla
principal pasando el parámetro del sorteo correspondiente.
En la pantalla "Ajustes" el usuario podrá seleccionar en cada una de las
pestañas tanto la apuesta como la combinación aleatoria. Al pulsar el botón
"Guardar Ajustes" para regresar a la pantalla principal pasando como
parámetros la cantidad y los tres números correspondientes . Se debe informar
al usuario con mensajes de duración larga las siguientes situaciones posibles:
• Si no ha apostado y pulsa el botón "Guardar Ajustes" se mostrará el
mensaje "Elige tu Apuesta".
• Si no ha rellenado los tres números y pulsa el botón "Guardar Ajustes" se
mostrará un mensaje "Elige tu combinación ganadora".
En la pantalla "Sorteo" el usuario podrá ver el nombre de su registro.
También verá la apuesta realizada y los tres números elegidos. También se
informará del nombre de sorteo elegido por el usuario. Si alguno de estos
valores no se hubiese introducido todavía, se debe mostrar en su lugar un
texto como el siguiente "Campo no rellenado". Después puede pulsar el botón
"Sorteo" que abrirá una ventana de diálogo de confirmación mostrando los 3
números aleatorios generados y el premio ganado. Ganara lo apostado si se
acierta un número, el doble si se aciertan dos y el coche si se aciertan los
tres!. En caso de querer cobrar el premio se aceptará el cuadro de diálogo,
mostrando un mensaje con el premio ganado por la consola. Para generar esos
números os podéis ayudar de la clase Random. Por último también podrá
seleccionar el botón "Volver" para regresar a la pantalla principal.
Las opciones de menú sólo deben ser accesibles desde la pantalla
principal y las dos opciones que dispondremos serán las que nos llevan a cada
una de las siguientes pantallas:
• En la pantalla "Acerca de" el usuario podrá leer el nombre de la
aplicación, el autor/autora que la ha realizado y el año de su realización.
Además pulsando el botón "Volver" regresará a la actividad principal.
• En la pantalla "Ayuda" el usuario podrá leer las instrucciones de uso de
la aplicación de forma que pueda desplazarse el texto verticalmente
para su total lectura y pulsar un botón "Volver" que se encuentre en la
parte inferior de la pantalla siempre visible para regresar a la actividad
principal.
APARTADO C: Utilización de recursos alternativos en Android. Debes
configurar la aplicación para tener en cuenta los siguientes aspectos:
• Cuando el dispositivo se coloca en forma horizontal, debe cambiar el
aspecto de las siguientes pantallas como mínimo:
◦ Pantalla Principal: Colocar los cuatro botones en una tabla de 2 x 2 en
lugar de uno debajo de otro en una sola columna.
◦ Pantalla "Registro": Colocar el botón Volver a la derecha del último
cuadro de texto de forma que se pueda visualizar correctamente en
un dispositivo de tamaño 4"
◦ Pantalla "Loterias": Colocar las imágenes y sus correspondientes
CheckBox en una tabla horizontal de 3 columnas.
• Cuando el usuario configura el dispositivo al idioma inglés, deben
cambiar los textos de las siguientes pantallas como mínimo:
◦ Pantalla “Principal”: Cambiar los textos de los botones.
◦ Pantalla “Loterías”: cambiar el texto del botón.
◦ Pantalla "Ajustes" cambiar el texto del botón y de las pestañas.
◦ Pantalla "Sorteo" cambiar el texto de los botones y etiquetas.
NOTA: No es necesario añadir más recursos en el resto de pantallas, pero si
tienes tiempo puedes extenderlos al resto de pantallas de la aplicación que 
consideres.
APARTADO D: Documento explicativo donde se debe detallar los siguientes
aspectos:
• Algunas capturas de pantalla de la aplicación en funcionamiento en al
menos dos emuladores con características diferentes entre sí (entre 5 y
10 capturas).
• Dificultades encontradas así como la resolución de las mismas.
• Consideraciones que desees hacer al profesor.
2.- Criterios de Corrección y Puntuación de la Tarea
Estas son las puntuaciones de cada apartado, para que lo tengas en
cuenta al realizar la tarea:
• Apartado A: (2,5 puntos).
◦ Diseña las pantallas (ficheros XML) utilizando los layout y controles
adecuados para cada caso siguiendo las indicaciones de la tarea.
◦ Personaliza mediante temas y estilos la aplicación y los controles que
se incluyen.
• Apartado B: (5 puntos).
◦ Implementa la funcionalidad de cada pantalla (ficheros Java) teniendo
en cuenta las instrucciones indicadas en la tarea y los mensajes al
usuario que se deben mostrar en cada situación.
• Apartado C: (1,5 puntos).
◦ Incluye los recursos de orientación del dispositivo y de idioma en las
pantallas indicadas.
• Apartado D: (1 punto).
◦ Las explicaciones son breves, claras y explican paso a paso el
desarrollo de la aplicación.
◦ Se incluyen algunas capturas de pantalla con la aplicación en
funcionamiento en dos tipos de emuladores con características muy
diferentes entre sí.
◦ Se explican las dificultades encontradas y la forma de resolverlas así
como las consideraciones que se deseen hacer al profesor.
• Extra: Se permite la posibilidad de mostrar la imagen del coche cuando
gana el sorteo.
