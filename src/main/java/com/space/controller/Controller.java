package com.space.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller {

    @RequestMapping(value = "/prepare", method = RequestMethod.GET)
    public ModelAndView prepare() {
        return new ModelAndView("prepare.html");
    }

    @RequestMapping(value = "/diagnosis", method = RequestMethod.GET)
    public ModelAndView diagnosis() {
        return new ModelAndView("diagnosis.html");
    }

    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public ModelAndView check() {
        return new ModelAndView("check.html");
    }
}
