package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarServiceImpl;


@Controller
public class CarController {

    private CarServiceImpl cars = new CarServiceImpl();

    @Autowired
    public CarController(CarServiceImpl cars) {
        this.cars = cars;
    }

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", required = false) int count, ModelMap model) {
        model.addAttribute("cars",cars.index(count));
        return "cars";
    }
}
