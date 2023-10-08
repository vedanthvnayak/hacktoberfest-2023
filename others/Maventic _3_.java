/******************************************************************************
Maventic 
3)
  print the longest substring which only contains vowels from the given string 
  
  example 1)
  INPUT: "rtyaeftyaeiouuuatrewqastuystreoaaaaaaaaaaaaiuyt "
  OUTPUT:eoaaaaaaaaaaaaiu
  
  example 2)
  INPUT: "ruuatret "
  OUTPUT:uua
  
  example 3)
  INPUT: "aeioouaeiiu"
  OUTPUT:aeioouaeiiu

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    String s="aeioouaeiiu";//give your input here 
	    String first_string="";
	    String second_string="";
	   for(int i=0;i<s.length();i++){
	       if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
	           first_string+=s.charAt(i);
	       }
	           else{
	               if(first_string.length()>second_string.length())
	               second_string=first_string;
	               first_string="";
	                   
	               
	           }
	   }
	   if(first_string.length()>second_string.length())// if the whole string only contains vowels 
	               second_string=first_string;
	               
		System.out.println(second_string);
	}
}
