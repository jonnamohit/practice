import java.util.*;
public class duplicate
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="lucklucky";
		ArrayList<Character>hi=new ArrayList<>();
		int i,j;
		int count =0;
		
		
		for(i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    
		    hi.add(ch);
		    
		}
		for(i=0;i<hi.size();i++){
		    count=1;
		    for(j=i+1;j<hi.size();j++){
		    if(hi.get(i)==hi.get(j)){
		        count++;
		        hi.remove(j);
		        j--;
		    }
		    
		    }
		    System.out.println(hi.get(i)+" "+count);
		}
		
	}
}