# 📄 Sistema de Cálculo de Impuestos y Descuentos

---


## 📝 Descripción del Proyecto

Este ejercicio forma parte de la guía sobre los principios SOLID y se enfoca en el **Principio Abierto-Cerrado (OCP)**. El objetivo es refactorizar un sistema de cálculo de impuestos y descuentos para distintos tipos de productos, asegurando que el código sea extensible sin necesidad de modificar la lógica existente cuando se agreguen nuevos tipos de productos o reglas de negocio.

Actualmente, el sistema tiene una implementación que viola el OCP, dificultando su mantenimiento y escalabilidad. A través del refactor, se busca aplicar el **patrón Estrategia**, logrando un diseño más limpio, modular y flexible.

---

## 🛠️ Funcionalidades del Sistema

### Funcionalidades Actuales (Código Base)

1. **Cálculo de Impuestos**
    - Basado en el tipo de producto (alimentos, electrónicos, ropa, lujo).

2. **Aplicación de Descuentos**
    - Cada tipo de producto tiene reglas específicas de descuento.

3. **Generación de Facturas**
    - Imprime un resumen que incluye el precio original, descuentos aplicados y el precio total con impuestos.

---

## 🔍 Problemas Detectados

1. **Violación del Principio Abierto-Cerrado (OCP)**
    - La lógica para calcular impuestos y descuentos está fuertemente acoplada al método `switch`, dificultando la adición de nuevos tipos de productos.

2. **Acoplamiento Fuerte**
    - La clase `TaxCalculator` maneja demasiadas responsabilidades relacionadas con impuestos, descuentos y generación de facturas.

3. **Repetición de Código**
    - La lógica de manejo de tipos de productos está duplicada en varios métodos (`calculateTax`, `applyDiscount`).

4. **Escalabilidad Limitada**
    - Agregar un nuevo tipo de producto requiere modificar muchos métodos en `TaxCalculator`.

---

## 🎯 Objetivo del Ejercicio

### Refactorizar el Sistema para que Cumpla con el OCP

1. **Extensibilidad sin Modificación**
    - Permitir la adición de nuevos tipos de productos y reglas de impuestos/descuentos sin alterar el código base de `TaxCalculator`.

2. **Implementación del Patrón Estrategia**
    - Crear una jerarquía de estrategias para manejar impuestos y descuentos específicos de cada tipo de producto.

3. **Separación de Responsabilidades**
    - Extraer la lógica de impresión de facturas a una clase dedicada (`InvoicePrinter`).
