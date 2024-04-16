package web.dao;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Tesla", "Black", 652));
        cars.add(new Car("BMW", "Silver", 763));
        cars.add(new Car("Toyota", "White", 375));
        cars.add(new Car("Nissan", "Red", 120));
        cars.add(new Car("Honda", "Black", 322));
    }

    @Override
    public List<Car> index(int count) {
        return cars.stream().limit(Math.abs(count)).collect(Collectors.toList());
    }
}
