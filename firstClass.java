import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class firstClass
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc>0)
        {
            int d1=sc.nextInt();
            int v1=sc.nextInt();
            int d2=sc.nextInt();
            int v2=sc.nextInt();
            int p=sc.nextInt();
            int t=0,i=0,j=0,y;
            if(d1<d2)
            {
                while(d1-j!=1)
                {
                    j++;
                }
                y=d2-d1;
                while(d1<d2)
                {

                    t=t+v1;
                    d1++;
                }
            }
            else{

                while(d2-j!=1)
                {
                    j++;
                }
                 y=d1-d2;
                while(d1>d2)
                {
                    t=t+v2;
                    d2++;
                }
            }
            if(d1==d2)
            {
                int x=p-t;
                int e=0;

                while(e<=x)
                {
                    e=v1+v2;
                    i++;
                }
            }
            int z=i+y+j;
            System.out.println(z);

            tc--;
        }

    }
}
