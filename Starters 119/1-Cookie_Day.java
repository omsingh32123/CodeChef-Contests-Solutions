// ---------------------------------------------------------------
// ---------------------------------------------------------------
// Question URL : https://www.codechef.com/problems/ADVITIYA3
// ---------------------------------------------------------------
// ---------------------------------------------------------------

import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int r=Integer.parseInt(br.readLine());
        for(int q=0;q<r;q++)
        {
            String t[]=(br.readLine()).split(" ");
            int n=Integer.parseInt(t[0]);
            int k=Integer.parseInt(t[1]);
            int d=0,min=0;
            String ar[]=(br.readLine()).split(" ");
            for(int i=0;i<n;i++)
            {
                int x=Integer.parseInt(ar[i]);
                int count = x / k ;
                if(count>0)
                {
                    x = x - count * k ;
                    if( x<min || d==0 )
                    {
                        min=x;
                        d=1;
                    }
                }
            }
            if(d==1)
            {
                System.out.println(min);
            }
            else
            {
                System.out.println(-1);
            }
        }
	}
}
