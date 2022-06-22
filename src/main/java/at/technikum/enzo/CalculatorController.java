package at.technikum.enzo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CalculatorController {
    @RequestMapping("/multiply")
    public int sum(@RequestParam int a, @RequestParam int b){
        return a * b;
    }
}

