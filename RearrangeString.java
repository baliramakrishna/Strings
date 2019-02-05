/*package whatever //do not write package name here */

import java.util.*;

public class Rearrange  implements Comparator {
    static int MAX_CHAR =26;
    @Override
    public int compare(Object o1,Object o2){
     
     Key k1=(Key)o1;
     Key k2=(Key)o2;
        if(k1.freq<k2.freq)
        return 1;
        else if(k1.freq>k2.freq)
        return -1;
        else
        return 0;
        
        
    }
    
    
    
    static String rearrange(String s){
        
        int n=s.length();
        int a[]=new int[MAX_CHAR];
        
        for(int i=0;i<n;i++)
            a[s.charAt(i)-'a']++;
        
        PriorityQueue<Key> p=new PriorityQueue<>(new Rearrange());
        
        for(char i='a';i<='z';i++){
            
            int val=a[i-'a'];
            if(val>0)
            p.add(new Key(val,i));
        }
        String s1="";
        Key prev=new Key(-1,'&');
        
        while(!p.isEmpty()){
            
            Key k1=p.peek();
            p.poll();
            s1=s1+k1.c;
            if(prev.freq>0)
            p.add(prev);
            
            (k1.freq)--;
            prev=k1;
            
            
        }
        
        if(n==s1.length())
        return s1;
        else
        return "not possible";
    }
    
	public static void main (String[] args) {
	
	 String s="aaabb";
	 System.out.println(rearrange(s));
	
	}
}

 class Key{
    
    char c;
    int freq;
    
    Key(int freq,char c){
        
        this.c=c;
        this.freq=freq;
    }
    
}

