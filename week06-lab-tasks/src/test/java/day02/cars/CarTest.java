package day02.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    Car car1 = new Car("Toyota", 1.2, Color.BLACK,
            2_300_000);
    Car car2 = new Car("Lamborghini", 5.2,
            Color.BLACK, 10_300_000);

    @Test
    void testDecreasePrice() {
        car1.decreasePrice(10);
        assertEquals(2_070_000, car1.getPrice());

        car2.decreasePrice(15);
        assertEquals(8_755_000, car2.getPrice());
    }
}