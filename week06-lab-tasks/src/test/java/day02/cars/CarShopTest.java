package day02.cars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CarShopTest {
    Car car1 = new Car("Toyota", 1.2, Color.BLACK,
            2_300_000);
    Car car2 = new Car("Lamborghini", 5.2, Color.BLACK,
            10_300_000);
    Car car3 = new Car("Suzuki", 1.4, Color.RED,
            1_500_000);
    Car car4 = new Car("Toyota", 1.4, Color.GREY,
            2_700_000);
    CarShop carShop = new CarShop("Best Car", 10_000_000);

    @Test
    void testAddCar() {
        assertTrue(carShop.addCar(car1));
        assertFalse(carShop.addCar(car2));
        assertTrue(carShop.addCar(car3));
        assertTrue(carShop.addCar(car4));

        assertEquals(Arrays.asList(car1, car3, car4), carShop.getCarsForSell());
    }

    @Test
    void testSumCarPrice() {
        carShop.addCar(car1);
        carShop.addCar(car3);
        carShop.addCar(car4);

        assertEquals(6_500_000, carShop.sumCarPrice());
        car1.decreasePrice(10);

        assertEquals(6_270_000, carShop.sumCarPrice());
    }

    @Test
    void testNumberOfCarsCheaperThan() {
        carShop.addCar(car1);
        carShop.addCar(car3);
        carShop.addCar(car4);

        assertEquals(1, carShop.numberOfCarsCheaperThan(2_000_000));
        assertEquals(0, carShop.numberOfCarsCheaperThan(1_000_000));
    }

    @Test
    void testCarsWithBrand() {
        carShop.addCar(car1);
        carShop.addCar(car3);
        carShop.addCar(car4);

        assertEquals(2, carShop.carsWithBrand("Toyota").size());
        assertEquals(0, carShop.carsWithBrand("BMW").size());
    }
}
