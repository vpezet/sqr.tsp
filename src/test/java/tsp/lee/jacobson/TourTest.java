package tsp.lee.jacobson;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TourTest {

	@Test
	/**
	 * GIVEN getDistance
	 * WHEN tour.size = 3 & city1(0;0), city2(1;3) city3(3;6)
	 * THEN 13.4760
	 */
	public void testGetDistance() {
			City city1 = new City(0,0);
			City city2 = new City(1,3);
			City city3 = new City(3,6);
			ArrayList<City> arrayOfCities = new ArrayList<City>(){{
				add(city1);
				add(city2);
				add(city3);
			}};
				
			Tour tour = new Tour(arrayOfCities);
			
			double delta = 0.0001;
			double expected = 13.4760;
			double actual = tour.getDistance();
			assertEquals(expected, actual, delta);
	}
	//Erreur détectée -> la fonction travaille avec la variable distance qui est une valeur entière, ce qui conduit à des erreurs de résultat
	//Solution -> changer le type des variables distance et tourDistance et le type de renvoi de la fonction getDistance en double
}
