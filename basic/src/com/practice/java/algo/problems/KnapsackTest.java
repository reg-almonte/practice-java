package com.practice.java.algo.problems;

import static org.junit.Assert.*;

import org.junit.Test;

public class KnapsackTest {

	@Test
	public void testKnapSack() {
//		int N = 3;
//		int W = 3;
//		int[] values = new int[] {1,2,3};
//		int[] weight = new int[] {4,5,1};
//		assertEquals(3, Knapsack.knapSack(W, weight, values, N));
//		
//		weight = new int[] {4,5,6};
//		assertEquals(0, Knapsack.knapSack(W, weight, values, N));
		
		int N = 3;
		int W = 6;
		int[] values = new int[] {12, 10, 6};
		int[] weight = new int[] {3, 2, 1};
		assertEquals(28, Knapsack.knapSack(W, weight, values, N));

	}

}
