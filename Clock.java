
package workspace;
public class Clock {
    
     public static void main(String[] args) {
         
       
        
           //java.util.Scanner c = new java.util.Scanner(System.in);
           //String data = c.next();
        
            String data = "0,0,1,1,3,5,6,7,7";
            String[] str = data.split(",");
            
            String s="";
            int hour = 0,one=0,two=0;
            int min = 0;
            int sec = 0;
            int i=0,j=0,k=0,l=0;
            int uk=0,ul=0;
           for (i = 0; i < str.length; i++) {
            
               for (j = 0; j < str.length; j++) {
                   
                   for (k = 0; k < str.length; k++) {
                       
                       for (l = 0; l < str.length; l++) {
                           if(str[l].equalsIgnoreCase("0")){ continue;}
                           int left = (Integer.parseInt(str[i])*10) + Integer.parseInt(str[j]);
                           int right = (Integer.parseInt(str[k])*10) + Integer.parseInt(str[l]);
                           if(hour < right && right < 24)
                           {
                               
                               hour = right;
                               uk=k;
                               ul=l;
                               
                               
                           }
                       }
                       
                   }
                   
               }
           }
           str[uk]="0";
           str[ul]="0";
               
            for (i = 0; i < str.length; i++) {
            
               for (j = 0; j < str.length; j++) {
                   
                   for (k = 0; k < str.length; k++) {
                       
                       for (l = 0; l < str.length; l++) {
                           
                           if(str[l].equalsIgnoreCase("0")){ continue;}
                           
                           int left = (Integer.parseInt(str[i])*10) + Integer.parseInt(str[j]);
                           int right = (Integer.parseInt(str[k])*10) + Integer.parseInt(str[l]);
                           if(min < right && right < 60)
                           {
                               min = right;
                               uk=k;
                               ul=l;
                           }
                       }
                       
                   }
                   
               }
            }
           str[uk]="0";
           str[ul]="0";
               
            for (i = 0; i < str.length; i++) {
            
               for (j = 0; j < str.length; j++) {
                   
                   for (k = 0; k < str.length; k++) {
                       
                       for (l = 0; l < str.length; l++) {
                           if(str[l].equalsIgnoreCase("0")){ continue;}
                           int left = (Integer.parseInt(str[i])*10) + Integer.parseInt(str[j]);
                           int right = (Integer.parseInt(str[k])*10) + Integer.parseInt(str[l]);
                           if(sec < right && right < 60)
                           {
                               sec = right;
                               uk=k;
                               ul=l;
                                
                           }
                           
                       }
                       
                   }
                   
               }
            }
           str[uk]="0";
           str[ul]="0";
           System.out.print(hour+":"+ min+":"+sec);
        
         
    }
    
}
