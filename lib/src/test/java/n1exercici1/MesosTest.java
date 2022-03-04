package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MesosTest {
	
	 private Mesos mainC = new Mesos();
	 
	@Test
	void testMesos() {
//		assertEquals(12, mainC.mesos.size());
		assertEquals(12, mainC.arrayMesos().size());
	}
	
	@Test
	void testNull() {
//		assertNotNull(mainC.mesos);
		assertNotNull(mainC.arrayMesos());
	}
	
	@Test
	void testAgost() {
//		assertEquals("Agost", mainC.mesos.get(7));
		assertEquals("Agost", mainC.arrayMesos().get(7));
	}

}
