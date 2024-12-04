import java.util.Scanner;

public class spiralorder {
    public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    int i,j,n,r;
	    int c;
	    r=sc.nextInt();
	    c=sc.nextInt();
		int arr[][]=new int[r][c];
		for(i=0;i<r;i++){
		    for(j=0;j<c;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		if (r == 0 || c == 0) {
            System.out.println("Matrix is empty.");
            
        }
		

		int left=0;
		int bottom=arr.length-1;
		int top=0;
		int right=arr[0].length-1;
		System.out.println("spiral order");
		while(top<=bottom && left<=right){
		    for(i=left;i<=right;i++){
		        System.out.print(arr[top][i]+" ");
		        
		    }
		    top++;
		    for(i=top;i<=bottom;i++){
		        System.out.print(arr[i][right]+" ");
		    }
		     right--;
		     if(top<=bottom){
		         for(i=right;i>=left;i--){
		             System.out.print(arr[bottom][i]+" ");
		         }
		         bottom--;
		     }
		     if(left<=right){
		         for(i=bottom;i>=top;i--){
		             System.out.print(arr[i][left]+" ");
		         }
		         left++;
		     }
		    
		}
		
		
		
	}
}
    

