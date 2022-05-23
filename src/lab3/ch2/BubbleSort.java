package lab3.ch2;

public class BubbleSort implements SortingStrategy{
    @Override
    public void sort(Integer[] list) {

        for (int i = 0; i <= list.length; i++)
            for (int j = i+1; j < list.length; j++)
                if (list[i] > list[j])
                {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
    }

}
