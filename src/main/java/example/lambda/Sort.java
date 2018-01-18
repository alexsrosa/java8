package example.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sort {

    public static void main(String[] args) {

        // Prepare
        List<String> words = new ArrayList<>();

        words.add("house");
        words.add("family");
        words.add("hearthcare");

        // example 1
        words.sort((s1, s2) -> {
            if(s1.length() < s2.length())
                return -1;
            if(s1.length() > s2.length())
                return 1;
            return 0;
        });

        System.out.println("Example 1");
        words.forEach(s -> System.out.println(s));

        //OR example 2
        words.add("sea");
        words.add("sunset");

        words.sort(Comparator.comparingInt(String::length));

        System.out.println("Example 2");
        words.forEach(s -> System.out.println(s));


        //OR

        //words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        //words.sort((s1, s2) -> s1.length() - s2.length());
    }
}
