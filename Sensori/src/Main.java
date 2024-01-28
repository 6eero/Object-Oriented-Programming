import Exceptions.IllegalActionToDoException;
import Exceptions.IllegalCommandException;

public class Main {

    public static void main(String[] args) throws IllegalActionToDoException, IllegalCommandException {

        Boat boat = new Boat();
        ControlPanel controlPanel = new ControlPanel();

        Device gps1 = new GPS();
        Device gps2 = new GPS();
        Device compass = new Compass();

        controlPanel.configureNewDevice(gps1, "add", boat);
        controlPanel.configureNewDevice(gps2, "add", boat);
        controlPanel.configureNewDevice(compass, "add", boat);
        controlPanel.configureNewDevice(gps2, "remove", boat);

        //boat.printDeviceListOfTheBoat(boat);

        controlPanel.subscribe(boat);

        controlPanel.notifySubscribedDevices("turn on");
        controlPanel.notifySubscribedDevices("set mothor rpm to 2000");

    }

}