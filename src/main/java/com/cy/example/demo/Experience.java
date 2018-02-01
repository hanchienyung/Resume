package com.cy.example.demo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Experience {
    @NotNull
    @Size(min = 2)
    private String experience_text;

    public Experience() {
    }

    public String getExperience_text() {
        return experience_text;
    }

    public void setExperience_text(String experience_text) {
        this.experience_text = experience_text;
    }
}
