package com.cy.example.demo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Education {

    @NotNull
    @Size(min=2)
    private String education_text;

    public Education() {
    }

    public String getEducation_text() {
        return education_text;
    }

    public void setEducation_text(String education_text) {
        this.education_text = education_text;
    }
}
