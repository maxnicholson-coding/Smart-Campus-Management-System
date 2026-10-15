public class AlertService {
    private static AlertStrategy currentStrategy;
    public static void setStrategy(AlertStrategy a) { //sets the alert strategy to be used later
        currentStrategy = a;
    }
    public static void sendAlert(String message) { //sends an alert with the current strategy
        currentStrategy.sendAlert(message);
    }
}
