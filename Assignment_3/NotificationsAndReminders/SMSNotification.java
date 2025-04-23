package NotificationsAndReminders;

public class SMSNotification implements Notifiable {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}
