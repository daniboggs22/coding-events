package launchcode.org.codingevents.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework

@Controller
@RequestMapping("events")
public class EventController {
    @GetMapping
    public String displayAllEvents(Model model){
        List<String> events = new ArrayList<>();
        events.add("Code With Pride");
        events.add("Strange Loop");
        events.add("Apple WWDC");
        events.add("SpringOne Platform");
        model.addAttribute("events", events);
        return "events/index";

    }


}
