
package workspace;

public class RLE {
    
    public static void main(String[] args) {
        
        java.util.Scanner sc = new java.util.Scanner(System.in); 
        String val = sc.nextLine();
        
        int i=0;
        while(val.length() != i)
        {
            
            
            for(int j=0;j<val.charAt(i)-64;j++)
            {
                if(i%2==0)
                {
                    System.out.print("0");
                }
                else
                {
                     System.out.print("!");
                }
            }
            if(val.charAt(i) == ' ')
            {
                System.out.println();
            }
            
            i++;
        }
        
    }
    
}
