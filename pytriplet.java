import java.util.Scanner;

public class pytriplet {
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int i,j=0;
	    for(i=1;i<n;i++){
	        for(j=i+1;j<n;j++){
	            double c=Math.sqrt(i*i+j*j);
	            if(c==(int)c){
	                System.out.println(+i+","+j+","+(int)c);
	            }
	        }
	    }
	    
	    
	    
	    
	}
    
}
