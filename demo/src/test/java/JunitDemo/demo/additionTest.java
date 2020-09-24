package JunitDemo.demo;

import junit.framework.TestCase;

public class additionTest extends TestCase{

	public void testAddition() {
		additionClass addClass = new additionClass();
		assertEquals(2,addClass.addOne(1));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
