/*package whatever //do not write package name here */

import java.io.*;

class Panagram{
	public static void main (String[] args) {
		
		String s="welcome to geeksforgeeks";
		int n=s.length();
		StringBuffer b=new StringBuffer("");
		int k,r;

		for(int i=0;i<26;i++){
		   k=s.indexOf(i+'a');
		   r=s.indexOf(i+'A');
		   if(k<0 && r<0)
		    b.append((char)(i+'a'));
		}
     System.out.println(b);
	}
}
