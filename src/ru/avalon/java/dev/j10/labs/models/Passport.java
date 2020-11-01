package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;
import java.util.Date;

class Passport {
    private int series;
    private int nn;
    private Date date = new Date();
    private String maker = "The Passport office";

    protected Address address;

    private static int countSeries = 4030;
    private static int countNN = 567000;

    public Passport() {

        this.series = (++Passport.countSeries);
        this.nn = (++Passport.countNN);
    }

    public String getPassport() {
        String adr = "Passport: ";

        adr += series +" "+ nn +", ";
        adr += date.toString() +", ";
        adr += maker;

        return adr;
    }
}
