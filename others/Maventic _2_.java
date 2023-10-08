/******************************************************************************
Maventic 2)

count the number of Character in the string which has repeated more than ones in the 
string 

INPUT:
hii there
OUTPUT:
3

INPUT:
whythatinline
OUTPUT:
4



*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    String s="whythatinline";
	    int count=0;
	    int []a=new int[26];
	    for(int i=0;i<s.length();i++){
	        if(s.charAt(i)!=' ')
	        ++a[s.charAt(i)-'a'];
	    }
	    for(int i=0;i<a.length;i++){
	        if(a[i]>1)
	        count++;
	    }
		System.out.println(count);
	}
}
