// ---------------------------------------------------------------
// ---------------------------------------------------------------
// Question URL : https://www.codechef.com/problems/ADVITIYA4
// ---------------------------------------------------------------
// ---------------------------------------------------------------


import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int r=Integer.parseInt(br.readLine());
        for(int qq=0;qq<r;qq++)
        {
            String srr[]=(br.readLine()).split(" ");
            int n=Integer.parseInt(srr[0]);
            int q=Integer.parseInt(srr[1]);
            String s=br.readLine();
            String[] result = s.split("(?<=(.))(?!\\1)");
            int max=0,lastlength=0;
            char lastchar='a';
            for(int j=0;j<result.length;j++)
            {
                int l=result[j].length();
                if(l>max)
                {
                    max=l;
                }
                lastchar=result[j].charAt(result[j].length()-1);
                lastlength=l;
            }
            System.out.print(max+" ");
            for(int i=0;i<q;i++)
            {
                char ch=(br.readLine()).charAt(0);
                if(ch==lastchar)
                {
                    lastlength++;
                    if(lastlength>max)
                    {
                        max=lastlength;
                    }
                }
                else
                {
                    lastlength=1;
                    lastchar=ch;
                }
                System.out.print(max+" ");
            }
            System.out.println();
        }
	}
}