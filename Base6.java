
package workspace;

public class Base6 {    
    public static void main(String[] args) {
        
        java.util.Scanner c = new java.util.Scanner(System.in);
        int n = c.nextInt();
        int num = 0,res = 0,rem,base = 6,count = 0;
        String data = c.next();
        String[] str = data.split(",");
        int[] list = new int[str.length];     
        for (int i = 0; i < str.length; i++) 
        {
            num = Integer.parseInt(str[i]);
            
             while (num > 0) {
             rem = num % base;
             res += rem;
             num /= base;
             }    
        list[i] = res;
        res = 0;
            
        } 
        n = list.length;
        for (int i = 0; i < n - 1; i++)
        {
             for (int j = i+1; j < n; j++)
             {
                if (list[i] > list[j])
                {
                     count++;
                }
             }
        }
       System.out.print(count);
    }   
}
