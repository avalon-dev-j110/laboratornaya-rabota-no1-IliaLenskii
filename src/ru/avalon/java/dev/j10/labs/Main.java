package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.commons.Address;

public class Main {

    public static void main(String[] args) {

        Address add1 = new Address(
                "Russia",
                "Saint-Petersburg",
                "st. Pochtamtskaya 4",
                190000);

        Address add2 = new Address(
                "Russia",
                "Moscow",
                "st. Live 8",
                101000);

        Person ivanov = new Person("Иванов", "Иван", "Иванович");
        ivanov.setPassport(new Passport());
        ivanov.setAddress(add1);

        Person smith = new Person("John", "Edvard", "Smith");
        smith.setPassport(new Passport());
        smith.setAddress(add2);

        String fnIvanov = ivanov.getFullName();
        String addresIvanov = ivanov.getAddress();
        String passIvanov = ivanov.getPassport();


        String fnSmith = smith.getFullName();
        String addresSmith = smith.getAddress();
        String passSmith = smith.getPassport();

        System.out.println(fnIvanov);
        System.out.println(passIvanov);
        System.out.println(addresIvanov);
        System.out.println("----------------");
        System.out.println(fnSmith);
        System.out.println(passSmith);
        System.out.println(addresSmith);
    }
}
