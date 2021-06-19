package kg.megacom.restaurantFinal.models;

import javax.persistence.*;

@Entity

public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String menuType;
}
