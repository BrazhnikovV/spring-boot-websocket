package ru.brazhnikov.websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    /**
     * showHomePage -
     * @return String
     */
    @RequestMapping( "/" )
    public String showHomePage() {
        return "index";
    }
}
