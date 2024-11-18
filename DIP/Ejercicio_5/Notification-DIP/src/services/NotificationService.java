package services;

import java.time.LocalDateTime;

public class NotificationService {
    private final EmailService emailService;
    private final SMSService smsService;
    private final PushNotificationService pushNotificationService;

    public NotificationService() {
        emailService = new EmailService();
        smsService = new SMSService();
        pushNotificationService = new PushNotificationService();
    }

    public void sendNotification(String type, String recipient, String message) {
        if (type.equalsIgnoreCase("email")) {
            if (!emailService.validateEmail(recipient)) {
                throw new IllegalArgumentException("Invalid email address: " + recipient);
            }
            emailService.sendEmail(recipient, message);

        } else if (type.equalsIgnoreCase("sms")) {
            if (!smsService.validatePhoneNumber(recipient)) {
                throw new IllegalArgumentException("Invalid phone number: " + recipient);
            }
            smsService.sendSMS(recipient, message);

        } else if (type.equalsIgnoreCase("push")) {
            if (!pushNotificationService.validateDeviceToken(recipient)) {
                throw new IllegalArgumentException("Invalid device token: " + recipient);
            }
            pushNotificationService.sendPushNotification(recipient, message);

        } else {
            throw new IllegalArgumentException("Unsupported notification type: " + type);
        }

        logNotification(type, recipient, message);
    }

    private void logNotification(String type, String recipient, String message) {
        System.out.println("[Log] Notification sent. Type: " + type + ", Recipient: " + recipient + ", Message: " + message + ", Time: " + LocalDateTime.now());
    }
}
