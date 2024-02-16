// ---------------------------------------------------------------
// ---------------------------------------------------------------
// Question URL : https://www.codechef.com/problems/ADVITIYA5
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
            String s[]=(br.readLine()).split(" ");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            for(int i=1;i<k;i++)
            {
                System.out.print(i+" ");
            }
            int start=k;
            while(start<=n)
            {
                System.out.print(start+" ");
                start+=2;
            }
            start=k+1;
            while(start<=n)
            {
                System.out.print(start+" ");
                start+=2;
            }
            System.out.println();
        }
	}
}