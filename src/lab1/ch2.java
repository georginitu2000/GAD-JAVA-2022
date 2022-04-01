package lab1;

public class ch2 {

    public static void compute(int n)
    {
        int x;
        x=n;
        int verif=0;
        if(n%3==0)
        {System.out.print("foo");
            verif++;
        }

        if(n%5==0)
        {
            System.out.print("bar");
            verif++;
        }
        if(n%7==0)
        {
            System.out.print("qix");
            verif++;
        }
        while(x>0)
        {
            if(x%10==3) {System.out.print("foo");
                verif++;
            }
            if(x%10==5) {System.out.print("bar");
                verif++;
            }


            if(x%10==7) {System.out.print("qix");
                verif++;
            }
            x=x/10;
        }
        if(verif==0) System.out.println(n);
    }




    public static void main(String[] args) {

        compute(15);
    }

}
