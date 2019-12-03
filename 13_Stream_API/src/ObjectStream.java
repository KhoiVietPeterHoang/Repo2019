import java.util.Date;
import java.util.stream.Stream;

public class ObjectStream {

    public static void main(String[] args) {

        Stream<Date> stream = Stream.generate(() -> { return new Date(); });
        stream.forEach(System.out::println);

    }

}
