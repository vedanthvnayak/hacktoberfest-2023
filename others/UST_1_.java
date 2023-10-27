/******************************************************************************
ust 1)

Write a program to find the closest triangular number to T that is than Or equal to T
Notes:
We can say that a triangular number is any number that can
as a sum of the first x numbers, so the x-th triangular numb
the numbers from 1 to x (the 3rd triangular number is 1+2+3
The sequence of triangular numbers starts with: 1, 3, 6, 10, 15, 21

example 1:
input: 8
output: 6

example 2:
input:14
output:10

example 3:
input:15
output:15


*******************************************************************************/
public class Main
{
    public static void  com(int x,int i,int count,int pre ){
        if(count==x){
            System.out.println(count);
            return ;
        }
        if(count>=x){
            System.out.println(pre);
            return ;
        }
        com(x,++i,count+i,count);
        
    }
	public static void main(String[] args) {
		int x=14;//give your input here 
		int i=1;
		int count=1;
		int pre=1;
	    com( x, i, count, pre );
	}
}
