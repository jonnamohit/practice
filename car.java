import java.util.*;
public class car {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        

        int i,j=0,n,k;
        int result=0;
        int c1,v1,c2,v2,c3,v3;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<1;i++){
            for(j=0;j<n;j++){
                
            c1=sc.nextInt();
            v1=sc.nextInt();
            arr[j] =c1*4+v1*2;
            
            
            }
            

            
        }
        for(j=0;j<n;j++){
        
        System.out.println(" "+arr[j]);
        }

        
    }
    
}
