import services.NotificationService;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        System.out.println("Prueba de servicio de notificaciones:");
        try {
            System.out.println();
            notificationService.sendNotification("email", "example@example.com", "Hola, mundo!");

            notificationService.sendNotification("email", "example|example.com", "Hola, mundo!");
        } catch (Exception e) {
            System.out.println("  - Enviar notificación por correo electrónico: ERROR - " + e.getMessage());
        }

        try {
            System.out.println();
            notificationService.sendNotification("sms", "1234567899", "Hola, mundo!");

            notificationService.sendNotification("sms", "123-456-789", "Hola, mundo!");
        } catch (Exception e) {
            System.out.println("  - Enviar notificación por SMS: ERROR - " + e.getMessage());
        }

        try {
            System.out.println();
            notificationService.sendNotification("push", "123456789", "Hola, mundo!");

            notificationService.sendNotification("push", "", "Hola, mundo!");
        } catch (Exception e) {
            System.out.println("  - Enviar notificación push: ERROR - " + e.getMessage());
        }

    }

}