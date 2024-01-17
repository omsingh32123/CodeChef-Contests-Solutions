// ---------------------------------------------------------------
// ---------------------------------------------------------------
// Question URL : https://www.codechef.com/problems/NPRPE
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
            String s[]=(br.readLine()).split(" ");
            if(n<=2)
            {
                System.out.print(-1);
            }
            else
            {
                for(int i=0;i<n;i++)
                {
                    int x=Integer.parseInt(s[i]);
                    int a=2;
                    if(x+a>n)
                    {
                        if(x%2==0)
                        x=2;
                        else
                        x=1;
                    }
                    else
                    {
                        x+=a;
                    }
                    System.out.print(x+" ");
                }
            }
            System.out.println();
        }
	}
}
