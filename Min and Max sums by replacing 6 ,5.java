/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    static int minSum(int x1,int x2){
        
        String s1=Integer.toString(x1);
        String s2=Integer.toString(x2);
        s1=s1.replaceAll("6","5");
        s2=s2.replaceAll("6","5");
        
        return Integer.parseInt(s1)+Integer.parseInt(s2);
    }
    static int maxSum(int x1,int x2){
        
        String s1=Integer.toString(x1);
        String s2=Integer.toString(x2);
        s1=s1.replaceAll("5","6");
        s2=s2.replaceAll("5","6");
        
        return Integer.parseInt(s1)+Integer.parseInt(s2);
    }
	public static void main (String[] args) {
		
		int x1=645;
		int x2=666;
		System.out.println(minSum(x1,x2));
		System.out.println(maxSum(x1,x2));
		
	}
}
