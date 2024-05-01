package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//hace que los response del server sean en formato json
@RestController
public class operacionController {
    @GetMapping("/suma")
    public float suma(@RequestParam float a, @RequestParam float b){
        return a + b;
    }

    @GetMapping("/resta")
    public float resta(@RequestParam float a, @RequestParam float b){
        return a - b;
    }
}
