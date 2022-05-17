package com.revature.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StackMinTests {
	@Test
	public void emptyStack() {
		StackMin<Integer> stack = new StackMin<>();
		
		assertEquals(null, stack.min());
	}
	
	@Test
	public void testPushOne() {
		StackMin<Integer> stack = new StackMin<>();
		
		stack.push(1);
		
		assertEquals(1, stack.min());
	}
	
	@Test
	public void testPushTwo() {
		StackMin<Integer> stack = new StackMin<>();
		
		stack.push(1);
		stack.push(-1);
		
		assertEquals(-1, stack.min());
	}
	
	@Test
	public void testPushPop() {
		StackMin<Integer> stack = new StackMin<>();
		
		stack.push(1);
		
		assertEquals(1, stack.pop());
		assertEquals(null, stack.min());
	}
	
	@Test
	public void testPushTwoPop() {
		StackMin<Integer> stack = new StackMin<>();
		
		stack.push(1);
		stack.push(-1);
		
		assertEquals(-1, stack.pop());
		assertEquals(1, stack.min());
	}
	
	@Test
	public void testStandardStack() {
		StackMin<Integer> stack = new StackMin<>();
		
		stack.push(5);
		stack.push(7);
		stack.push(2);
		stack.push(3);
		
		assertEquals(2, stack.min());
		assertEquals(3, stack.pop());
		assertEquals(2, stack.pop());
		assertEquals(5, stack.min());
		
		stack.push(6);
		stack.push(10);
		
		assertEquals(5, stack.min());
	}
}
