import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddClassTest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	void testAdd() {
		AddClass objAdd=new AddClass();
		int expected = 8;
		int actual=objAdd.addMethod(4, 4);
		assertEquals(expected,actual);
	}

}
