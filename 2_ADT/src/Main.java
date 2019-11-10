import ListExercising.AbstractListClass;
import ListExercising.ListList;


public class Main {

    public static void main(String[] args) {

        ListList<Integer> list = new ListList<Integer>();
        list.add(new Integer(0));
        list.add(new Integer(1));
        list.add(new Integer(5));
       // System.out.println(list.isEmpty());
       // list.clear();
       // System.out.println(list.isEmpty());
        list.add(new Integer(2));
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        //list.set(0, new Integer(200));
        //System.out.println(list);

    }

}

