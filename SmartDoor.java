public class SmartDoor extends SmartDevice implements Lockable{
    private boolean isLocked;
    public SmartDoor(String id, String location, boolean locked) {
        super(id, location);
        isLocked = locked;
    }
    @Override
    public void lock() { //locks the door
        isLocked = true;
    }
    @Override
    public void unlock() { //unlocks the door
        isLocked = false;
    }
    @Override
    public void performSelfTest() { //tests itself
        System.out.println(getID() + ": Lock mechanism test passed.");
    }
    @Override
    public String getStatus() { //returns the status of the device
        String status;
        String lock;
        if (getOnline()) {
            status = "ONLINE";
        } else {
            status = "OFFLINE";
        }
        if (isLocked) {
            lock = "LOCKED";
        } else {
            lock = "UNLOCKED";
        }
        return(getID() + "\nSmart Door\nLocation: " + getLocation() + "\nStatus: " + status + "\nDoor: " + lock);
    }
}
