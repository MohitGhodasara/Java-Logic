
package workspace;


public class nCr
{
    public static void main(String[] args)
    {

        
       java.util.Scanner sc = new java.util.Scanner(System.in); 
		int n = sc.nextInt();
		int r = sc.nextInt();
                int res=0;
                
                for(int i=0;i<=r;i++)
                {
                    if(i%2==0)
                    {
                      res += nCr(n,i);
                    }
                }
		
		System.out.print(res);
	}
	static double nCr(int n, int r){
		int rfact=1, nfact=1, nrfact=1,temp1 = n-r ,temp2 = r;
		if(r>n-r)
		{
			temp1 =r;
			temp2 =n-r;
		}
		for(int i=1;i<=n;i++)
		{
			if(i<=temp2)
			{
				rfact *= i;
				nrfact *= i;
			}
			else if(i<=temp1)
			{
				nrfact *= i;
			}
			nfact *= i;
		}
		return nfact/(double)(rfact*nrfact);
	}
         

}