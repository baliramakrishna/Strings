/*package whatever //do not write package name here */

import java.util.*;

class MnimumSumSquares implements Comparator<Integer>{
    
    static int INT_MAX=26;
    
    @Override
    public int compare(Integer I1,Integer I2){
        
        if(I1<I2)
        return 1;
        else if(I1>I2)
        return -1;
        else
        return 0;
        
    }
    
    static int minimumSum(String s,int k){
        
        int a[]=new int[INT_MAX];
        int n=s.length();
        for(int i=0;i<n;i++)
        a[s.charAt(i)-'a']++;
        
        PriorityQueue<Integer> p=new PriorityQueue<>(new  MnimumSumSquares() );
        
        for(int i=0;i<INT_MAX;i++){
        
            int v=a[i];
            if(v!=0)
            p.add(v);
        }
        
        while(k>0){
            
            int x=p.peek();
            p.poll();
            x--;
            k--;
            p.add(x);
            
            
        }
        int sum=0;
        for(int i:p){
        sum+=(i*i);
        }
        
        return sum;
        
    }
    
	public static void main (String[] args) {
		
		String s="abcccddd";
		System.out.println(minimumSum(s,1));
	}
}
