package workspace;

class Partition 
{     
    public static void main (String[] args) 
    {
         java.util.Scanner c = new java.util.Scanner(System.in);
        
        String inputs = c.next();
        String[] str = inputs.split(",");    int to = Integer.parseInt(str[1]);
        int n = Integer.parseInt(str[0]);
        int[] p = new int[n]; 
        int k = 0,val=0;  
        p[k] = n; 
        
        System.out.println(val);
      
        for(int j=0;j<=100;j++)
        {
           
            if(k+1==to)
            {
                int even=0;
                for (int i = 0; i < n; i++){
                if(p[i]%2==0 && p[i]!=0)
                {
                    even++;
                }
            }
            
            if(even >= 2)
            {
                val++;
            }  
            }
            int rem_val = 0;
            while (k >= 0 && p[k] == 1)
            {
                rem_val += p[k];
                k--;
            }      
            if (k < 0)  return;
            
            p[k]--;
            rem_val++;
            
            while (rem_val > p[k])
            {
                p[k+1] = p[k];
                rem_val = rem_val - p[k];
                k++;
            }
            
            p[k+1] = rem_val;
            k++;
        }
        System.out.println(val);
    }
    
}
 