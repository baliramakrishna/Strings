import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {  
     static TreeSet<String> t=new TreeSet<>();
     
     static void print(HashMap<String,Integer> h,String pat,String res){
         
         int n=pat.length();
         if(n==0){
             res=res.trim();
             t.add(res);
             return;
         }
         
         for(String k:h.keySet()){
             int m=h.get(k);
             
             if(m>n)
             continue;
             else if(n>=m){
                 
                 if((pat.substring(0,m)).equals(k))
                 print(h,pat.substring(m),res+" "+k);
                 else
                 continue;
                 
             }
             
         }
         
     }
     
	public static void main (String[] args) throws IOException
	 {
	   
	   Scanner s=new Scanner(System.in);
	   int k=s.nextInt();
  
        while (k-- > 0) { 
          t=new TreeSet<String>();
           int n=s.nextInt();
           
           HashMap<String,Integer> h=new HashMap<>();
           for(int i=0;i<n;i++){
               String str=s.next();
               h.put(str,str.length());
           }
           String pat=s.next();
           
           print(h,pat,"");
           
           StringBuffer b=new StringBuffer();
           
           for(String str1:t)
           b.append("("+str1+")");
           
           System.out.println(b);
        
        }
	  
	  
	 }
}
