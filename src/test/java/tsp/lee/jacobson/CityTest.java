package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	@Test
	/**
	 * GIVEN distanceTo
	 * WHEN position of city1 = 0;0 and position of cityToTest = 1;1
	 * THEN 1.4142
	 */
	public void testDistanceTo_00_to_11() {
			City city1 = new City(0,0);
			City cityToTest = new City(1,1);
			double delta = 0.0001;
			double expected = 1.4142;
			double actual = city1.distanceTo(cityToTest);
			assertEquals(expected, actual, delta);
	}
	
	@Test
	/**
	 * GIVEN distanceTo
	 * WHEN position of city1 = 3;5 and cityToTest is city1
	 * THEN 0
	 */
	public void testDistanceTo_self() {
			City city1 = new City(3,5);
			double delta = 0.0001;
			double expected = 0;
			double actual = city1.distanceTo(city1);
			assertEquals(expected, actual, delta);
	}
}
