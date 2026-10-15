public interface AlertStrategy {
    //all classes implementing AlertStrategy can send alerts
    void sendAlert(String message);
}
