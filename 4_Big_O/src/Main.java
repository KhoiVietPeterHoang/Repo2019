import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Double {{ because it's a nested anonymous
        ArrayList<Integer> n = new ArrayList<>(){{
            add(7);
            add(1);
            add(6);
            add(8);
            add(4);
            add(5);
            add(5);
            add(5);
            add(2);
            add(2);

        }};

        // Example
        int y = 200 * 600; // O (1) - Due to constants
        int x = 800 * (700 / 200); //O (1) - Due to constants. O(1) + O(1) = O(1)
        //System.out.println(x + y);

        // Example 2

        double r = 800 * Math.PI;
        //System.out.println(r);
       // n.forEach(System.out::println);
        n.forEach((number) -> {
            System.out.println(number);

        });
        // Total: O(n)

        // Example 3
        for(int i = 0; i < n.size(); i++) { // O (n)
            System.out.println(i);
            // alternate way -> System.out.println(n.get(i));

            // Count down in the list
            for (int b = 0; b < n.size(); b--) { // O (n)
                System.out.println(b);
                // alternate way -> System.out.println(n.get(b));

            }

            for (int c = n.size() - 1; c >= 0; c--) { // O (n)

            } // Total: O(n)

            // Example 4
            for(int k = 0; i < n.size(); k++) {
                for(int m = 0; i < n.size(); m++) {
                    System.out.println("How Long?");
                } // Total: O(n^2)
            }

        }

    }

}
