/******************************************************************************

MathChallenge (num) take the num parameter being passed and determine the largest double digit 
number within the whole number. For example: if num is 4759472 then your program should return 94 
because that is the largest double digit number. The input will always 
contain at least two positive digits.

example 1:
input: 453857
output: 85 

example 2:
input: 4759472
output: 94

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		String s="4759472";
		int max=-1;
		for(int i=0;i<s.length()-1;i++){
		    String ss="";
		    ss+=s.charAt(i);
		    ss+=s.charAt(i+1);
		    if(Integer.parseInt(ss)>max){
		        max=Integer.parseInt(ss);
		    }
		}
		System.out.print(max);
	}
}
