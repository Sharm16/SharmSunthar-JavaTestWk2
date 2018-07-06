package code;

import static org.junit.Assert.*;

import org.junit.Test;

public class OfflineExercisesTest {

	OfflineExercises o = new OfflineExercises();

	@Test
	public void doubleCharTest() {

		assertEquals("TThhee", o.doubleChar("The"));
		assertEquals("AAAAbbbb", o.doubleChar("AAbb"));
		assertEquals("HHii--TThheerree", o.doubleChar("Hi-There"));

	}
	
	@Test
	public void getallSandwichTest() {

	
		assertEquals("jam", o.getSandwich("breadjambread"));
		assertEquals("jam", o.getSandwich("xxbreadjambreadyy"));
		assertEquals("", o.getSandwich("xxbreadyy"));
		assertEquals("honey", o.getSandwich("xxbreadhoneybreadyy"));

	}
	

	
	@Test
	public void evenlySpacedTest() {

		assertEquals(true, o.evenlySpaced(2,4,6));
		assertEquals(true, o.evenlySpaced(4,6,2));
		assertEquals(false, o.evenlySpaced(4,6,3));

	}
	
	@Test
	public void nTwiceTest() {

		assertEquals("Helo", o.nTwice("Hello", 2));
		assertEquals("Choate", o.nTwice("Chocolate", 3));
		assertEquals("Ce", o.nTwice("Chocolate", 1));

	}
	@Test
	public void endslyTest() {

		assertEquals(true, o.endsly("oddly"));
		assertEquals(false, o.endsly("y"));
		assertEquals(false, o.endsly("oddy"));
		assertEquals(false, o.endsly("l"));

	}
	
	@Test
	public void stringCleanTest() {

	
		assertEquals("yza", o.stringClean("yyzzza"));
		assertEquals("abcd", o.stringClean("abbbcdd"));
		assertEquals("Helo", o.stringClean("Hello"));
		

	}
	@Test
	public void fibonacciTest() {
		
		assertEquals(0,o.fibonacci(0));
		assertEquals(1,o.fibonacci(1));
		assertEquals(1,o.fibonacci(2));
		assertEquals(2,o.fibonacci(3));
		assertEquals(3,o.fibonacci(4));
		assertEquals(5,o.fibonacci(5));
		assertEquals(8,o.fibonacci(6));
		assertEquals(75025,o.fibonacci(25));

	}
	
	@Test
public void bunnyEarsTest() {
		
		assertEquals(0,o.bunnyEars(0));
		assertEquals(2,o.bunnyEars(1));
		assertEquals(4,o.bunnyEars(2));
		assertEquals(8,o.bunnyEars(4));
		assertEquals(32,o.bunnyEars(16));
		

	}
	
	@Test
public void superBlock() {
		
		assertEquals(2,o.superBlock("jeffbert"));
		assertEquals(3,o.superBlock("abbCCCddBBBxx"));
		assertEquals(0,o.superBlock(""));
		

	}
}
	
