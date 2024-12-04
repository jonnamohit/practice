import java.util.*;
public class check2d {
    


	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int i,j=0,k;
	    int count=0;
	    int [][] arr=new int [n][n];
	    int [][] arr1=new int [n][n];
	    
	    for(i=0;i<n;i++){
	        for(j=0;j<n;j++){
	            arr[i][j]=sc.nextInt();
	        }
	    }
	    
	    for(i=0;i<n;i++){
	        for(j=0;j<n;j++){
	            arr1[i][j]=sc.nextInt();
	        }
	    }
	    for(i=0;i<n;i++){
	        for(j=0;j<n;j++){
	    
	    if(arr[i][j]==arr1[i][j]){
	        count++;
	    }
	        }
	    }
	    if(count!=0){
	        System.out.println(" both are identical");
	    }
	    
	    
	    
	  
	    
	   
	    
	}
}
    

