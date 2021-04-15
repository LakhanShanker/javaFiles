import java.util.*;
import java.lang.*;
import java.io.*;

    /* Name of the class has to be "Main" only if the class is public. */
    class Codechef
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc= new Scanner(System.in);
            int t=sc.nextInt();
            while(t>0)
            {
                int c=1;
                int n=sc.nextInt();
                int k=sc.nextInt();
                sc.nextLine();
                String st=sc.nextLine();
                char[] str=st.toCharArray();
                {
                    for(int i=0;i<n-1;i++){

                        if(str[i]=='*'){
                            for(int j=i+1;j<k;j++) {
                                if (str[j] == str[1+j])
                                    c+=1;

                                if(c==k)
                                    System.out.println("Yes");
                                 break;
                            }
                        }
                    }
                }

                if(k!=c)
                    System.out.println("no");
                 t--;
            }
        }
    }
