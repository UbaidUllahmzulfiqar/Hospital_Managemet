package ChatAndVideoConsultation;

public class ChatServer {
    public void receiveMessage(String message, String fromUser) {
        System.out.println("Message from " + fromUser + ": " + message);
    }

    public void sendMessage(String message, String toUser) {
        System.out.println("Sending to " + toUser + ": " + message);
    }
}
