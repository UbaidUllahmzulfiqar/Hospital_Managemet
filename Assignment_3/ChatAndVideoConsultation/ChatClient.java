package ChatAndVideoConsultation;

public class ChatClient {
    private String userName;
    private ChatServer chatServer;

    public ChatClient(String userName, ChatServer chatServer) {
        this.userName = userName;
        this.chatServer = chatServer;
    }

    public void send(String message, String toUser) {
        chatServer.sendMessage(message, toUser);
    }

    public void receive(String message, String fromUser) {
        chatServer.receiveMessage(message, fromUser);
    }
}
