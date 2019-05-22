/*package whatever //do not write package name here */

import java.util.*;

class NumberOfSubStrings{
    
    static int numberOfSubString(String  str,int k){
        
    LinkedList<String> l=new LinkedList<>();
    
    for(int l1=k;l1<=str.length();l1++){
        
        for(int i=0;i<=str.length()-l1;i++){
            
            int j=i+l1-1;
        
            String s=""+str.substring(i,j+1);
            
            l.add(s);
            
        }
        
    }
    
   
    int count=0;
    for(String p:l){
        
            HashSet<Character> h=new HashSet<>();
            int m=0;
            for(int i=0;i<p.length();i++){
                
                if(!h.contains(p.charAt(i))){
                    h.add(p.charAt(i));
                    m++;
                }
                
            }
            
            if(m==k)
            count++;
        
    }
    
    return count;
    }
   
	public static void main (String[] args) {
	
	 String ch = "abcbaa"; 
     int k = 3;
     System.out.println(numberOfSubString(ch,k));
	}
}
