// Concrete product

public class GPS implements Device {

    private String latitude;
    private String longitude;

    /**
     * Method to get the latitude and the longitude from a gps
     * @return latitude + longitude
     */
    @Override
    public String getInformation() {
        return latitude + longitude;
    }

}
