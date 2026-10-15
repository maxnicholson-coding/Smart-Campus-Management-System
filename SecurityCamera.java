public class SecurityCamera extends SmartDevice implements Monitorable{
    private int resolution;
    public SecurityCamera(String id, String location, int resolution) {
        super(id, location);
        this.resolution = resolution;
    }
    public void record() { //records camera footage
        System.out.println("Footage saved at " + resolution + "p.");
    }
    @Override
    public void monitor() { //starts monitoring the cameras
        System.out.println("Camera footage is being recorded.");
    }
    @Override
    public void performSelfTest() { //tests itself
        System.out.println(getID() + ": Camera recording test passed.");
    }
    @Override
    public String getStatus() { //returns the status of the device
        String status;
        if (getOnline()) {
            status = "ONLINE";
        } else {
            status = "OFFLINE";
        }
        return(getID() + "\nSecurity Camera\nLocation: " + getLocation() + "\nStatus: " + status + "\nResolution: " + resolution + "p");
    }
}
