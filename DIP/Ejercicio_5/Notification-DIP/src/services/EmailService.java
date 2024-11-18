package services;

import java.time.LocalDateTime;

public class EmailService {
    public void sendEmail(String recipient, String message) {
        System.out.println("[Email] Sending Email to " + recipient + " at " + LocalDateTime.now() + ": " + message);
    }

    public boolean validateEmail(String recipient) {
        return recipient.contains("@");
    }
}
