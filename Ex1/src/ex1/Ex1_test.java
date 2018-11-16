package ex1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Ex1_test {
	
	private Ex1 q1;

	@BeforeEach
	void setUp() {
		q1 = new Ex1();
	}

	@AfterEach
	void tearDown(){
		q1 = null;
	}
	
	@Test
	void prime_int_test() {
		fail("Not yet implemented");
	}
	
	@Test
	void time_prime_test() {
		fail("Not yet implemented");
	}
	
	@Test
	void time_int_test() {
		fail("Not yet implemented");
	}

}
