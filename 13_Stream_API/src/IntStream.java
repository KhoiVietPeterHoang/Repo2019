import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class IntStream {

    static List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 5, 6, 7, 8, 9);

    public static void main(String[] args) {

        //numbers.stream().forEach(number -> System.out.println(number));

        List<Integer> squaredNumbers = numbers.stream().map(number -> number*number).collect(Collectors.toList());
       //System.out.println(squaredNumbers);

        List<Integer> squaredNumbersUnique = numbers.stream().map(number -> number*number).distinct().collect(Collectors.toList());
        //System.out.println(squaredNumbersUnique);

        // tal%2==0 -> Even  tal%2==1 -> Odd
        Integer[] oddNumbers = numbers.stream().filter(number -> number%2==1).toArray(Integer[]::new);
        System.out.println(Arrays.toString(oddNumbers));

        IntSummaryStatistics stats = numbers.stream().mapToInt(number -> number).summaryStatistics();

        System.out.println(stats.getMax());
        System.out.println(stats.getAverage());
        System.out.println(stats.getSum());

    }

}
