title: 'Documentación del Proyecto CamelCase'
disqus: hackmd
---

Proyecto CamelCase
===

Este proyecto consiste en una función Java que convierte cadenas de texto con separadores (guiones o guiones bajos) a formato camelCase. Además, incluye pruebas JUnit para verificar la correcta funcionalidad de la función.

## Tabla de Contenido

[TOC]

## Guía para Principiantes

Si eres nuevo en esto, ¡empieza aquí!

1.  Abre tu IDE IntelliJ.
2.  Crea un nuevo proyecto Java o abre uno existente.
3.  Crea las clases `Solution.java`, `Main.java` y `TestSolucion.java` con el código proporcionado.
4.  Añade la dependencia JUnit si es necesario (File -> Project Structure -> Modules -> Dependencies).
5.  Ejecuta la clase `Main.java` para ver ejemplos de la función `toCamelCase`.
6.  Ejecuta las pruebas en `TestSolucion.java` para verificar la funcionalidad.

Historia de Usuario
---

```gherkin=
Característica: Conversión a CamelCase
  Como Desarrollador
  Quiero convertir cadenas con separadores a camelCase
  Porque necesito estandarizar el formato de las cadenas en mi aplicación.

  Escenario: Conversión de cadena con guiones bajos
    Dado una cadena "the_Stealth_Warrior"
    Cuando se llama a la función toCamelCase
    Entonces la salida debe ser "theStealthWarrior"

  Escenario: Conversión de cadena con guiones
    Dado una cadena "the-Stealth-Warrior"
    Cuando se llama a la función toCamelCase
    Entonces la salida debe ser "theStealthWarrior"

  Escenario: Conversión de cadena con guiones y guiones bajos combinados
    Dado una cadena "The_Stealth-Warrior"
    Cuando se llama a la función toCamelCase
    Entonces la salida debe ser "TheStealthWarrior"

  Escenario: Conversión de cadena vacía
    Dado una cadena ""
    Cuando se llama a la función toCamelCase
    Entonces la salida debe ser ""
Estoy arreglando esta nueva linea para poder probar los comandos.
  Escenario: Conversión de cadena nula
    Dado una cadena nula
    Cuando se llama a la función toCamelCase
    Entonces la salida debe ser nula
