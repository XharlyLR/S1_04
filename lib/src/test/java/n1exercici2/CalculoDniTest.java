package n1exercici2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculoDniTest {
	
	private CalculoDni calcDni = new CalculoDni();
	
	@ParameterizedTest
	@CsvSource({
	    "68655388, C",
	    "47572951, G",
	    "59935792, T",
	    "91112243, C",
	    "94354612, X",
	    "16836656, N",
	    "71727655, Q",
	    "33956785, E",
	    "48653546, J",
	    "28685235, A",
	    "88888888, Y"
	})
	void testPar(int numsDni, char charsDni) {
		assertEquals(charsDni, calcDni.calculLletra(numsDni));
	}

}
