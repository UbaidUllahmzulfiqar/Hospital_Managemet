package NotificationsAndReminders;

public class EmailNotification implements Notifiable {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending EMAIL to " + recipient + ": " + message);
    }
}
