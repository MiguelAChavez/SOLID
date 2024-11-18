package services;

import java.time.LocalDateTime;

public class PushNotificationService {
    public void sendPushNotification(String deviceToken, String message) {
        System.out.println("[Push] Sending push notification to device " + deviceToken + " at " + LocalDateTime.now() + ": " + message);
    }

    public boolean validateDeviceToken(String deviceToken) {
        return deviceToken != null && !deviceToken.isEmpty();
    }
}
