package x;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void normal() throws Exception {
		
		Square s = new Square (10);
		assertNotNull(s);
		
		//fail("Not yet implemented");
	}
	
//	@Test
//	void zero () throws Exception {
//		Assertions.assertThrows(Exception.class, () -> {
//			Square s = new Square (0);
//		  });
//		
//		
//	}

}
