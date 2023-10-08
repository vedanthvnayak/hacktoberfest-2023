/******************************************************************************

Maventic 1)

give the number of substring  which is palandrome in the given string 'S'


note:
the minimum length of the plandrome string should be at least greater than 3   

example 1)
INPUT :"abcba"
OUTPUT: 1

example 2)
INPUT: "ababababa"
OUTPUT: 7

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    String s="abcba";//give your input here 
	    int i=0;
	    int count=0;
	    int max=0;
	    while(i<s.length()){
	        int l=i;
	        int r=i;
	        count=0;
	        while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){//odd number string 
	            count++;
	            l--;
	            r++;
	        }
	        if(count>=2)
	        max++;
	        count=0;
	        l=i;
	        r=i+1;
	        while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){//even number string 
	            count++;
	            l--;
	            r++;
	        }
	        i++;
	         if(count>=2)
	        max++;
	    }
	    System.out.println(max);
	}
}
