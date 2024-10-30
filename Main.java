import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        WordChecker a = new WordChecker("an,band,band,abandon");
        System.out.println(a.isWordChain());
        WordChecker b = new WordChecker("to,too,stool,tools");
        System.out.println(b.isWordChain());
        WordChecker c = new WordChecker("catch,bobcat,catchacat,cat,at");
        System.out.println(c.createList("cat"));
        System.out.println(c.createList("catch"));
        System.out.println(c.createList("dog"));
    }
}   