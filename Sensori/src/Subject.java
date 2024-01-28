import Exceptions.IllegalCommandException;

public interface Subject {


    /**
     * Method to add a new boat to the list of the boat that will get commands from the control panel
     * @param boat must be != null
     */
    void subscribe(Boat boat);

    /**
     * Method to remove a boat from the list of the boat that will get commands from the control panel
     * @param boat must be != null and must be in the listOfObserveredBoats
     */
    void unsubscribe(Boat boat);

    /**
     * Method to notify all the subscribed boat with the given command
     * @param command must be a legal command
     */
    void notifySubscribedDevices(String command) throws IllegalCommandException;

}
