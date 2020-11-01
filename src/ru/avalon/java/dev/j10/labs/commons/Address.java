
package ru.avalon.java.dev.j10.labs.commons;

public class Address {
    private String country;
    private String city;
    private String address;
    private int zip = -1;

    public Address(String Address) {
        this.address = Address;
    }

    public Address(String Address, int Zip) {
        this(Address);
        this.zip = Zip;
    }

    public Address(String Country, String City, String Address, int Zip) {
        this(Address, Zip);
        this.country = Country;
        this.city = City;
    }

    public String getAddress() {
        String adr = "";

        if(this.country != null)
            adr += "Country is "+ this.country +". ";

        if(this.city != null)
            adr += "City is "+ this.city +". ";

        if(this.address != null)
            adr += "Address is "+ this.address +". ";

        if(this.zip > -1)
            adr += "ZIP is "+ this.zip +". ";

        return adr;
    }
}