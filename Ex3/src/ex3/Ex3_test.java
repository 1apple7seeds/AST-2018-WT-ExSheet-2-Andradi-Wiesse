package ex3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Ex3_test {

	private Ex3 q3;

	@BeforeEach
	void setUp() {
		q3 = new Ex3();
	}

	@AfterEach
	void tearDown() {
		q3 = null;
	}
	
	@Test
	void function_f_kn_test1() {
		assertEquals(0.0122,q3.function_f_kn(1,3),0.0001);
	}
	
	@Test
	void function_f_kn_test2() {
		assertEquals(0.0122,q3.function_f_kn(2,3),0.0001);	
	}
	
	@Test
	void function_f_kn_test3() {
		assertEquals(0.5,q3.function_f_kn(3,3),0.0001);
	}
	
	@Test
	void function_f_kn_test4() {
		assertEquals(0.001369,q3.function_f_kn(10,20),0.0001);
	}

}
