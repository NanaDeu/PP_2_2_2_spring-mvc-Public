package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping()
    public String printCars(@RequestParam(value = "count", required = false) String parameter, ModelMap model) {

        if (parameter == null) {
            model.addAttribute("carsList", Car.getCarsList());
            return "/cars";
        }
        int count = Integer.parseInt(parameter);
        if (count >= 1 & count < Car.getCarsList().size()) {
            model.addAttribute("carsList", CarService.getThatManyCars(count));

        } else if (count > Car.getCarsList().size()) {
            model.addAttribute("carsList", Car.getCarsList());
        }
        return "/cars";
    }
}