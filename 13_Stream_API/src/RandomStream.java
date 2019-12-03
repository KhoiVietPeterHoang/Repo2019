import java.util.Random;

public class RandomStream {

    public static void main(String[] args) {

        Random random = new Random();
        random.ints().forEach(System.out::println);

        random.ints().limit(3).forEach(System.out::println);

    }

}
