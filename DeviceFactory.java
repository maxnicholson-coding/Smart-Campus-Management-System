public class DeviceFactory {
    //creates a device with given parameters
    public static SmartDevice createDevice(String type, String id, String location) {
        switch(type) {
            case "CAMERA":
                return (new SecurityCamera(id, location, 1080));
            case "DOOR":
                return (new SmartDoor(id, location, true));
            case "LIGHT":
                return (new SmartLight(id, location, 800));
            case "SENSOR":
                return (new TemperatureSensor(id, location, 78.1));
            default:
                return null;
        }
    }
}
