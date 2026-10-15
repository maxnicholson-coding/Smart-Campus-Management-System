public class SMSAlert implements AlertStrategy {
    @Override
    public void sendAlert(String message) {
        System.out.println("New SMS Alert\n" + message);
    }
}
