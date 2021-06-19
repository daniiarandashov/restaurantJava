package kg.megacom.restaurantFinal.controllers;

import kg.megacom.restaurantFinal.models.Dish;
import kg.megacom.restaurantFinal.repo.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class DishController {

    @Autowired
    private DishRepository dishRepository;

    @GetMapping("/dish")
    public String dish(Model model){
        Iterable<Dish>dishes= dishRepository.findAll();
        model.addAttribute("dishes",dishes);
        return "dish";
    }

    @GetMapping("/dish/add")
    public String dishAdd(Model model){
        return "dish-add";
    }

    @PostMapping("/dish/add")
    public String dishPostAdd(@RequestParam String dish_name,@RequestParam boolean isVegeterian,@RequestParam int calories,@RequestParam double price, Model model){
        Dish dish = new Dish(dish_name,isVegeterian,calories,price);
        dishRepository.save(dish);
        return "redirect:/dish";

        // @ModelAttribite("dish") Dish dish
    }




}
