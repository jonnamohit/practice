
import java.util.*; 
public class factor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for(i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }

        
    }
    
}
