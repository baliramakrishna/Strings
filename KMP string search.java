/*package whatever //do not write package name here */

import java.io.*;

class SubStringSearch{
    
    
    static int[] patternMatrix(String pattern){
        
        int temp[]=new int[pattern.length()];
        int index=0;
        
        for(int i=1;i<pattern.length();){
            
            if(pattern.charAt(i)==pattern.charAt(index)){
                
                temp[i]=index+1;
                index++;
                i++;
            }
            else{
                
                if(index!=0)
                index=temp[index-1];
                else{
                    temp[i]=0;
                    i++;
                }
            }
            
        }
        
        return temp;
    }
    
    static boolean KMP(String str,String pattern){
        
        int pm[]=patternMatrix(pattern);
        
        int i=0,j=0;
        
        while(i<str.length() && j<pattern.length()){
            
            if(str.charAt(i)==pattern.charAt(j)){
                
                i++;
                j++;
            }else{
                
                if(j!=0)
                j=pm[j-1];
                
                else
                i++;
                
            }
            
            
        }
        
        if(j==pattern.length())
        return true;
        else
        return false;
        
        
    }
    
	public static void main (String[] args) {
		
		String str="abxabcabcaby";
		String pattern="abcaby";
		
		System.out.println(KMP(str,pattern));
	}
}
