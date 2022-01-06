package org.ar.twopointer;

import java.util.HashMap;

public class PairSumK {
	public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        int ar[]= {7,9,4,-1,23,10,19,1,5,6};
        int k=33;
        for(int x : ar) {
			/*
			 * if(map.containsKey(x)) {
			 * 
			 * map.put(x, map.get(x)+1); }
			 * 
			 * else map.put(x, 1);
			 */
        	map.put(x, map.getOrDefault(x, 0)+1);
        }
        for(int x :ar) {
        	int key=k-x;
        	if(map.containsKey(key)) {
        		if(key==x) {
        			int freq=map.get(key);
        			if(freq>1) {
        				//return true;
        			}
        				
        		}
        		else {
        			//return true;
        		}
        		
        	}
        }
        //return false;
        
	}
}
