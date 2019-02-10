package ProgrammingKnowledge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
    public void AddTest() {
		MyJunitClass junit = new MyJunitClass();
		int result = junit.add(100, 200);
		assertEquals(300,result);
	}

}
