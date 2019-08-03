
public class ShortLambda {
    static String word; 

    public static void main(String[] args) {

        word = "SukaBlyaat"; // 10 digitz
        //Shortest lambda possible - one parameter can ommit the ()
        printStringLenght(s -> s.length());

        word = "SukaBlyaatx"; // 11 digitz
        //middle degree
        printStringLenght((s) -> s.length());

        word = "SukaBlyaatxx"; // 12 digitz
        //Seems long
        StringLenght printLength = s -> s.length();
        System.out.println(printLength.returnLenght(word));

    }

    static void printStringLenght(StringLenght x) {
        System.out.println(x.returnLenght(word));
    }
    
}

interface StringLenght {
    int returnLenght(String S);
}