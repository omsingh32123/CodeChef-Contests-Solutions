// ---------------------------------------------------------------
// ---------------------------------------------------------------
// Question URL : https://www.codechef.com/problems/MAXADJSUM
// ---------------------------------------------------------------
// ---------------------------------------------------------------


import java.util.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int r=Integer.parseInt(br.readLine());
        for(int q=0;q<r;q++)
        {
            int n=Integer.parseInt(br.readLine());
            String s[]=(br.readLine()).split(" ");
            int ar[]=new int[n];
            int sum=0;
            for(int i=0;i<n;i++)
            {
                ar[i]=Integer.parseInt(s[i]);
                sum+=2*ar[i];
            }
            Arrays.sort(ar);
            sum-=ar[0];
            sum-=ar[1];
            System.out.println(sum);
        }
	}
}