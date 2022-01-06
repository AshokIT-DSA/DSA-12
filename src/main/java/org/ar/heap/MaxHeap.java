package org.ar.heap;

import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.List;

public class MaxHeap {
    List<Integer> list;
    int size;
    public MaxHeap(int capacity) {
    	list=new ArrayList<Integer>(capacity);
    }
    public void insert(int x) {
    	list.add(x);
    	fixAboveHeap(size);
    	size++;
    	
    }
    public int delete(int index) {
    	if(size==0) {
    		//throw Exception
    	}
    	int deletedValue=list.get(index);
    	int parent=getParent(index);
    	list.set(index,list.get(size-1));
    	if(index==0 || list.get(index)<list.get(parent)) {
    		fixBelowHeap(index,size-1);
    	}
    	else {
    		fixAboveHeap(index);
    	}
    	size--;
    	return deletedValue;
    }
    private void fixBelowHeap(int index, int lastIndex) {
		// TODO Auto-generated method stub
    	
		int childToSwap;
		while(index<=lastIndex) {
			int leftChild=getChild(index, true);
			int rightChild=getChild(index, false);
			if(leftChild<=lastIndex) {
				if(rightChild>lastIndex) {
					childToSwap=leftChild;
				}
				else {
					childToSwap=list.get(leftChild)>list.get(rightChild)?
							leftChild:rightChild;
					
				}
				if(list.get(index)<list.get(childToSwap)) {
					int temp=list.get(index);
					list.set(index, list.get(childToSwap));
					list.set(childToSwap, temp);
				}
				else {
					break;
				}
				index=childToSwap;
			}
			else {
				break;
			}
		}
	}
	public void sort() {
    	
    }
    
	private void fixAboveHeap(int index) {
		// TODO Auto-generated method stub
		int value=list.get(index);
		while(index>0 && value>list.get(getParent(index))) {
			list.set(index,list.get(getParent(index)));
			list.set(getParent(index), value);
			index=getParent(index);
		}
		
	}
	public int getParent(int index) {
		return (index-1)/2;
	}
	public int getChild(int index,boolean leftChild) {
		return  2*index+(leftChild?1:2);
	}
			
}
