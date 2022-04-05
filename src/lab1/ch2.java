package lab1;

public class ch2 {

    public static String compute(int n)
    {
        String s=new String();
        int x;
        x=n;
        int verif=0;
        if(n%3==0)
        { s += "foo";
            verif++;
        }

        if(n%5==0)
        {
            s += "bar";
            verif++;
        }
        if(n%7==0)
        {
            s += "qix";
            verif++;
        }
        while(x>0)
        {
            if(x%10==3) {s += "foo";
                verif++;
            }
            if(x%10==5) {s += "bar";
                verif++;
            }


            if(x%10==7) {s += "qix";
                verif++;
            }
            x=x/10;
        }

        String nn = String.valueOf(n);
        if(verif==0) return nn;
        else return s;
    }




    public static String compute2 (int n)
    {
        String s=new String();
        int x;
        x=n;
        int verif=0;
        if(n%3==0)
        { s += "foo";
            verif++;
        }

        if(n%5==0)
        {
            s += "bar";
            verif++;
        }
        if(n%7==0)
        {
            s += "qix";
            verif++;
        }
        while(x>0)
        {
            if(x%10==3) {s += "foo";
                verif++;
            }
            if(x%10==5) {s += "bar";
                verif++;
            }


            if(x%10==7) {s += "qix";
                verif++;
            }

            if ((s.contains("foo") || s.contains("bar") || s.contains("qix")) == false)
                if(x%10 != 0) {
                    s += String.valueOf(x%10);
                    verif++;
                }


            if(x%10==0)
            {
                s += "*";
                verif++;
            }
            x=x/10;
        }

        String nn = String.valueOf(n);
        if(verif==0) return nn;
        else return s;
    }


    public static void main(String[] args) {

        String x=compute(10101);
        System.out.println(x);
        String y=compute2(10101);
        System.out.println(y);
    }

}
