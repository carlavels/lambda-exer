import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class RandomExercise {

    public static void main(String[] args) {
        
        List<String> randomWords = Arrays.asList("Summer", "Winter", "Autumn", "Drought", "Rainy", "Spring", "End of the world");

        sortAlphabetically(randomWords);
        sortShortestToLongest(randomWords);
    }


    // Sort Array strings alphabetically a-z and vice versa
    private static void sortAlphabetically(List<String> list){
        Collections.sort(list, (firstWord, secondWord) -> firstWord.compareTo(secondWord)); // lambda with Collections for sorting
        System.out.println("Printing sorted array list - A - Z: ");
        System.out.println(list);

        Collections.sort(list, (firstWord, secondWord) -> secondWord.compareTo(firstWord)); // lambda with Collections for sorting
        System.out.println("Printing sorted array list - Z - A: ");
        System.out.println(list);
    }

    // Sort Array strings Shortest to Longest and vice versa
    private static void sortShortestToLongest(List<String> list){
        Collections.sort(list, (firstWord, secondWord) -> firstWord.length() - secondWord.length()); // lambda with Collections for sorting
        System.out.println("Printing sorted array list - Shortest to Longest: ");
        System.out.println(list);

        Collections.sort(list, (firstWord, secondWord) -> secondWord.length() - firstWord.length()); // lambda with Collections for sorting
        System.out.println("Printing sorted array list - Shortest to Longest: ");
        System.out.println(list);
    }
}