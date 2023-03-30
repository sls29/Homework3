package treeset;


import java.util.*;

public class App {
    public static void main(String[] args) {

    Aplic aplic = new Aplic();

    aplic.addNewPerson(new Person( "Junior", 16));
    aplic.addNewPerson(new Person( "Mister", 36));
    aplic.addNewPerson(new Person( "Senior", 61));

    aplic.listPersons();

    aplic.addNewHobby("ski", "Bavaria");
    aplic.addNewHobby("ski", "Trentino");
    aplic.addNewHobby("ski", "Jungfrau");
    aplic.addNewHobby("trek", "Cluj");
    aplic.addNewHobby("trek", "Tenerife");
    aplic.addNewHobby("trek", "Colorado");
    aplic.addNewHobby("swim", "Venice");
    aplic.addNewHobby("swim", "Devon");
    aplic.addNewHobby("swim", "Sardinia");

    aplic.listHobbies();

    aplic.setPersonHobbies("Junior", "ski");
    aplic.setPersonHobbies("Junior", "trek");
    aplic.setPersonHobbies("Mister", "trek");
    aplic.setPersonHobbies("Mister", "swim");
    aplic.setPersonHobbies("Senior", "swim");
    aplic.setPersonHobbies("Senior", "ski");

    aplic.getPersonHobbies("Mister");

   }
}