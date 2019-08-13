# guia-ejercicios-java

**Ejercicio 1**

Leer 10 datos numéricos y mostrarlos en orden inverso

**Ejercicio 2**

Leer un entero y luego una lista de 20 enteros. Guardar los mayores al número inicial y mostrarlos al final  

**Ejercicio 3**

![Diagrama](./img/Ej03-DiagramaClases.png)

De acuerdo al diagrama de clases resolver:

Cargar una lista de empleados (máximo 20) preguntado en cada uno si son administrativos o vendedores y cargar todos los datos respectivos.

Luego listar los empleados indicando: dni, nombre, apellido y sueldo.
El sueldo debe calcularse en el método getSueldo() de la siguiente forma:
* Si es administrativo: sueldoBase \* ((hsExtra \* 1.5)+hsMes) / hsMes
* Si es vendedor: sueldoBase + (porcenComision\*totalVtas/100)

Usar un Array de tipo empleado para resolver este ejercicio.


**Ejercicio 4**

Resolver los ejercicios 2 y 3 utilizando ArrayList en lugar de arrays.

# Ejercicio 5 - Temperaturas del día

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
