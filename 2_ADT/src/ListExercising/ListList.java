package ListExercising;

import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.Arrays;

public class ListList<T> extends AbstractListClass {

    T t;

    T[] list = (T[]) new Object[0];

    @Override
    public void add(Object o) {
        int currentLength = list.length; // or this.size
        list = Arrays.copyOf(list, currentLength + 1);
        try {
            list[currentLength] = (T) o;
        } catch(Exception exception) {
            throw(exception);

        }

    }

    @Override
    public void remove(int index) {
        if (index >= list.length){
            System.out.println("Index out of bounds");
        } else {
            T[] newList = (T[]) new Object[list.length-1];
            for (int i = 0; i < list.length; i++) {
              if (i < index) {
                newList[i] = list[i];
              } else if (i > index) {
                newList[i-1] = list[i];

            }

          }

           list = newList;

        }

    }

    @Override
    public void set(int index, Object element) {
        list[index] = (T) element;

    }

    @Override
    public void clear() {
        list = (T[]) new Object[0];
    }

    @Override
    public boolean isEmpty() {
     //   if (list.length == 0) {
     //       return true;
      //  } else {
       //     return false;
        return (list.length == 0);
    }

    @Override
    public int size() {
        return list.length;
    }

    @Override
    public boolean contains(Object o) {
        // Create a loop, return true inside the loop if the element has been found.
        // Use a boolean to determine whether or not X element is in the list or not
        // Use the .equals (because it's an object)
        return false;

    }

    @Override
    public Object get(int index) {

        // Get the element from the index
        return null;

    }
    public String toString(){
        return Arrays.toString(list);
    }

}

