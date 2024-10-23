import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        WordChecker a = new WordChecker("a,b,c,d");
        a.isWordChain();
        a.createList("cat");
        System.out.println(a);
    }
}   