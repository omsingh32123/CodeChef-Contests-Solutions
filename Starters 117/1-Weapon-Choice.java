// ---------------------------------------------------------------
// ---------------------------------------------------------------
// Question URL : https://www.codechef.com/problems/WEPCH
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
            String s[]=(br.readLine()).split(" ");
            int h=Integer.parseInt(s[0]);
            int x=Integer.parseInt(s[1]);
            int y1=Integer.parseInt(s[2]);
            int y2=Integer.parseInt(s[3]);
            int k=Integer.parseInt(s[4]);
            int a=(int)Math.ceil((double)h/(double)x);
            int b=(int)Math.ceil((double)h/(double)y1);
            int c=0;
            if(b>k)
            {
                h=h-y1*k;
                c=(int)Math.ceil((double)h/(double)y2);
                if(a>c+k)
                {
                    System.out.println(c+k);
                }
                else
                {
                    System.out.println(a);
                }
            }
            else
            {
                if(a>b)
                {
                    System.out.println(b);
                }
                else
                {
                    System.out.println(a);
                }
            }
        }
	}
}