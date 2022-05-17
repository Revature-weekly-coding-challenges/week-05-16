package com.revature.main;

public class StackMin<E extends Comparable<E>> {
	private class Node<E> {
		private E element;
		private Node<E> next;
		private E min;
		
		public Node(E element) {
			this.element = element;
			this.next = null;
		}
		
		public E getElement() {
			return element;
		}
		
		public Node<E> getNext() {
			return next;
		}
		
		public E getMin() {
			return min;
		}
		
		public void setElement(E element) {
			this.element = element;
		}
		
		public void setNext(Node<E> next) {
			this.next = next;
		}
		
		public void setMin(E min) {
			this.min = min;
		}
	}
	
	private Node<E> head;
	private int size;
	
	public StackMin() {
		head = null;
		size = 0;
	}
	
	public void push(E element) {
		if (element == null) return;
		
		Node<E> node = new Node<>(element);
		
		if (size == 0) {
			node.setMin(element);
			
			head = node;
		} else {
			node.setMin(element.compareTo(head.getMin()) < 0 ? element : head.getMin());
			
			Node<E> temp = head;
			head = node;
			node.setNext(temp);
		}
		
		size++;
	}
	
	public E pop() {
		E element = null;
		
		if (size != 0) {
			element = head.getElement();
			head = head.getNext();
			size--;
		}
		
		return element;
	}
	
	public E min() {
		if (head == null) return null;
		
		return head.getMin();
	}
}