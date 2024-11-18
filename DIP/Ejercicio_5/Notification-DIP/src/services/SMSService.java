package services;

import java.time.LocalDateTime;

public class SMSService {
    public void sendSMS(String phoneNumber, String message) {
        System.out.println("[SMS] Sending SMS to " + phoneNumber + " at " + LocalDateTime.now() + ": " + message);
    }

    public boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d{10}");
    }
}
