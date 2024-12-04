import java.util.Arrays;
import java.util.Scanner;

public class checkStg {
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    int i,j=0;
	    String s=sc.nextLine();
	    
	    String s1=sc.nextLine();
	    char ch[]=s.toCharArray();
	    char ch1[]=s1.toCharArray();
	    
	    Arrays.sort(ch);
	    Arrays.sort(ch1);
	    for(i=0;i<ch.length;i++){
	    
	    if(ch[i]==ch1[i]){
	        j++;
	    }
	    
	    }
	    if(j==ch.length){
	        System.out.println("true");
	    }
	     
	    
	}
    
}
