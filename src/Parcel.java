import java.time.LocalDate;

public class Parcel {
    private String name;
    private LocalDate deliveryDate;
    private String address;
    private String zip;
    private String city;
    private String countryCode;
    private Tracking tracking;
    private ParcelDetails parcelDetails;

    //Getters en setters voor alle private variabelen.
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getDeliveryDate() { return deliveryDate; }
    public void setDeliveryDate(LocalDate deliveryDate) { this.deliveryDate = deliveryDate; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getZip() { return zip; }
    public void setZip(String zip) { this.zip = zip; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getCountryCode() { return countryCode; }
    public void setCountryCode(String countryCode) { this.countryCode = countryCode; }

    public Tracking getTracking() { return tracking; }
    public void setTracking(Tracking tracking) { this.tracking = tracking; }

    public ParcelDetails getParcelDetails() { return parcelDetails; }
    public void setParcelDetails(ParcelDetails parcelDetails) { this.parcelDetails = parcelDetails; }

}
