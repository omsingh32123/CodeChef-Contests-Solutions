// ---------------------------------------------------------------
// ---------------------------------------------------------------
// Question URL : https://www.codechef.com/problems/CHECKADJSUM
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
        for(int qrt=0;qrt<r;qrt++)
        {
            String s[]=(br.readLine()).split(" ");
            int n=Integer.parseInt(s[0]);
            int q=Integer.parseInt(s[1]);
            String sr[]=(br.readLine()).split(" ");
            int ar[]=new int[n];
            int sum=0;
            for(int ss=0;ss<n;ss++)
            {
                ar[ss]=Integer.parseInt(sr[ss]);
                sum=sum+2*ar[ss];
            }
            HashMap<Integer,String> map=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(i!=j)
                    map.put( sum-ar[i]-ar[j] , i+" "+j );
                }
            }
            for(int sq=0;sq<q;sq++)
            {
                int x=Integer.parseInt(br.readLine());
                if(map.containsKey(x))
                {
                    String ij[]=map.get(x).split(" ");
                    int i=Integer.parseInt(ij[0]);
                    int j=Integer.parseInt(ij[1]);
                    System.out.print(ar[i]+" ");
                    for(int it=0;it<n;it++)
                    {
                        
                        if( it!=i && it!=j )
                        {
                            System.out.print(ar[it]+" ");
                        }
                        
                    }
                    System.out.println(ar[j]+" ");
                }
                else
                {
                    System.out.println("-1");
                }
            }
        }
	}
}