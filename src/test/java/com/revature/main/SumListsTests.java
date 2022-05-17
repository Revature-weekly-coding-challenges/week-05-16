package com.revature.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.revature.main.SumLists.backwardSumLists;
import static com.revature.main.SumLists.forwardSumLists;


import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SumListsTests {
	@Test
	public void backwardEmptyLists() {
		LinkedList<Integer> a = new LinkedList<>();
		LinkedList<Integer> b = new LinkedList<>();
		
		assertEquals(0, backwardSumLists(a, b));
	}
	
	@Test
	public void backwardOneEmptyList() {
		LinkedList<Integer> a = new LinkedList<>();
		LinkedList<Integer> b = new LinkedList<>(List.of(1, 2, 3));
		
		assertEquals(321, backwardSumLists(a, b));
	}
	
	@Test
	public void backwardNoEmptyLists() {
		LinkedList<Integer> a = new LinkedList<>(List.of(4, 5, 6));
		LinkedList<Integer> b = new LinkedList<>(List.of(1, 2, 3));
		
		assertEquals(975, backwardSumLists(a, b));
	}
	
	@Test
	public void backwardEmptyNodes() {
		Node<Integer> a = null;
		Node<Integer> b = null;
		
		assertEquals(0, backwardSumLists(a, b));
	}
	
	@Test
	public void backwardOneEmptyNodes() {
		Node<Integer> a = null;
		Node<Integer> b = new Node<>(1);
		
		Node<Integer> b1 = new Node<>(2);
		b.setNext(b1);
		Node<Integer> b2 = new Node<>(3);
		b1.setNext(b2);
		
		assertEquals(321, backwardSumLists(a, b));
	}
	
	@Test
	public void backwardNoEmptyNodes() {
		Node<Integer> a = new Node<>(4);
		Node<Integer> b = new Node<>(1);
		
		Node<Integer> b1 = new Node<>(2);
		b.setNext(b1);
		Node<Integer> b2 = new Node<>(3);
		b1.setNext(b2);
		
		Node<Integer> a1 = new Node<>(5);
		a.setNext(a1);
		
		assertEquals(375, backwardSumLists(a, b));
	}
	
	@Test
	public void forwardEmptyLists() {
		LinkedList<Integer> a = new LinkedList<>();
		LinkedList<Integer> b = new LinkedList<>();
		
		assertEquals(0, forwardSumLists(a, b));
	}
	
	@Test
	public void forwardOneEmptyList() {
		LinkedList<Integer> a = new LinkedList<>();
		LinkedList<Integer> b = new LinkedList<>(List.of(1, 2, 3));
		
		assertEquals(123, forwardSumLists(a, b));
	}
	
	@Test
	public void forwardNoEmptyLists() {
		LinkedList<Integer> a = new LinkedList<>(List.of(3, 4, 5, 6));
		LinkedList<Integer> b = new LinkedList<>(List.of(1, 2, 3));
		
		assertEquals(3579, forwardSumLists(a, b));
	}
	
	@Test
	public void forwardEmptyNodes() {
		Node<Integer> a = null;
		Node<Integer> b = null;
		
		assertEquals(0, forwardSumLists(a, b));
	}
	
	@Test
	public void forwardOneEmptyNode() {
		Node<Integer> a = null;
		Node<Integer> b = new Node<>(1);
		
		Node<Integer> b1 = new Node<>(2);
		b.setNext(b1);
		Node<Integer> b2 = new Node<>(3);
		b1.setNext(b2);
		
		assertEquals(123, forwardSumLists(a, b));
	}
	
	@Test
	public void forwardNoEmptyNodes() {
		Node<Integer> a = new Node<>(3);
		Node<Integer> b = new Node<>(1);
		
		Node<Integer> a1 = new Node<>(4);
		a.setNext(a1);
		Node<Integer> a2 = new Node<>(5);
		a1.setNext(a2);
		Node<Integer> a3 = new Node<>(6);
		a2.setNext(a3);
		
		Node<Integer> b1 = new Node<>(2);
		b.setNext(b1);
		Node<Integer> b2 = new Node<>(3);
		b1.setNext(b2);
		
		assertEquals(3579, forwardSumLists(a, b));
	}
}
