// ---------------------------------------------------------------
// ---------------------------------------------------------------
// Question URL : https://www.codechef.com/problems/SHORTSPELL
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
            int n=Integer.parseInt(br.readLine());
            String s=br.readLine();
            int c=0;
            for(int i=0;i<n-1;i++)
            {
                char ch=s.charAt(i);
                if(ch>s.charAt(i+1) && c==0)
                {
                    c=1;
                }
                else
                {
                    System.out.print(ch);
                }
            }
            if(c==1)
            {
                System.out.print(s.charAt(n-1));
            }
            System.out.println();
        }
	}
}
