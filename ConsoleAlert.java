public class ConsoleAlert implements AlertStrategy {
    @Override
    public void sendAlert(String message) {
        System.out.println("New Console Alert\n" + message);
    }
}
