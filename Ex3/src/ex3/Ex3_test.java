package ex3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import ex3.Ex3;

class Ex3_test {

	Ex3 Ex3;

	@BeforeEach
	void setUp() throws Exception {
		Ex3 = new Ex3();
	}

	@AfterEach
	void tearDown() throws Exception {
		Ex3 = null;
	}

	@Test
	void function_f_test() {
		assertEquals(0,Ex3.function_f(new double[] {0,0,0}));
		assertEquals(0.5,Ex3.function_f(new double[] {0.5,0.5,0.5}));
		assertEquals(0.9986,Ex3.function_f(new double[] {0.9,0.9,0.9}),0.0001);	
	}
	
	@Test
	void function_f_kn_test() {
		assertEquals(0.0122,Ex3.function_f_kn(1,3),0.0001);
		assertEquals(0.0122,Ex3.function_f_kn(2,3),0.0001);	
		assertEquals(0.5,Ex3.function_f_kn(3,3),0.0001);
		assertEquals(0.0122,Ex3.function_f_kn(10,20),0.0001);
	}

}
