package EmergencyAlertSystem;

public class PanicButton {
    private NotificationService notificationService;

    public PanicButton(NotificationService service) {
        this.notificationService = service;
    }

    public void press() {
        System.out.println("Panic button pressed!");
        notificationService.notifyDoctor("EMERGENCY: Patient has triggered a panic alert!");
    }
}
