/*package whatever //do not write package name here */

import java.io.*;

class MinLength{
    
    static String minLength(String s1,String s2){
        
        int l1=s1.length();
        int l2=s2.length();
        
         if (l1 < l2) 
        { 
            System.out.println("No such window exists"); 
            return ""; 
        } 
        
        int hs1[]=new int[256];
        int hs2[]=new int[256];
        
        for(int i=0;i<l2;i++)
        hs2[s2.charAt(i)]++;
        
        int start=0,startindex=-1,count=0,min=Integer.MAX_VALUE;
        
        for(int i=0;i<l1;i++){
            
            hs1[s1.charAt(i)]++;
            
            if(hs2[s1.charAt(i)]!=0 && hs2[s1.charAt(i)]>=hs1[s1.charAt(i)])
            count++;
            
            if(count==l2){
                
                while(hs2[s1.charAt(start)]<hs1[s1.charAt(start)] || hs2[s1.charAt(start)]==0){
                    
                    if(hs2[s1.charAt(start)]<hs1[s1.charAt(start)])
                    hs1[s1.charAt(start)]--;
                    
                    start++;
                   
                    
                }
                
                int tmin=i-start+1;
                 
                 if(tmin<min){
                    
                 min=tmin;
                 startindex=start;
                 }
                
            }
            
        }
        
        if(startindex==-1)
        return "Not Possible";
        else
        return s1.substring(startindex,startindex+min);
        
        
    }
	public static void main (String[] args) {
		
		 String str = "this is a test string"; 
        String pat = "tist"; 
      
    System.out.print("Smallest window is :\n " + 
                        minLength(str, pat)); 
	}
}
