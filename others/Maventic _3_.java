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
	    String aa="";
	    String bb="";
	   for(int i=0;i<s.length();i++){
	       if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
	           aa+=s.charAt(i);
	       }
	           else{
	               if(aa.length()>bb.length())
	               bb=aa;
	               aa="";
	                   
	               
	           }
	   }
	   if(aa.length()>bb.length())// if the whole string only contains vowels 
	               bb=aa;
	               
		System.out.println(bb);
	}
}
