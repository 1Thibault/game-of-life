package com.wakaleo.gameoflife.webtests.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

 /**
 * Wakaleo Consulting - John Ferguson Smart
 * Game of life, demonstration application for Jenkins: The Definitive Guide
 *
 * HomePageController.java
 * Controller to navigate to the main page
 */
@Controller
public class Dummy {
    @RequestMapping("")
    public ModelAndView index() {
        return new ModelAndView("home");
    }

	
}
