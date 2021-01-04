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

	@Test
	/**
	 * GIVEN distanceTo
	 * WHEN position of city1 = 1;2 and position of cityToTest = 4;3
	 * THEN 3.1623
	 */
	public void testDistanceTo_12_to_43() {
		City city1 = new City(1,2);
		City cityToTest = new City(4,3);
		double delta = 0.0001;
		double expected = 3.1623;
		double actual = city1.distanceTo(cityToTest);
		assertEquals(expected, actual, delta);
	}

	@Test
	/**
	 * GIVEN distanceTo
	 * WHEN position of city1 = 0;0 and position of cityToTest = -4;3
	 * THEN 5
	 */
	public void testDistanceTo_00_to_minus43() {
		City city1 = new City(0,0);
		City cityToTest = new City(-4,3);
		double delta = 0.0001;
		double expected = 5;
		double actual = city1.distanceTo(cityToTest);
		assertEquals(expected, actual, delta);
	}

	@Test
	/**
	 * GIVEN distanceTo
	 * WHEN position of city1 = 1;2 and position of cityToTest = -4;-3
	 * THEN 7.0711
	 */
	public void testDistanceTo_12_to_minus4minus3() {
		City city1 = new City(1,2);
		City cityToTest = new City(-4,-3);
		double delta = 0.0001;
		double expected = 7.0711;
		double actual = city1.distanceTo(cityToTest);
		assertEquals(expected, actual, delta);
	}
}
