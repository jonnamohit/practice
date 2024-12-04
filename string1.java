import java.util.*; 
 class string1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="luc#k##y";
		int i;
		char ch=' ';
		String c="";
		String d="";
		for(i=0;i<s.length();i++){
		     ch=s.charAt(i);
		
		    if(ch=='#'){
		        c=c+ch;
		        
		    }
		    else{
		        d=d+ch;
		    }
		    
		    
		}
		
		System.out.println(" "+c+" "+d);
	}
}