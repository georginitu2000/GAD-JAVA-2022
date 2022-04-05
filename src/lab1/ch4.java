package lab1;

public class ch4 {
    public static void sumazero(int [] vect)
    {
        int nr=0;
        for(int i=0;i<vect.length;i++)
            for(int j=i+1;j<vect.length;j++)
                for(int k=j+1;k<vect.length;k++)
                    if(vect[i]+vect[j]+vect[k]==0)
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


    public static int[] elimtripl (int [] vect)
    {
        int nr=0;


        for (int i=0; i<vect.length-2; i++){
            if (vect[i] == vect[i+1] && vect[i+1]== vect[i+2]){
                nr++ ;
            }
        }
        int [] nou=new int[vect.length-nr];
        int j=0;
        for(int i = 0 ; i < vect.length-2; i++){
            if(vect[i] != vect[i+1] || vect[i]!=vect[i+2] ){
                nou[j] = vect[i];
                j++;
            }
        }
        nou[j++]=vect[vect.length-2];
        nou[j++]=vect[vect.length-1];
        return nou;


    }


    public static void main(String[] args) {

        int arr[] = {2,-1,-1,-1};
        sortare(arr);
        int [] v=elimtripl(arr);
        sumazero(v);
    }
}
