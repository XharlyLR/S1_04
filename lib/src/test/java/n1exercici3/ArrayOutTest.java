package n1exercici3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayOutTest {
	
	private ArrayOut arrOut = new ArrayOut();
	
	@Test
	void test() {
		assertThrows(IndexOutOfBoundsException.class, () -> {
			arrOut.arrayO();
		});
	}

}
