package launchcode.org.codingevents.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.*;




@Controller
public class HomeController {
    @GetMapping
    public String index(){
        return "index";
    }
}
