package example.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

    public static void main( String[] arg){

        List<String> words = new ArrayList<>();

        words.add("house");
        words.add("family");
        words.add("hearth");

        words.forEach(w -> System.out.println(w));
    }
}
