/*package whatever //do not write package name here */

import java.util.*;

class StringInteger {
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		
		try{
		int a=Integer.parseInt(s1);
		System.out.println("Integer");
		}catch(Exception e){
		    System.out.println("String");
		}
	}
}
