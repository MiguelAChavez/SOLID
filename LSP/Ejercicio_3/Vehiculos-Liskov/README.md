### 📄 Sistema de Gestión de Vehículos

---

## 📝 Descripción del Proyecto

En este ejercicio, se proporciona un sistema inicial para la gestión de vehículos que viola el **Principio de Sustitución de Liskov (LSP)**. El sistema incluye diferentes tipos de vehículos, como autos, bicicletas y bicicletas eléctricas, todos heredando de una clase base `Vehicle`. Sin embargo, algunas subclases no cumplen con el contrato establecido por la clase base, lo que genera comportamientos inesperados o excepciones en tiempo de ejecución.

### 🚗 Contexto del Problema

El sistema actual permite gestionar vehículos y realizar operaciones como arrancar el motor (`startEngine`) y conducir (`drive`). A continuación, se describen los problemas detectados:

1. **Bicycle**:
    - Hereda de `Vehicle`, pero no puede cumplir con el método `startEngine`, ya que las bicicletas no tienen motor. Esto resulta en una implementación que lanza una excepción cuando se invoca este método.

2. **ElectricBicycle**:
    - Aunque tiene un motor eléctrico, el sistema actual trata a las bicicletas eléctricas como si fueran vehículos regulares. Si no tienen batería, se lanza una excepción, lo que indica que el diseño no es extensible ni lógico.

3. **Jerarquía Inapropiada**:
    - No todos los tipos de vehículos comparten las mismas características, lo que lleva a un uso incorrecto de la herencia.
4. **Abstracción**
    - La superclase `Vehicle` no es abstracta, lo que significa que se puede crear instancias de ella, lo cual es ilógico, ya que no existe un vehículo generico en el mundo real. 

---

## 📦 Estructura del Código

El sistema inicial incluye las siguientes clases:

### **1. Vehicle (Clase Base)**

- Métodos:
    - `startEngine()`: Arranca el motor del vehículo.
    - `stopEngine()`: Apaga el motor del vehículo.
    - `drive()`: Realiza la acción de conducir.
    - `isEngineStarted()`: Verifica si el motor está encendido.

### **2. Car (Subclase de Vehicle)**

- **Atributos**:
    - `fuelLevel`: Nivel de combustible del auto.
- **Métodos**:
    - `refuel(int fuel)`: Permite recargar combustible.

### **3. Bicycle (Subclase de Vehicle)**

- **Atributos**:
    - `hasPedals`: Indica si la bicicleta tiene pedales.
- **Problema**:
    - Sobreescribe `startEngine()` con una implementación que lanza una excepción, ya que las bicicletas no tienen motor.

### **4. ElectricBicycle (Subclase de Vehicle)**

- **Atributos**:
    - `hasBattery`: Indica si la bicicleta eléctrica tiene batería.
- **Problema**:
    - Aunque tiene motor, lanza excepciones si la batería no está presente, lo que complica su uso como un `Vehicle`.
---

## 🎯 Objetivos del Ejercicio

1. **Identificar Problemas en el Código**:
    - Comprender cómo el diseño actual viola el Principio de Sustitución de Liskov (LSP).
    - Detectar los métodos y clases que no respetan el contrato de la clase base.

2. **Proponer una Refactorización**:
    - Crear una jerarquía de clases que respete el LSP, asegurando que todas las subclases puedan sustituir a la clase base sin generar errores.
    - Separar las responsabilidades en clases más específicas para evitar supuestos innecesarios en las subclases.
