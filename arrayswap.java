 import java.util.*;
 public class arrayswap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;

        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        for(int i=0;i<n;i=i+2){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;

        }

        System.out.println(" "+Arrays.toString(arr));
        
    }
}
