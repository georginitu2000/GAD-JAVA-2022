package lab3.ch1;

public class ArrayCustomIterator {
    public int[] arr;
    public int i;
    public ArrayCustomIterator(int[] arr){
        this.arr=arr;
        i=0;
    }

    public boolean hasNext(){
        if(i< arr.length)
            return true;
        return false;
    }

    public int next(){
        i++;
        return arr[i-1];

    }
}
