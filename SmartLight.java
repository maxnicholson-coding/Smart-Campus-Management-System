public class SmartLight extends SmartDevice {
    private int brightness;
    public SmartLight(String id, String location, int brightness) {
        super(id, location);
        this.brightness = brightness;
    }
    public void setBrightness(int newBrightness) { //sets the light's brightness
        brightness = newBrightness;
    }
    @Override
    public void performSelfTest() { //tests itself
        System.out.println(getID() + ": Lighting system test passed.");
    }
    @Override
    public String getStatus() { //returns the status of the device
        String status;
        if (getOnline()) {
            status = "ONLINE";
        } else {
            status = "OFFLINE";
        }
        return(getID() + "\nSmart Light\nLocation: " + getLocation() +
        "\nStatus: " + status + "\nBrightness: " + brightness + "lm");
    }
}
