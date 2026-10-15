public abstract class SmartDevice {
    private String deviceId;
    private String location;
    private boolean online;
    public SmartDevice(String id, String location) {
        deviceId = id;
        this.location = location;
        online = true;
    }
    public String getID() { //returns device's ID
        return deviceId;
    }
    public String getLocation() { //returns device location
        return location;
    }
    public boolean getOnline() { //returns whether the device is online or not
        return online;
    }
    public void setOnline() { //sets the device to be online
        online = true;
    }
    public void setOffline() { //sets the device to be offline
        online = false;
    }
    //all smart devices musst be able to test themselves and get their status
    public abstract void performSelfTest();
    public abstract String getStatus();
}
