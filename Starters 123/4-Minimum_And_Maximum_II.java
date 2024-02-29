// ---------------------------------------------------------------
// ---------------------------------------------------------------
// Question URL : https://www.codechef.com/problems/MINANDMAX2
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
            long x=(n*(n+1))/2;
            x=x-1+n;
            System.out.println(x);
        }
	}
}