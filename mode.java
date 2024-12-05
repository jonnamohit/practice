import java.util.*;
public class mode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        int count,min=0,mode=0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>=min){
                min=count;
                mode =arr[i];
            }
           
        }
        System.out.println(" "+mode);


    }
    
}
