import java.util.*;
public class subject{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,n,k,k1=0;
        int k2=0;
        int k3=0;
        int n1=0;
        int n2=0;
        int n3=0;
        

        n=sc.nextInt();
        int arr []=new int[n];

    for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
       
    }
    int arr1 []=new int[arr[0]];
    
    for(i=0;i<arr[0];i++){
        arr1[i]=sc.nextInt();
       
    }
    int arr2 []=new int[arr[1]];

    for(i=0;i<arr[1];i++){
        arr2[i]=sc.nextInt();
       
    }
    int arr3 []=new int[arr[2]];
    for(i=0;i<arr[1];i++){
        arr3[i]=sc.nextInt();
       
    }

    System.out.println(" "+arr1[i]+arr2[i]+arr3[i]);
    
    


    }
}