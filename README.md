# Guida de ejercicios de Java

<!-- TOC depthFrom:2 -->

- [1. Arreglos](#1-arreglos)
    - [1.1 - Orden inverso](#11-orden-inverso)
    - [1.2 - Buscar mayores](#12-buscar-mayores)
    - [1.3 - Gráfico de temperaturas](#13-gráfico-de-temperaturas)
    - [1.4 - Busqueda de nombres](#14-busqueda-de-nombres)
    - [1.5 - Contar letras](#15-contar-letras)
    - [1.6 - Matriz 3x3](#16-matriz-3x3)
    - [1.7 - Matriz 10x10](#17-matriz-10x10)

- [2. Clases](#2-clases)
    - [2.1 - Administradores y vendedores](#21-administradores-y-vendedores)

- [3. Colecciones](#3-colecciones)
    - [3.1 - Ticket](#31---ticket).
    - [3.2 - Empresas y empleados](#32---empresa-empleado).
    - [3.3 - Alumnos y asignaturas](#33---alumno-asignatura).
    - [3.4 - Cuenta bancaria](./04_cuenta_bancaria/).
    - [3.5 - Personas](./05_personas/).
    - [3.6 - Contactos de Whatsapp](./06_whatsapp/).
    - [3.7 - Alarma](./07_alarma/).
    - [3.8 - Empresas y empleados (con herencia)](./08_empresa_empleado/).
    - [3.10 - Averías](./09_averias/).
    - [3.11 - Alumnos y asignaturas 2.0](./10_alumno_asignatura/).
<!-- /TOC -->

## 1. Arreglos

### 1.1 - Orden inverso

Leer 10 datos numéricos y mostrarlos en orden inverso

### 1.2 - Buscar mayores

Leer un entero y luego una lista de 20 enteros. Guardar los mayores al número inicial y mostrarlos al final  

### 1.3 - Gráfico de temperaturas

Pide al usuario las temperaturas de un día (un valor cada hora durante 24 horas) y almacénalas en un array. 

Usando los datos contenidos en el array, calcula la temperatura media, la máxima y la mínima. 

Visualiza la información en forma de gráfico de barras. Por ejemplo:

```
 0  ***************  15.0
 1  ***************  15.2
 2  ***************  15.1
 3  ***************  15.2
 4  ***************  15.1
 5  ***************  15.1
 6  **************  14.9  --> MIN
 7  ****************  16.1
 8  ****************  16.5
 9  *****************  17.2
10  *******************  19.5
11  ********************  20.0
12  **********************  22.1
13  ***********************  23.3
14  *************************  25.2
15  **************************  26.3  --> MAX
16  *************************  25.9
17  *************************  25.8
18  ************************  24.2
19  ************************  24.1
20  ********************  20.7
21  *******************  19.6
22  *****************  17.3
23  ****************  16.5
Media: 19.4
```

### 1.4 Busqueda de nombres

Pide al usuario los nombres y apellidos de todos tus compañeros de clase y almacénalos en un array.

Después pídele usuario una letra y muestra aquellos alumnos cuyo nombre empiece por dicha letra.

> Nota: El programa termina cuando se escriba `FIN` como búsqueda.

### 1.5 - Contar letras

Realizar un programa que cuente el número de veces que aparece cada una de las letras del [alfabeto](https://es.wikipedia.org/wiki/Ortograf%C3%ADa_del_espa%C3%B1ol) en un texto introducido por el usuario.

El recuento se hará mediante la función `contarLetras()` y se almacenará el total de cada letra en la posición correspondiente de un array. 

Después se mostrará el resultado en pantalla mediante la función `visualizarRecuento()`.

> Nota: Recordad que para acceder a los caracteres individuales de un `String` disponemos del método `.charAt()`.

### 1.6 - Matriz 3x3

Crea una matriz de 3x3 elementos pidiendo los valores al usuario. Después, muestra el contenido de la matriz por pantalla.

Para facilitar la visualización es recomendable usar la función [`System.out.format()`](https://docs.oracle.com/javase/tutorial/java/data/numberformat.html)

### 1.7 - Matriz 10x10

Rellena una matriz de 10x10 con valores aleatorios y muéstrala en pantalla.

Como recordatorio, para generar números aleatorios entre 0 y 100 podemos usar:

```java
Random r = new Random();
int aleatorio = r.nextInt(100);
```
## 2. Clases

### 2.1 - Administradores y vendedores

![Diagrama](src/main/resources/2.1_administrativo_vendedor.png)

De acuerdo al diagrama de clases resolver:

Cargar una lista de empleados (máximo 20) preguntado en cada uno si son administrativos o vendedores y cargar todos los datos respectivos.

Luego listar los empleados indicando: dni, nombre, apellido y sueldo.
El sueldo debe calcularse en el método getSueldo() de la siguiente forma:
* Si es administrativo: sueldoBase \* ((hsExtra \* 1.5)+hsMes) / hsMes
* Si es vendedor: sueldoBase + (porcenComision\*totalVtas/100)

Usar un List de tipo empleado para resolver este ejercicio.

## 3. Colecciones

### 3.1 - Ticket

Diseña el diagrama de clases y escribe el programa para almacenar un ticket de supermercado, mediante las clases `Ticket` y `LineaTicket`.

El usuario introduce el nombre del producto, el precio por unidad y el número de unidades, sin límite, hasta que nos responda que ha terminado.

El programa sacará en pantalla el listado con el nombre de cada producto, las unidades vendidas y el precio total. 

Además, mostrará el total que resulte de sumar todas las líneas del ticket.

### 3.2 - Empresas y empleados

Queremos construir una aplicación que permita almacenar la información relevante sobre empresas y sus empleados, tal como aparecen en el siguiente diagrama de clases:

<img src="src/main/resources/3.2_empresa_empleado.png" width="500" />

El programa mostrará un menú como el siguiente:

1. Crear nueva empresa.
2. Añadir empleado a empresa ya existente.
3. Listado de empresas.
4. Listado detallado de empresas y empleados.
5. Salir

El programa principal pedirá al usuario todos los datos necesarios y creará los objetos que hagan falta.

> NOTA: No hay límite en el número de empresas ni de empleados.

### 3.3 - Alumnos y asignaturas

Queremos construir una aplicación que permita almacenar la información relevante sobre alumnos y las asignaturas en las que están matriculados, tal como aparecen en el siguiente diagrama de clases:

<img src="src/main/resources/3.3_alumno_asignatura.png" width="500" />

El programa mostrará un menú como el siguiente:

1. Crear nuevo alumno.
2. Crear nueva asignatura.
3. Matricular alumno en asignatura.
4. Listado de alumnos matriculados en una asignatura.
5. Listado de asignaturas en las que está matriculado un alumno y total de horas.
6. Salir

El programa principal pedirá al usuario todos los datos necesarios y creará los objetos necesarios.

> NOTA: No hay límite en el número de alumnos y asignaturas que podemos almacenar.

