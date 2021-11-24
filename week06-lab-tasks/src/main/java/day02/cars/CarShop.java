package day02.cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String name;
    private int maxPrice;
    private List<Car> carsForSell = new ArrayList<>();

    public CarShop(String name, int maxPrice) {
        this.name = name;
        this.maxPrice = maxPrice;
    }

    public boolean addCar(Car car) {
        boolean isCheap = maxPrice >= car.getPrice();

        if (isCheap) {
            carsForSell.add(car);
        }

        return isCheap;
    }

    public int sumCarPrice() {
        int sum = 0;

        for (Car c : carsForSell) {
            sum += c.getPrice();
        }

        return sum;
    }

    public int numberOfCarsCheaperThan(int price) {
        int amount = 0;

        for (Car c : carsForSell) {
            if (price >= c.getPrice()){
                amount ++;
            }
        }

        return amount;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> results = new ArrayList<>();

        for (Car c : carsForSell) {
            if (brand.equals(c.getBrand())) {
                results.add(c);
            }
        }

        return results;
    }

    public String getName() {
        return name;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCarsForSell() {
        return new ArrayList<>(carsForSell);
    }
}
