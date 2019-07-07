/*You are given a string S. Each character of S is either ‘a’, or ‘b’. 
You wish to reverse exactly one sub-string of S such that the new string 
is lexicographically smaller than all the other strings that you can get 
by reversing exactly one sub-string.
For example, given ‘abab’, you may choose to reverse the substring ‘ab’ 
that starts from index 2 (0-based). This gives you the string ‘abba’. 
But, if you choose the reverse the substring ‘ba’ starting from index 1, you will get ‘aabb’.
There is no way of getting a smaller string, hence reversing the substring in the range [1, 2] is optimal.*/


/*package whatever //do not write package name here */

import java.io.*;

class Smallest{
	public static void main (String[] args) {
		
		String str="ababaa";
		int n=str.length();
		
		String small=str;
		for(int l=2;l<=n-1;l++){
		    
		    for(int i=0;i<=n-l;i++){
		        
		        int j=i+l-1;
		        
		        if(str.charAt(i)>str.charAt(j)){
		            
		            StringBuffer b=new StringBuffer(str.substring(i,j+1));
		            b.reverse();
		            String temp=new String(b);
		            temp=str.substring(0,i)+temp+str.substring(j+1);
		            
		            if(small.compareTo(temp)>0)
		            small=temp;
		        }
		        
		    }
		    
		}
		
		System.out.println(small);
		
	}
}
