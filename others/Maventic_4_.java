/******************************************************************************
Maventic 4)
Given two arrays of integers, find a pair of values (one value from each array) that you can swap to give the two arrays the same sum.

example 
a={5, 7, 4, 6}
b={1, 2, 3, 8}
output:
        5 1
        7 3
        6 2
        
        

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int []a={5, 7, 4, 6};
	    int []b= {1, 2, 3, 8};
	    int sum1=0,sum2=0;
	    for(int i=0;i<a.length;i++){
	        sum1+=a[i];
	    }
	    HashSet<Integer>take=new HashSet<>();
	    for(int i=0;i<b.length;i++){
	        sum2+=b[i];
	        take.add(b[i]);
	    }
	    int diff=(sum1-sum2)/2;
	    for(int i=0;i<a.length;i++){
	        int q=((sum2-sum1)+(2*a[i]))/2;
	        if(take.contains(a[i]-diff)){
	            	System.out.println(a[i]+" "+(a[i]-diff));
	            	
	            	
	        }
	    }
	    //	System.out.println(sum1+" "+sum2+" "+diff);
	    
	
	}
}
