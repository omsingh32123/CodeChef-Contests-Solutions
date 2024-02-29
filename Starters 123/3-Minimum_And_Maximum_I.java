// ---------------------------------------------------------------
// ---------------------------------------------------------------
// https://www.codechef.com/problems/MINANDMAX
// ---------------------------------------------------------------
// ---------------------------------------------------------------

import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int r=Integer.parseInt(br.readLine());
        for(int q=0;q<r;q++)
        {
            long n=Long.parseLong(br.readLine());
            long x=sumit(n/2);
            if(n%2==1)
            {
                x+=n/2+1;
            }
            System.out.println(x);
        }
	}
	public static long sumit(long n)
	{
	    long sum=n*(n+1);
	    return sum;
	}
}