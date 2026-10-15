public class SmartCampusApp {
    public static void main(String[] args) {
        //creates campus 
        Campus campus = new Campus("RRHS");
        //prints "title"
        System.out.println("===========================");
        System.out.println("     " + campus.getName() + " SMART CAMPUS");
        System.out.println("===========================\n");
        
        //create devices
        SmartDevice d1 = DeviceFactory.createDevice("CAMERA", "CAM-2", "Entrance");
        SmartDevice d2 = DeviceFactory.createDevice("CAMERA", "CAM-6", "East Hall");
        SmartDevice d3 = DeviceFactory.createDevice("CAMERA", "CAM-11", "Courtyard");
        SmartDevice d4 = DeviceFactory.createDevice("DOOR", "DOOR-25", "Front Office");
        SmartDevice d5 = DeviceFactory.createDevice("DOOR", "DOOR-38", "Auditorium");
        SmartDevice d6 = DeviceFactory.createDevice("DOOR", "DOOR-73", "Gymnasium");
        SmartDevice d7 = DeviceFactory.createDevice("LIGHT", "LIGHT-44", "West Hall");
        SmartDevice d8 = DeviceFactory.createDevice("LIGHT", "LIGHT-80", "Server Room");
        SmartDevice d9 = DeviceFactory.createDevice("SENSOR", "SENSOR-19", "Cafeteria");
        
        //adds all devices to campus controller
        campus.getController().addDevice(d1);
        campus.getController().addDevice(d2);
        campus.getController().addDevice(d3);
        campus.getController().addDevice(d4);
        campus.getController().addDevice(d5);
        campus.getController().addDevice(d6);
        campus.getController().addDevice(d7);
        campus.getController().addDevice(d8);
        campus.getController().addDevice(d9);
        
        //prints the number of registered devices
        System.out.println("Registered Devices: " + campus.getController().getAllDevices().size());
        //prints out each device's status
        System.out.println("\n--- Device Statuses ---\n");
        campus.getController().displaySystemStatus();
        
        //runs all the devices' self tests
        System.out.println("--- Running Self-Tests ---\n");
        campus.getController().runAllSelfTests();
        
        //creates a campus alert as an e-mail
        System.out.println("\n--- Campus Alert ---\n");
        AlertService.setStrategy(new EmailAlert());
        AlertService.sendAlert("Heavy flooding in area!");
        //change alert strategy to SMS and resend alert
        System.out.println("\nChanging alert strategy to SMS.");
        AlertService.setStrategy(new SMSAlert());
        AlertService.sendAlert("Heavy flooding in area!");
        //change alert strategy to Console and resend alert
        System.out.println("\nChanging alert strategy to Console.");
        AlertService.setStrategy(new ConsoleAlert());
        AlertService.sendAlert("Heavy flooding in area!");
        
        //conclusion
        System.out.println("\n--- System Check Complete ---\n");
        System.out.println(campus.getController().getAllDevices().size() + " devices checked.");
        System.out.println("All systems operational.");
    }
}
