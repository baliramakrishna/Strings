/*package whatever //do not write package name here */

import java.io.*;

class  Count{
    
    public static int count(int n){
        
        
        int sum=0;
        
        int fact[]=new int[n+1];
        fact[0]=1;
        
        for(int i=1;i<=n;i++)
        fact[i]=fact[i-1]*i;
    
        for(int i=0;i<=1;i++){
            
            for(int j=0;j<=2;j++){
                
              int k=n-(i+j);    
              sum+= ((fact[n])/(fact[i]*fact[j]*fact[k]));
                
            }
            
        }
        
       return sum; 
    }
    
	public static void main (String[] args) {
		
		 System.out.println(count(4));
		 
		 
	}
}
