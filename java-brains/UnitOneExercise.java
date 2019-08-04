import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class UnitOneExercise {

    public static void main(String[] args) {
        
        List<Person> personList = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
            );

        // Sort list by last name
        Collections.sort(personList, ( a ,  b) -> a.getLastName().compareTo(b.getLastName()));


        // Create method that prints all list
        for(Person x : personList)
            printPerson(x);

        // Method that prints all person with last names starting with a specified letter    
        for(Person x : personList) {
            if(x.getLastName().startsWith("C") || x.getLastName().startsWith("c"))
                printPerson(x);
        }    
    }

    // method for printing 
    private static void printPerson( Person person) {
        System.out.println(person.toString());
    }

    
}