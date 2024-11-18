# 📝 Ejercicio 5: Refactorización según el Principio de Inversión de Dependencia (DIP)  


## **Descripción del Ejercicio**  
En este ejercicio, te enfrentarás al diseño de un sistema de notificaciones que envía mensajes a los usuarios mediante diferentes canales, como correo electrónico, SMS y notificaciones push. El sistema está implementado de manera que la clase principal, `NotificationService`, depende directamente de las clases que realizan el envío de mensajes, lo que genera un fuerte acoplamiento y hace que el sistema sea difícil de mantener y escalar.

Tu objetivo es **refactorizar el código para que cumpla con el Principio de Inversión de Dependencia (DIP)**. Este principio busca que las clases de alto nivel no dependan de las de bajo nivel, sino de abstracciones. Al hacerlo, mejorarás la flexibilidad del sistema, permitiendo agregar nuevos canales de notificación sin modificar la lógica existente.  

## **🎯 Objetivos Específicos**
1. **Introducir Abstracciones:**  
   Diseñar una interfaz que defina el comportamiento común para los servicios de notificación (por ejemplo, `NotificationSender`).  

2. **Refactorizar Servicios:**  
   Hacer que las clases `EmailService`, `SMSService`, y `PushNotificationService` implementen la interfaz.  

3. **Desacoplar `NotificationService`:**  
   Cambiar la dependencia directa de las clases concretas por una colección de objetos que implementen la nueva interfaz.  

4. **Mantener Funcionalidad:**  
   Asegúrate de que el sistema mantenga las siguientes capacidades:  
   - Enviar notificaciones a través de diferentes canales.  
   - Validar la información del destinatario según el canal (por ejemplo, correos electrónicos válidos o números de teléfono correctos).  
   - Registrar cada notificación enviada.  

---

## **📦 Contexto del Sistema Actual**  
El sistema actual tiene los siguientes problemas:  
1. **Fuerte Acoplamiento:**  
   La clase `NotificationService` está directamente vinculada a las implementaciones de `EmailService`, `SMSService`, y `PushNotificationService`.  

2. **Baja Extensibilidad:**  
   Cada vez que se agrega un nuevo canal de notificación, es necesario modificar `NotificationService`, lo que viola el principio de diseño **Abierto-Cerrado (OCP)** además del DIP.  

3. **Responsabilidades Mezcladas:**  
   `NotificationService` combina la lógica de validación, envío y registro en una sola clase, dificultando su mantenimiento.  

