import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        WordChecker a = new WordChecker("cat,cats,catsofcosmos");
        System.out.println(a);
        System.out.println(a.isWordChain());
        System.out.println(a.createList("cat"));
    }
}   