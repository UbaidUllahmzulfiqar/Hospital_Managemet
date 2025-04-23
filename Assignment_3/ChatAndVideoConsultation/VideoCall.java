package ChatAndVideoConsultation;

public class VideoCall {
    public void startCall(String platform) {
        switch (platform.toLowerCase()) {
            case "zoom":
                System.out.println("Starting Zoom call: https://zoom.us/start");
                break;
            case "google":
                System.out.println("Starting Google Meet: https://meet.google.com/start");
                break;
            default:
                System.out.println("Unknown platform");
        }
    }
}
