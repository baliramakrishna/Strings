/*package whatever //do not write package name here */

import java.util.*;

class GFG {
    
    static void commonCharacters(String str[], int n){
        
        boolean[] a=new boolean[26];
        Arrays.fill(a,true);
        
        for(int i=0;i<n;i++){
            
            boolean b[]=new boolean[26];
            
            for(int j=0;j<str[i].length();j++){
                
                if(a[str[i].charAt(j)-'a']==true){
                    
                    b[str[i].charAt(j)-'a']=true;
                }
                
            }
            
            a=b;
        }
        
        for(int i=0;i<26;i++){
            
            if(a[i]==true){
                
                char ch=(char)('a'+i);
                System.out.print(ch+" ");
            }
        }
        
    }
	public static void main (String[] args) {
	 
	 String str[] = { "geeksforgeeks", 
                         "gemkstones", 
                         "acknowledges", 
                         "aguelikes" }; 
                           
        int n = str.length; 
        commonCharacters(str, n);
	}
}
