package ProgrammingKnowledge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcatTest {

	@Test
  public void ConcatTest() {
		MyJunitClass junit = new MyJunitClass();
		String result = junit.ConCat("Hello", "World");
		assertEquals("HelloWorld",result);
		
	}

}
