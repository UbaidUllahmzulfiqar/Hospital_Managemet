package Main;

import EmergencyAlertSystem.*;
import ChatAndVideoConsultation.*;
import NotificationsAndReminders.*;

public class RPMSApplication {
    public static void main(String[] args) {
        // 🔴 Emergency Alert Simulation
        EmergencyAlert alert = new EmergencyAlert(135, 190); // Critical vitals
        NotificationService notifier = new NotificationService();

        try {
            alert.checkVitals();
        } catch (CriticalConditionException e) {
            System.out.println("🚨 Exception: " + e.getMessage());
            notifier.notifyDoctor(e.getMessage());
        }

        // 🆘 Panic Button
        PanicButton panicButton = new PanicButton(notifier);
        panicButton.press();

        // 💬 Chat System
        ChatServer chatServer = new ChatServer();
        ChatClient doctor = new ChatClient("Dr. Khan", chatServer);
        ChatClient patient = new ChatClient("John", chatServer);

        patient.send("Hello Doctor, I feel dizzy.", "Dr. Khan");
        doctor.receive("Hello Doctor, I feel dizzy.", "John");
        doctor.send("Please take rest and monitor your vitals.", "John");
        patient.receive("Please take rest and monitor your vitals.", "Dr. Khan");

        // 📹 Video Call
        VideoCall videoCall = new VideoCall();
        videoCall.startCall("Google");

        // 🔔 Reminder System
        ReminderService reminderService = new ReminderService();
        reminderService.sendAppointmentReminder("john@example.com", "0300-1234567", "3 PM");
        reminderService.sendMedicationReminder("john@example.com", "0300-1234567", "Aspirin 100mg");
    }
}
