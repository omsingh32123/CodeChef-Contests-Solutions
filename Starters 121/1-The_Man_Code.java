// ---------------------------------------------------------------
// ---------------------------------------------------------------
// Question URL : https://www.codechef.com/problems/MANCODE
// ---------------------------------------------------------------
// ---------------------------------------------------------------

import java.util.*;
import java.lang.*;
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
            if(n%3==0)
            {
                if(n%2==0)
                System.out.println(n/2+" "+n/3);
                else
                System.out.println(n/2+1+" "+n/3);
            }
            else
            {
                if(n%2==1)
                System.out.println(((n/2)+1)+" "+((n/3)+1));
                else
                System.out.println((n/2)+" "+((n/3)+1));
            }
        }
	}
}