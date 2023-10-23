package sk.tmconsulting.datafromrestcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping("/m1")
    public String m1() {
        return "Hello, my first rest controller app!";
    }
}
