/*package whatever //do not write package name here */

import java.util.*;

class GFG {
    
    static int sum(String str){
        
        int result=0,fresult=0;
        Stack<Integer> s=new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            
            if(isDigit(str.charAt(i))){
                s.push(str.charAt(i)-'0');
            }else{
                while(!s.isEmpty())
                result=(result*10)+s.pop();
                
                fresult+=result;
                result=0;
            }
            
        }
        
        while(!s.isEmpty())
        result=(result*10)+s.pop();
        
        return fresult+result;
        
    }
    static boolean isDigit(char ch){
        
        if(ch>='0' && ch<='9')
        return true;
        else 
        return false;
        
    }
	public static void main (String[] args) {
		
		String s="1abc2x30yz67";
		System.out.println(sum(s));
		
	}
}
