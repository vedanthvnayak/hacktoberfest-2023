/******************************************************************************
7 edge 1)
Have the function MathChallenge (num) take num and return 1 if any arrangement
of num comes out to be a prime number, otherwise return 0. For example: 
if num is 910, the output should be 1 because 910 can be arranged 
into 109 or 019, both of which are primes


Examples
Input: 98
Output: 1

Input: 598
Output: 1

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int prime(ArrayList<String>aa){
        for(int i=0;i<aa.size();i++){
            if(check(aa.get(i)))
            return 1;
        }
        return 0;
    }
    public static String swap(int i,int j,String ss){
        char []c=ss.toCharArray();
        char temp=c[i];
        c[i]=c[j];
        c[j]=temp;
        return String.valueOf(c);
        
    }
    public static void sum(String sss,int n,int j,ArrayList<String>aa){
        if(n==j){
        aa.add(sss);
        return ;
        }
        
        for(int i=j;i<sss.length();i++){
            sss=swap(i,j,sss);
            sum(sss,n,j+1,aa);
             sss=swap(i,j,sss);
        }
        
        
    }
    public static boolean check(String aa){
        int s=Integer.parseInt(aa);
            for(int i=2;i<=Math.sqrt(s);i++){
                if(s%i==0)
                return false;
            }
        return true;
    }
	public static void main(String[] args) {
	    String sss="190";
	    char []ss=sss.toCharArray();
		ArrayList<String>aa=new ArrayList<>();
		sum(sss,sss.length(),0,aa);
		System.out.println(prime(aa));
	
	}
}
