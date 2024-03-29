package com.visa.prj.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class Arrayutiltest {

	@Test
	public void testGetsum() {
		int[] data= {5,4,3,2,1};
		int expected=15;
		assertEquals(expected, Arrayutil.getsum(data));
	}

	@Test
	public void testSort() {
		int[] data= {5,4,3,2,1};
		int[] expected= {1,2,3,4,5};
		Arrayutil.sort(data);
		assertArrayEquals(expected,data);
	}

	@Test
	public void testGetcount() {
		int[] data= {5,4,3,2,3};
		int expected= 2;
		assertEquals(expected,Arrayutil.getcount(data,3));
		
	    data= new int[] {5,4,3,3,3};
		expected= 3;
		assertEquals(expected,Arrayutil.getcount(data,3));
	}
	@Test
	public void testconvert() {
		int[][] data= {{1,2,3},{4,5,6},{7,8,9}};
		int[] expec= {1,2,3,4,5,6,7,8,9};
		assertArrayEquals(expec,Arrayutil.convert(data));
		
	}
	

}
