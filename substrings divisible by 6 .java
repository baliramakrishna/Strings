/*package whatever //do not write package name here */

import java.io.*;

class SubStrings{
    
    static int subStrings(String s){
        
        int n=s.length();
        int result=0;
        for(int l=1;l<=n;l++){
            
            for(int i=0;i<=n-l;i++){
                
                int j=i+l-1;
                
                if(l==1){
                if(Integer.parseInt(s.substring(i,j+1))%6==0)
                result++;
                }else{
                    
                    if((s.charAt(i)-'0')!=0){
                         if(Integer.parseInt(s.substring(i,j+1))%6==0)
                          result++;
                    }
                }
                
            }
        }
        
       return result;
    }
	public static void main (String[] args) {
	  
	  String s="4806";
	  System.out.println(subStrings(s));
	}
}
