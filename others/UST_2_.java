/******************************************************************************
ust 2)

Find the product of the Fibonacci numbers from the A-th position to 
the B-th position (both inclusive).
The Fibonacci sequence is a series of numbers in which each number is the sum of
the two preceding ones, usually starting with 0 and 1. The sequence starts: 0, 1, 1, 2, 3, 5, 8, 13, ...
example:
If A = 0 and B = 2, then the product would be 0x1x1=0.

example 1:
input: 
    A=1
    B=3 
output:
    2 
    
example 2:
input:
    A=3 
    B=5
output:
    30
    
*******************************************************************************/
public class Main
{
    public static int fab(int n){
        if(n<=1)
        return 1;
        return fab(n-1)+fab(n-2);
    }
	public static void main(String[] args) {
		int n1=3;//first input 
		int n2=5;//second input 
		int product=1;
		if(n1==0){
		    System.out.println(0);
		}
		else{
		    for(int i=n1-1;i<n2;i++){
		        product*=fab(i);
		    }
		}
		
		
		System.out.println(product);
	}
}
