package kg.megacom.restaurantFinal.repo;

import kg.megacom.restaurantFinal.models.Dish;
import org.springframework.data.repository.CrudRepository;

public interface DishRepository extends CrudRepository<Dish,Long> {
}
