package ListExercising;

public abstract class AbstractListClass<T> {

    public abstract void add(T t);
    public abstract void remove(int index);
    public abstract void set(int index, T element);
    public abstract void clear();
    public abstract boolean isEmpty();
    public abstract int size();
    public abstract boolean contains(T element);
    public abstract T get(int index);


}
