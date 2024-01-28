// Concrete product

public class Compass implements Device {

    private int gradiBussola;


    /**
     * Method to get the compass degrees from a compass
     * @return compass degrees as a string
     */
    @Override
    public String getInformation() {
        return String.valueOf(gradiBussola);
    }

}
