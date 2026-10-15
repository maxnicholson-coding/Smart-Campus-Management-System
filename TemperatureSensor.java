public class TemperatureSensor extends SmartDevice {
    private double temperature;
    public TemperatureSensor(String id, String location, double temperature) {
        super(id, location);
        this.temperature = temperature;
    }
    public double readTemperature() { //reads the current temperature
        return temperature;
    }
    @Override
    public void performSelfTest() { //tests itself
        System.out.println(getID() + ": Temperature check test passed.");
    }
    @Override
    public String getStatus() { //returns the status of the device
        String status;
        if (getOnline()) {
            status = "ONLINE";
        } else {
            status = "OFFLINE";
        }
        return(getID() + "\nTemperature Sensor\nLocation: " + getLocation() + 
        "\nStatus: " + status + "\nCurrent Temperature: " + temperature + " degrees F");
    }
}
