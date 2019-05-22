/*package whatever //do not write package name here */

import java.io.*;

class KthCharacter{
    
    static char character(String str,int k){
        
        String s="";
        int start=0;
        
        for(int i=0;i<str.length();i++){
            
            if(isDigit(str.charAt(i))){
                
                int j;
               
                for(j=i+1;j<str.length();j++){
                    
                    if(isDigit(str.charAt(j)))
                    continue;
                    else
                    break;
                }
                
                int l=Integer.parseInt(str.substring(i,j));
                
                for(int p=0;p<l;p++){
                s=s+str.substring(start,i);
                }
                start=j;
                i=j;
            }
            
        }
        
        if(s.length()<k)
        return '.';
        return s.charAt(k-1);
        
    }
    
    static boolean isDigit(char ch){
        
        if((ch-'0')>=0 && (ch-'0')<=9)
        return true;
        else
        return false;
        
    }
	public static void main (String[] args) {
		
		String str = "ab4c12ed3"; 
        int k = 21; 
        System.out.println(character(str, k));
	}
}
