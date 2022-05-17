package com.revature.main;

import java.util.LinkedList;

public class SumLists {
	public static long backwardSumLists(LinkedList<Integer> a, LinkedList<Integer> b) {
		long result = 0;
		
		for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
			if (i < a.size()) result += Math.pow(10, i) * a.get(i);
			
			if (i < b.size()) result += Math.pow(10, i) * b.get(i);
		}
		
		return result;
	}
	
	public static long backwardSumLists(Node<Integer> a, Node<Integer> b) {
		long result = 0;
		
		Node<Integer> curA = a;
		Node<Integer> curB = b;
		
		int i = 0;
		while (a != null || b != null) {
			if (a != null) {
				result += Math.pow(10, i) * a.getElement();
				a = a.getNext();
			}
			
			if (b != null) {
				result += Math.pow(10, i) * b.getElement();
				b = b.getNext();
			}
			i++;
		}
		
		return result;
	}
	
	public static long forwardSumLists(LinkedList<Integer> a, LinkedList<Integer> b) {
		long result = 0;
		
		for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
			if (i < a.size()) result += Math.pow(10, i) * a.get(a.size() - 1 - i);
			
			if (i < b.size()) result += Math.pow(10, i) * b.get(b.size() - 1 - i);
		}
		
		return result;
	}
	
	public static long forwardSumLists(Node<Integer> a, Node<Integer> b) {
		long result = 0;
		int asize = 0;
		int bsize = 0;
		
		Node<Integer> tempa = a;
		Node<Integer> tempb = b;
		while (tempa != null || tempb != null) {
			if (tempa != null) {
				asize++;
				tempa = tempa.getNext();
			}
			if (tempb != null) {
				bsize++;
				tempb = tempb.getNext();
			}
		}
		
		for (int i = 0; i < Math.max(asize, bsize); i++) {
			System.out.println(i + ", " + asize + ", " + bsize);
			
			if (i < asize) {
				result += Math.pow(10, asize - 1 - i) * a.getElement();
				a = a.getNext();
			}
			
			if (i < bsize) {
				result += Math.pow(10, bsize - 1 - i) * b.getElement();
				b = b.getNext();
			}
		}
		
		return result;
	}
}
