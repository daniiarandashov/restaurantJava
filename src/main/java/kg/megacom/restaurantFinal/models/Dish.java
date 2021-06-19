package kg.megacom.restaurantFinal.models;

import javax.persistence.*;
import java.util.List;


@Entity

public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String dish_name;
    private boolean isVegeterian;
    private boolean isActive;
    private int calories;
    private double price;


    public Dish() {
    }

    public Dish(String dish_name, boolean isVegeterian, int calories, double price) {
        this.dish_name = dish_name;
        this.isVegeterian = isVegeterian;
        this.calories = calories;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDish_name() {
        return dish_name;
    }

    public void setDish_name(String dish_name) {
        this.dish_name = dish_name;
    }

    public boolean isVegeterian() {
        return isVegeterian;
    }

    public void setVegeterian(boolean vegeterian) {
        isVegeterian = vegeterian;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
