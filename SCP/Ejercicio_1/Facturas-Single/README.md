# 🛠️ Refactorización: Principio de Responsabilidad Única (SRP)

---

## 📝 Descripción del Proyecto

En este ejercicio trabajamos sobre un sistema de gestión de facturas para una empresa. Actualmente, el diseño del código viola el Principio de Responsabilidad Única (SRP), lo que genera dificultades para mantener y escalar la aplicación. Tu objetivo es identificar estos problemas y refactorizar el código para que cumpla con el SRP, dividiendo las responsabilidades adecuadamente entre distintas clases.

---

### Objetivos

- Analizar el código existente y detectar las violaciones al SRP.
- Refactorizar el sistema separando las responsabilidades en diferentes clases.

---

## 🛠️👩‍💻 Problemas Identificados

El código actual presenta los siguientes problemas:

1. **Acoplamiento de responsabilidades**:  
   La clase `InvoiceManager` combina múltiples responsabilidades:
    - Gestión de las facturas.
    - Cálculo del total de las facturas.
    - Persistencia de datos (guardar facturas en un archivo).
    - Generación de reportes.

2. **Difícil mantenimiento**:
    - Cambios en una funcionalidad, como la persistencia, afectan toda la clase.
    - Agregar nuevas formas de generar reportes o de guardar datos requerirá modificaciones extensas.

3. **Problemas de pruebas**:
    - La lógica está entremezclada, dificultando las pruebas unitarias de cada funcionalidad de forma aislada.

---

## 🛠️ Funcionalidades Originales

El sistema actual permite:

1. **Gestión de Facturas**
    - Agregar facturas.

2. **Cálculo del Total**
    - Calcular el monto total de todas las facturas.

3. **Persistencia**
    - Guardar facturas en un archivo.(Simulación)

4. **Generación de Reportes**
    - Imprimir un reporte detallado de las facturas.

