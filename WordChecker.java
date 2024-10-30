import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class WordChecker {
    /** Initialized in the constructor and contains no null elements */
    public WordChecker() {}
    private ArrayList<String> wordList;


    public WordChecker(String s) {
        wordList = new ArrayList<String>();
        String[] list = s.split(",");
        for(String word : list) wordList.add(word);
    }

    /**
     * Returns true if each element of wordList (except the first) contains the
     * previous
     * element as a substring and returns false otherwise, as described in part (a)
     * Precondition: wordList contains at least two elements.
     * Postcondition: wordList is unchanged.
     */
    public boolean isWordChain() {
        int b = 0;
        String a = "";
        for (String str : wordList) {
            if (str.indexOf(a) >= 0) {
                b++;
            } else {
                return false;
            }
            a = str;
        };
        if (b>0) return true;
        return true;
        /* to be implemented in part (a) */ }

    /**
     * Returns an ArrayList<String> based on strings from wordList that start
     * with target, as described in part (b). Each element of the returned ArrayList
     * has had
     * the initial occurrence of target removed.
     * Postconditions: wordList is unchanged.
     * Items appear in the returned list in the same order as they appear in
     * wordList.
     */



    public ArrayList<String> createList(String target) {
        ArrayList<String> list = new ArrayList<>();
        int a = target.length();
        for (String str : wordList) {
            if (str.length()<a) {
                break;
            } else if (str.substring(0,a).equals(target)) {
                list.add(str.replace(target, ""));
            }
        }
        return list;
        /* to be implemented in part (b) */ }

    public String toString()
    {
        return wordList.toString();
    }
}