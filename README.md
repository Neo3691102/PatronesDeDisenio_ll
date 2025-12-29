# 🎨 Patrones de Diseño: Estructurales y de Comportamiento en Java

## 🌟 Resumen del Proyecto

Este repositorio documenta e implementa cuatro patrones de diseño fundamentales en Java, cubriendo soluciones esenciales para la **estructura** y el **comportamiento** de los objetos. Los ejemplos son prácticos y funcionales, enfocados en demostrar la aplicación de cada patrón para resolver problemas de diseño de software específicos, lo que resulta en un código más flexible, desacoplado y fácil de mantener.

---

## 🧱 Patrones Estructurales

Estos patrones se centran en cómo se componen y organizan las clases y los objetos para formar estructuras más grandes y flexibles.

### 1. Decorator (Decorador)

| Concepto | Implementación | Propósito |
| :--- | :--- | :--- |
| **Definición** | Permite agregar responsabilidades adicionales a un objeto de forma **dinámica**. Utiliza la composición para envolver el objeto en lugar de la herencia para extender la funcionalidad. | Evitar la explosión de subclases que resulta de intentar extender la funcionalidad base mediante herencia. |
| **Ejemplo** | **Creacion de clase triangulo y decorador para distintos tipos de triangulo** Una clase base (`TRiangulo`) es envuelta por decoradores (`nombre`, `vertices`, `formulaPerimetro` ) para añadir nuevos tipos de triangulo sin modificar el código base. |


### 2. Proxy (Apoderado)

| Concepto | Implementación | Propósito |
| :--- | :--- | :--- |
| **Definición** | Proporciona un **sustituto** o marcador de posición (`Proxy`) para otro objeto real (`Sujeto Real`) para controlar el acceso a él. | Controlar el acceso al objeto real, diferir la inicialización (**Lazy Loading**), o añadir lógica de seguridad, *logging* o validación. |
| **Ejemplo** | **Cuentas bancarias** En el ejemplo se ve la creacion de cuentas y de deposito, transferencia y consulta de saldo. |


---

## 🎭 Patrones de Comportamiento

Estos patrones se preocupan por los algoritmos y la asignación de responsabilidades entre los objetos.

### 3. Observer (Observador)

| Concepto | Implementación | Propósito |
| :--- | :--- | :--- |
| **Definición** | Define una dependencia **uno-a-muchos**: cuando el objeto principal (**Sujeto**) cambia de estado, todos sus dependientes (**Observadores**) son notificados automáticamente. | Implementar sistemas de eventos (*Publish-Subscribe*) donde los cambios en una parte del sistema deben propagarse a otras sin un acoplamiento directo. |
| **Ejemplo** | **Suscripciones con notificacion** Es un sistema que añade suscriptores y manda notificaciones |


### 4. State (Estado)

| Concepto | Implementación | Propósito |
| :--- | :--- | :--- |
| **Definición** | Permite que un objeto altere su comportamiento cuando su estado interno cambia. El objeto de contexto delega su comportamiento a una clase de estado específica. | Manejar las transiciones complejas entre estados de un objeto, eliminando grandes bloques condicionales (`if/else` o `switch`). |
| **Ejemplo** | **Reproductor de Música.** La clase `Reproductor` delega sus acciones (`play`, `pausa`, `stop`) a clases de estado (`EstadoReproduciendo`, `EstadoPausado`). El comportamiento del reproductor varía según su estado actual. |




