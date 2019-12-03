import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class StringStream {

    public static void main(String[] args) {

        Collection<String> words = Arrays.asList("Hello", "From", "The", "Other", "");
        System.out.println(words);

        Collection<String> wordsOnly = words.parallelStream().filter(word -> !word.isEmpty()).collect(Collectors.toList());
        System.out.println(wordsOnly);

        String sentence = words.stream().filter(word -> !word.isEmpty()).collect(Collectors.joining(" "));
        System.out.println(sentence);

        long vocabulary = words.stream().filter(word -> !word.isEmpty()).count();
        System.out.println("Amount of words: " + vocabulary);

    }

}
