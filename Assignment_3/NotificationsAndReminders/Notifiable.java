package NotificationsAndReminders;

public interface Notifiable {
    void send(String recipient, String message);
}
