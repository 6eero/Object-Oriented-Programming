import Exceptions.IllegalCommandException;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Objects;

public class Boat implements Observer{

    private final ArrayList<Device> deviceListOfTheBoat = new ArrayList<>();
    private ControlPanel controlPanel = new ControlPanel();
    private String state;
    private int engineRPM;


    /**
     * Method to add a new device to the boat
     * @param device the device to add to the boat (if null -> nothing happens)
     */
    public void addNewDeviceToTheBoat(@NotNull Device device) {
        deviceListOfTheBoat.add(device);
    }


    /**
     * Method to remove an existing device from the specified boat
     * @param device the device to remove frome the boat. It must exist in the boat
     */
    public void removeDeviceFromTheBoat (@NotNull Device device) {
        deviceListOfTheBoat.remove(device);
    }


    /**
     * Method to print all the devices contained by a specific boat
     * @param boat can be null if the boat has no connected devices
     */
    public void printDeviceListOfTheBoat(Boat boat) {
        for (Device device : deviceListOfTheBoat) {
            System.out.println(device);
        }
    }


    /**
     * Method that exec a specific command
     * @param command must be not null
     * @throws IllegalCommandException if the command is illegal
     */
    @Override
    public void update(String command) throws IllegalCommandException {

        if (Objects.equals(command, "turn on")) {
            state = "on";
            System.out.println("The boat is on");

        } else if (Objects.equals(command, "set mothor rpm to 2000")) {
            state = "on";
            engineRPM = 2000;
            System.out.println("Setting the engine RPM to 2000");
        } else {
            throw new IllegalCommandException ("The command must be \"turn on\" or \"set mothor rpm to 2000\"");
        }
    }
}
