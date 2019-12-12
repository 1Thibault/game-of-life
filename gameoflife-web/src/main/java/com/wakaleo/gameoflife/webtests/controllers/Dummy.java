package com.wakaleo.gameoflife.webtests.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Dummy {
    @RequestMapping("")
    public ModelAndView index() {
        return new ModelAndView("home");
    }

	
}
