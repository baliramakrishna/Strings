/*package whatever //do not write package name here */

import java.util.*;

class GFG {
    
     static String smallestWindow(String str1){
         
         int n=str1.length();
         String str2="";
         
         int hs1[]=new int[256];
         int hs2[]=new int[256];
         
         HashSet<Character> h=new HashSet<>();
         
         for(int i=0;i<n;i++){
             
             if(!h.contains(str1.charAt(i))){
             str2=str2+str1.charAt(i);
             hs2[str1.charAt(i)]++;
             h.add(str1.charAt(i));
             }
             
         }
         
         int l2=str2.length();
         
         int start=0,min=Integer.MAX_VALUE,startindex=-1,count=0;
         for(int i=0;i<n;i++){
             
             hs1[str1.charAt(i)]++;
             
             if(hs2[str1.charAt(i)]!=0 && hs2[str1.charAt(i)]>=hs1[str1.charAt(i)])
             count++;
             
             if(count==l2){
                 
                 while(hs2[str1.charAt(start)]<hs1[str1.charAt(start)] || hs2[str1.charAt(start)]==0)
                 {
                     if(hs2[str1.charAt(start)]<hs1[str1.charAt(start)])
                     hs1[str1.charAt(start)]--;
                     
                     start++;
                     
                 }
                 
                 int tmin=i-start+1;
                 
                 if(min>tmin){
                     min=tmin;
                     startindex=start;
                 }
             }
             
         }
         
        return str1.substring(startindex,startindex+min);
         
         
     }
    
	public static void main (String[] args) {
	   String str = "aabcbcdbca"; 
        System.out.println("Smallest window containing all distinct"
               + " characters is " + smallestWindow(str)); 
	}
}
