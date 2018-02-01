package com.cy.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResumeController {

    @Autowired
    ResumeRepository resumeRepository;



    @RequestMapping("/")
    public String listEducations();


    @RequestMapping("/")
    public String listExperiences();

}
