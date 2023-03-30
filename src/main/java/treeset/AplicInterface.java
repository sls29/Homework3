package treeset;

public interface AplicInterface {
    void addNewHobby(String hobby, String hobbyAddress);
    void addNewPerson(Person person);
    void listPersons();
    void listHobbies();
    void setPersonHobbies(String firstName, String hobby);
    void getPersonHobbies(String firstName);

}
