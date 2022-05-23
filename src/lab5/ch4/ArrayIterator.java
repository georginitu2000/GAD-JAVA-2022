package lab5.ch4;

public class ArrayIterator<T> implements IArrayIterator{
    public T[] arr;
    public int i;

    public ArrayIterator(T obj){
        arr= (T[]) obj;
    }

    @Override
    public boolean hasNext() {
        return (i<arr.length);
    }

    @Override
    public T next() {
        if(i< arr.length){
            T obj = arr[i];
            i++;
            return obj;
        }
        return null;
    }
}
