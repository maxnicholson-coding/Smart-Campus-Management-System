public class Campus {
    private String name;
    private CampusController controller;
    public Campus(String name) {
        this.name = name;
        controller = new CampusController();
    }
    public String getName() { //returns the campus's name
        return name;
    }
    public CampusController getController() { //retuns the campus controller
        return controller;
    }
}
