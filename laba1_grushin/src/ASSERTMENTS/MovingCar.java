package ASSERTMENTS;

import java.util.Objects;

public class MovingCar {
    private String color_of_traffic_lights;
    private int transmission ;
    MovingCar(String color_of_traffic_lights, int transmission){
        this.transmission = transmission;
        this.color_of_traffic_lights = color_of_traffic_lights;
    }
    public void Go(){
       assert this.transmission == 1 : "Вы не можете начать движение не с первой передачи";
       assert Objects.equals(this.color_of_traffic_lights, "Green") : "Вы едите на красный свет";
       System.out.println("Вы поехали!");
    }

}
