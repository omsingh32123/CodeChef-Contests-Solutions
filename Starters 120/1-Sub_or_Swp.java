// ---------------------------------------------------------------
// ---------------------------------------------------------------
// Question URL : https://www.codechef.com/problems/ASM120
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
            int x=Integer.parseInt(s[0]);
            int y=Integer.parseInt(s[1]);
            int max=(int)Math.max(x,y);
            int min=(int)Math.min(x,y);
            if(max%min==0)
            max=min;
            else
            max=findGCD(max,min);
            System.out.println(max);
        }
	}
	public static int fun(int max,int min)
	{
	    int div=1;
	    for(int i=2;i<=min;i++)
	    {
	        if( max%i==0 && min%i==0 )
	        {
	            div=i;
	            break;
	        }
	    }
	    return div;
	}
	public static int findGCD(int a, int b) {
        // Ensure that 'a' is greater than or equal to 'b'
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }

}