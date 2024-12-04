import java.util.*;
public class duplicateno {
    public static void main(String[] args) {
        
    ArrayList<Integer>hi=new ArrayList<>();
    int i,j;
    Scanner sc=new Scanner(System.in);
    int count=0;
    int n=sc.nextInt();

    int [] arr=new int[n];

    for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++){
        hi.add(arr[i]);
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
        System.out.println(" "+hi.get(i)+" "+count);

    }

    


}
}


    
