package lab1;

public class ch3 {
    public static void sumazero(int [] vect)
    {
        int nr=0;
        for(int i=0;i<vect.length;i++)
            for(int j=i+1;j<vect.length;j++)
                if(vect[i]+vect[j]==0)
                    nr++;
        System.out.println(nr);
    }



    public static void sortare(int [] vect)
    {
        int aux=0;
        for(int i=0;i<vect.length;i++)
            for(int j=i+1;j<vect.length;j++)
                if(vect[i]>vect[j])
                {
                    aux=vect[i];
                    vect[i]=vect[j];
                    vect[j]=aux;
                }

    }


    public static int[] elimdupl (int [] vect)
    {
        int nr=0;


        for (int i=0; i<vect.length-1; i++){
            if (vect[i] == vect[i+1]){
                nr++ ;
            }
        }
        int [] nou=new int[vect.length-nr];
        int j=0;
        for(int i = 0 ; i < vect.length-1; i++){
            if(vect[i] != vect[i+1]){
                nou[j] = vect[i];
                j++;
            }
        }
        nou[j++]=vect[vect.length-1];
        return nou;


    }


    public static void main(String[] args) {

        int arr[] = {3,2,-3,-2,3,0};
        sortare(arr);
        int [] v=elimdupl(arr);
        sumazero(v);
    }
}
