/*package whatever //do not write package name here */

import java.util.*;

class DistinctSubStrings{
    
    static int substrings(String str){
        
	  HashSet<String> h=new HashSet<>();
	  h.add("");
	  
	  for(int l=1;l<=str.length();l++){
	      
	      for(int i=0;i<=str.length()-l;i++){
	          int j=i+l-1;
	          
	          if(!h.contains(str.substring(i,j+1)))
	           h.add(str.substring(i,j+1));
	          
	      }
	  }
        
        return h.size();
    }
	public static void main (String[] args) {
	 
	 System.out.println(substrings("ababa"));
	  
	}
}
