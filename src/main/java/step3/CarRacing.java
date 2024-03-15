package step3;

import java.util.List;

public class CarRacing {
    private Cars cars;

    public CarRacing(int carNumbers, MoveStrategy moveStrategy) {
        cars = new Cars(carNumbers, moveStrategy);
    }

    public CarRacing(int carNumbers, String[] carNames, MoveStrategy moveStrategy) {
        cars = new Cars(carNumbers, carNames, moveStrategy);
    }

    public void moveCars() {
        cars.moveCars();
    }

    public List<Car> getCars() {
        return cars.getCars();
    }

    public List<String> getWinners() {
        return cars.searchWinners();
    }
}