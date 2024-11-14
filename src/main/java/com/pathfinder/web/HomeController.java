package com.pathfinder.web;

import com.pathfinder.model.Route;
import com.pathfinder.service.RouteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {
    private final RouteService routeService;

    @Autowired
    public HomeController(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping("/")
    public String home(Model model) {
        Route route = routeService.getMostCommented();
        log.info("Most commented route is: {}", route.getName());

        model.addAttribute("mostCommented", route);
        return "index";
    }
}
