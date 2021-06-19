# Principios SOLID en java

Este repositorio contiene algunos ejemplos de los principios SOLID 
vistos en el curso de Manuel Zapata, son la traducción de los ejercicios
de C# a Java.
Por cada principio se tiene un paquete de sintomas, donde se evidencia el 
problema y un paquete de refactor con la aplicación del principio

## Principios S.O.L.I.D

### S - Single Responsability Principle (SRP)
Un módulo debería tener __una y solo una__ razón para cambiar. 
Un __módulo__ es una unidad de implementación: base de datos, interfaz de usuario, etc.

Única responsabilidad no quiere decir que haga una sola cosa o tarea, 
sino que el módulo se dedica a una responsabilidad y solo tiene una razón para cambiar.

En el ejemplo de código del curso, tenemos una clase Service que tiene
lógica de cálculo de impuestos, y además tiene lógica de conexión,
inserción y consulta en base de datos. 
Se rompe el principio porque es posible que tengamos dos o más 
posibilidades de cambio:
- que pasa si el impuesto cambia? o si el cálculo del impuesto cambia?
- que pasa si debo cambiar de sqlite a postgres? o si debe cambiar de conexión directa a usar un ORM?

### O – Open/Closed Principle (OCP)



