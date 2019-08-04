
public class Person {

    String firstName, lastName;
    int age;

    Person(String firstName, String lastName, int age ){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        String message = String.format("Person [ firstname: %s, lastName: %s, age: %d ]", firstName, lastName, age);
        return message;
    }
    
}