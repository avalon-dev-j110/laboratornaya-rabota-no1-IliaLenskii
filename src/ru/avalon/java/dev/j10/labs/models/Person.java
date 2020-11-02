package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;
import java.util.Date;

public class Person {
    private String name;
    private String surname;
    private String middleName;
    private String secondName;

    private Date birthday;

    private Passport passport;

    public Person(String Surname, String Name) {
        this.name = Name;
        this.surname = Surname;
    }

    public Person(String Surname, String Name, String MiddleName) {
        this(Surname, Name);
        this.middleName = MiddleName;
    }

    public Person(String Surname, String Name, String MiddleName, String SecondName) {
        this(Surname, Name, MiddleName);
        this.secondName = SecondName;
    }

    public String getFullName() {

        String def = this.name +" "+ this.surname;
        String fc = this.secondName != null ? this.secondName.substring(0, 1) : "";

        if(this.middleName == null && this.secondName == null)
            return def;

        if(this.middleName != null)
            return def +" "+ this.middleName;

        if(this.middleName == null && this.secondName != null)
            return this.name +" "+ fc +". "+ this.surname;

        return def;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date Birthday) {
        this.birthday = Birthday;
    }

    public String getAddress() {

        if(this.passport == null)
            return "";

        return this.passport.address.getAddress();
    }

    public void setAddress(Address Address) {

        if(this.passport == null)
            return;

        this.passport.address = Address;
    }

    public void setPassport(Passport Passport) {

        this.passport = Passport;
    }

    public String getPassport() {

        if(this.passport == null)
            return "";

        return this.passport.getPassport();
    }
}