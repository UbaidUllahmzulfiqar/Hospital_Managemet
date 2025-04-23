package EmergencyAlertSystem;

import NotificationsAndReminders.EmailNotification;
import NotificationsAndReminders.SMSNotification;

public class NotificationService {
    private EmailNotification emailNotification = new EmailNotification();
    private SMSNotification smsNotification = new SMSNotification();

    public void notifyDoctor(String message) {
        emailNotification.send("doctor@hospital.com", message);
        smsNotification.send("0312-0000000", message);
    }
}
