/*package whatever //do not write package name here */

import java.util.*;

class NewCharacterSet{
    
    static String newCharacterSet(String s1,String s2){
        
        int n=s2.length();
        String s3="";
        for(int i=0;i<n;i++){
        
        int k=s1.indexOf(s2.charAt(i));
        char k1=(char)('a'+k);
        s3=s3+k1;
        }
        return s3;
    }
        
	public static void main (String[] args) {
		
		String s1="qwertyuiopasdfghjklzxcvbnm";
		Scanner s=new Scanner(System.in);
		String s2=s.next();
		System.out.println(newCharacterSet(s1,s2));
	}
}
