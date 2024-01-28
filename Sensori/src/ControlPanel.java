import Exceptions.IllegalActionToDoException;
import Exceptions.IllegalCommandException;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ControlPanel implements Subject {

    private final List<Boat> listOfObserveredBoats = new ArrayList<>();


    /**
     * Method to add a new boat to the list of the boat that will get commands from the control panel
     * @param boat must be != null
     */
    @Override
    public void subscribe(Boat boat) {
        listOfObserveredBoats.add(boat);
    }


    /**
     * Method to remove a boat from the list of the boat that will get commands from the control panel
     * @param boat must be != null and must be in the listOfObserveredBoats
     */
    @Override
    public void unsubscribe(Boat boat) {
        listOfObserveredBoats.remove(boat);
    }


    /**
     * Method to notify all the subscribed boat with the given command
     * @param command must be a legal command
     */
    @Override
    public void notifySubscribedDevices(String command) throws IllegalCommandException {
        for (Boat boat : listOfObserveredBoats) {
            boat.update(command);
        }
    }


    /**
     * Method to add or remove a device from the boat. If the device is added, it
     * can be manipulated, if the device is removed, it can no longer be used
     * @param device cannot be null. It must be a valid Device
     * @param actionToDo it can be only "add" or "remove". It returns an exception otherwise
     * @param boat != null
     * @throws IllegalActionToDoException if actionToDo != "add" or actionToDo != "remove"
     */
    public void configureNewDevice(@NotNull Device device, @NotNull String actionToDo, @NotNull Boat boat) throws IllegalActionToDoException {

        if (Objects.equals(actionToDo, "add")) {
            boat.addNewDeviceToTheBoat(device);

        } else if (Objects.equals(actionToDo, "remove")) {
            boat.removeDeviceFromTheBoat(device);

        } else {
            throw new IllegalActionToDoException("You can olny add or remove a device from a boat!");
        }
    }
}
