public class EmailAlert implements AlertStrategy {
    @Override
    public void sendAlert(String message) {
        System.out.println("New E-Mail Alert\n" + message);
    }
}
