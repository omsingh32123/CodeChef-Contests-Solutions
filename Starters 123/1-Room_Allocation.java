// ---------------------------------------------------------------
// ---------------------------------------------------------------
// Question URL : https://www.codechef.com/problems/ROOMALLOC
// ---------------------------------------------------------------
// ---------------------------------------------------------------

/* package codechef; // don't place package name! */

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
            int n=Integer.parseInt(br.readLine());
            int sum=0;
            String s[]=(br.readLine()).split(" ");
            for(int i=0;i<n;i++)
            {
                int x=Integer.parseInt(s[i]);
                sum+=(int)Math.ceil(((double)x)/2);
            }
            System.out.println(sum);
        }
	}
}