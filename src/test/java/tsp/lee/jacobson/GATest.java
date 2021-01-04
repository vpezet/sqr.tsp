package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class GATest {

	@Test
	/**
	 * GIVEN evolvePopulation
	 * WHEN elitism = true
	 * THEN tour at index 0 of newPopulation = fittest of oldPopulation
	 */
	public void testEvolvePopulation() {
		Population population1 = new Population(5, true);
		Population population2 = new Population(5, false);
		
		population2 = GA.evolvePopulation(population1);
		
		Tour expected = population1.getFittest();
		Tour actual = population2.tours[0];
		assertEquals(expected, actual);
	}

}
