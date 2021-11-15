package day01;


import java.util.ArrayList;
import java.util.List;

public class PositiveNumberContainer {
    private List<Double> numbers = new ArrayList<>();

    public void addNumber(double number){
        numbers.add(number);
    }

    public List<Double> getNumbers() {
        return new ArrayList<>(numbers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        for (double d : numbers) {
            if (isFirst) {
                isFirst = false;
            }
            else {
                sb.append(", ");
            }
            sb.append(d);
        }
        return sb.toString();
    }
}
