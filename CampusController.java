import java.util.ArrayList;
public class CampusController
{
    private static ArrayList<SmartDevice> allDevices = new ArrayList<SmartDevice>();
    
    public static void addDevice(SmartDevice device) { //adds a device to the list
        allDevices.add(device);
    }
    public static void displayAllDevices() { //displays information about all devices
        for (SmartDevice device : allDevices) {
            System.out.println(device.getID());
            System.out.println(device.getLocation());
            System.out.println(device.getOnline());
            System.out.println();
        }
    }
    public static void runAllSelfTests() { //all devices run their self tests
        for (SmartDevice device : allDevices) {
            device.performSelfTest();
        }
    }
    public static void displaySystemStatus() { //displays the status of all devices
        for (SmartDevice device : allDevices) {
            System.out.println(device.getStatus());
            System.out.println();
        }
    }
    public static ArrayList getAllDevices() { //returns list of all registered devices
        return allDevices;
    }
}
