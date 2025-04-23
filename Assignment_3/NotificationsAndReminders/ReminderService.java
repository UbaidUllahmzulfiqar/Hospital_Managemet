package NotificationsAndReminders;

public class ReminderService {
    private Notifiable emailNotifier;
    private Notifiable smsNotifier;

    public ReminderService() {
        this.emailNotifier = new EmailNotification();
        this.smsNotifier = new SMSNotification();
    }

    public void sendAppointmentReminder(String email, String phone, String time) {
        String msg = "Reminder: Appointment at " + time;
        emailNotifier.send(email, msg);
        smsNotifier.send(phone, msg);
    }

    public void sendMedicationReminder(String email, String phone, String medicine) {
        String msg = "Reminder: Take your medication - " + medicine;
        emailNotifier.send(email, msg);
        smsNotifier.send(phone, msg);
    }
}
