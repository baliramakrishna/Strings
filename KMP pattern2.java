/*package whatever //do not write package name here */

import java.io.*;

class KMP{
    
    static void kmp(String str,String ptr){
        
        int n=str.length();
        int m=ptr.length();
        int a[]=kmpPattern(ptr,m);
        
        int index=0,i=0;
        while(i<n && index<m){
            
            if(str.charAt(i)==ptr.charAt(index)){
                
                if(index==m-1){
    
                    System.out.println(i-m+1);
                    index=a[index];
                    i++;
                }else{
                    index++;
                    i++;   
                }
                
            }
            else{
                
                if(index!=0)
                    index=a[index-1];
                else
                    i++;
            }
  
        }
        
    }
    
    static int[] kmpPattern(String str,int n){
        
        
        int a[]=new int[n];
        
        int index=0,i=1;
        
        while(i<n){
            
            if(str.charAt(i)==str.charAt(index)){
                a[i]=index+1;
                i++;
                index++;
            }else{
                
                if(index==0){
                    a[i]=0;
                    i++;
                }
                else{
                    index=a[index-1];
                }
                
            }
            
        }
        
    
    for(int k:a)
    System.out.print(k+" ");
    System.out.println();
        return a;
    }
    
	public static void main (String[] args) {
		
		String str="AABAACAADAABAABA"; 
		String ptr="AABA";
		kmp(str,ptr);
		
	}
}
