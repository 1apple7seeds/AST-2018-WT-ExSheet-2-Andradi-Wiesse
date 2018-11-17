package ex1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Ex1_test {

	private Ex1 q1;

	@BeforeEach
	public void setUp() {
		q1 = new Ex1();
	}

	@AfterEach
	public void tearDown() {
		q1 = null;
	}

	@Test
	public void prime_int_test() {
		final int expected = 541;
        final int actual = q1.primes_int(100, false);
        assertEquals(actual, expected);
	}
	
	@Test
	public void time_int_test() {
		final double expected = 8;
        final double actual = q1.time_int(0);
        assertEquals(actual, expected, 1);
	}

}
