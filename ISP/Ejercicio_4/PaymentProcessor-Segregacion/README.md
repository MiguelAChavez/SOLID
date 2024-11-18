# 📝 Ejercicio 4: Refactorización según el Principio de Segregación de Interfaces (ISP)

---

## **Descripción del Ejercicio**

En este ejercicio trabajamos con un sistema de pagos que no cumple con el **Principio de Segregación de Interfaces (ISP)**. Actualmente, las clases `CreditCardPayment` y `BankTransferPayment` implementan una interfaz grande llamada `PaymentProcessor` que contiene métodos no relevantes para ambas clases.

Por ejemplo:
- La clase `CreditCardPayment` tiene que implementar el método `validateBankAccount`, que no es relevante para tarjetas de crédito.
- La clase `BankTransferPayment` tiene que implementar métodos como `applyDiscount` que no son necesarios para una transferencia bancaria.

Esto crea un diseño acoplado e innecesariamente complejo, dificultando la mantenibilidad y la extensibilidad del código.

---

## **Problemas Detectados**

1. **Interfaz Sobrecargada**:  
   La interfaz `PaymentProcessor` tiene demasiados métodos que no son aplicables a todas las implementaciones, lo que obliga a las clases a implementar métodos no relevantes.

2. **Falta de Flexibilidad**:  
   Las clases tienen que lanzar excepciones o manejar métodos que no utilizan, lo cual complica la lógica del sistema.

3. **Violación del ISP**:  
   Los clientes están obligados a depender de métodos que no utilizan, lo cual contraviene el principio de segregación de interfaces.

---

## **Estructura del Código Mal Implementado**

### **Interfaz Actual**

La interfaz `PaymentProcessor` contiene métodos que no son relevantes para todas las implementaciones:

```java
public interface PaymentProcessor {
    void processPayment(double amount);
    void generateReceipt();
    void applyDiscount(double discount);
    boolean validateBankAccount(String accountNumber);
}
```

---

### **Implementaciones**

1. **Clase `CreditCardPayment`**:  
   Esta clase implementa métodos que no son necesarios, como `validateBankAccount`. Además, tiene lógica acoplada dentro de `processPayment`.

2. **Clase `BankTransferPayment`**:  
   Similarmente, esta clase implementa métodos irrelevantes como `applyDiscount`, lo que introduce código innecesario.

---

## **Tareas a Realizar**

Tu tarea es refactorizar el código para que cumpla con el **Principio de Segregación de Interfaces (ISP)**, siguiendo estos pasos:

1. **Dividir la Interfaz Actual**:
    - Crea varias interfaces más pequeñas y específicas:
        - `PaymentProcessing` para procesar pagos.
        - `BankAccountValidation` para la validación de cuentas bancarias.
        - `DiscountApplication` para aplicar descuentos.
        - `ReceiptGeneration` para la generación de recibos.

2. **Actualizar las Clases**:
    - Refactoriza `CreditCardPayment` y `BankTransferPayment` para que implementen solo las interfaces que realmente necesitan.

3. **Eliminar Métodos Irrelevantes**:
    - Asegúrate de que las clases no dependan de métodos que no usan.

## **🎯 Objetivos del Ejercicio**

- **Cumplir con el ISP**: Cada clase debe depender únicamente de los métodos que necesita.
- **Mejorar la Mantenibilidad**: Elimina código innecesario y hace el sistema más flexible para futuros cambios.
- **Simplificar las Clases**: Reduce la cantidad de métodos innecesarios en las implementaciones.
