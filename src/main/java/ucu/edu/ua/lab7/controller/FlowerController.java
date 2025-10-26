package ucu.edu.ua.lab7.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ucu.edu.ua.lab7.flower.store.Flower;
import ucu.edu.ua.lab7.flower.store.FlowerColor;
import ucu.edu.ua.lab7.flower.store.FlowerType;


@RestController
public class FlowerController {
    
    @GetMapping("/flowers")
    public List<Flower> getFlowers() {
        return List.of (
            new Flower(FlowerColor.BLUE, 100, 10, FlowerType.TULIP)
        );
    }
}
